package pointer;
//ÁÂÇ¥ È®ÀÎ
import java.awt.MouseInfo;
import java.awt.PointerInfo;

public class Pointer00 {

	public static void main(String[] args) {
		PointerInfo p=MouseInfo.getPointerInfo();
		while(true) {
			p=MouseInfo.getPointerInfo();
			System.out.println(p.getLocation());
			System.out.println(p.getLocation().x);
			System.out.println(p.getLocation().y);
		}
	}

}
