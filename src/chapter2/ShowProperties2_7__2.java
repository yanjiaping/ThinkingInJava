package chapter2;

/**
 * 你的第一个Java程序
 * 
 * @author YJP
 *
 */
public class ShowProperties2_7__2 {

	public static void main(String[] args) {
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}

}
