
public class Exercise01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("��һ���µ����Ӷ����� 1");
		System.out.println("�ڶ����µ����Ӷ����� 1");
		int f1 = 1, f2 = 1, f, M=24;
	    for(int i=3; i<=M; i++) {
	      f = f2;
	      f2 = f1 + f2;
	      f1 = f;
	      System.out.println("��" + i +"���µ����Ӷ���: "+f2);
	    }
	}
}