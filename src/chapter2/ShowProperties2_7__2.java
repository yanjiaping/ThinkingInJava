package chapter2;

/**
 * ��ĵ�һ��Java����
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
