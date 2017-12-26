package org.AFKER.Robot;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class Toggle {
	
	int fps = 60;
	boolean toggle = false;
	
	InputHandler input;
	JFrame frame;
	Robot robot;
	
	public static void main(String args[]) {
		new Toggle();
	}
	public Toggle() {
		run();
	}
	void init() {
		frame = new JFrame("Auto Click Bean Javan");
		frame.setVisible(true);
		frame.setSize(new Dimension(800,300));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		input = new InputHandler(frame);
	}
	void run() {
		init();
		while(true){
			long time = System.currentTimeMillis();
			if(toggle) {
				System.out.println(".");
				start();
			}
			update();
			time = (1000 / fps) -(System.currentTimeMillis() -time);
			if(time > 0 ){
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	void update() {
		if(input.isKeyDown(KeyEvent.VK_F2)) {
				System.out.println("매크로 작동");
				toggle = true;
				System.out.println("(토글:"+toggle+")");
			}
		if(input.isKeyDown(KeyEvent.VK_F3)) {
				System.out.println("매크로 중지");
				toggle = false;
				System.out.println("(토글:"+toggle+")");
			}
		}
	void start() {
		robot.delay(1);
		robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		robot.delay(1);
	}
}
