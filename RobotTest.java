package org.AFKER.Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTest {

	public static void Robot() {
		try {
			Robot robot = new Robot();
			System.out.println("어서 움직여라 애송이!");
			robot.mouseMove(100, 400);
			for(int i = 0; ;i++) {
			robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
			robot.delay(1);
			}
			//robot.keyRelease(KeyEvent.VK_J)
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Run!");
		System.exit(0);
	}

}
