package chapter3.example;

/**
 * ����ת��������
 * 
 * @author YJP
 *
 */
public class Casting3_15 {

	public static void main(String[] args) {
		int i = 200;
		long lng = (long) i;
		lng = i;
		long lng2 = (long) 200;
		lng2 = 200;
		i = (int) lng2;
	}

}
