package pointer;

import java.awt.Robot;
import java.awt.event.InputEvent;

//Robot 사용 좌표 이동
public class Pointer01 {

	public static void main(String[] args) {
		try {
			Robot r=new Robot();
			r.mouseMove(1430,570);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseMove(1430,770);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseMove(1630,770);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseMove(1230,770);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseMove(1430,770);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseMove(1430,970);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseMove(1530,770);
//			r.mouseMove(1230,770);
//			r.mouseMove(1430,770);
//			r.mouseMove(1430,970);
//			r.mouseMove(1830,970);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("fail");
		}
	}

}
