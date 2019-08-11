package chapter3.example;

/**
 * 类型转换操作符
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
