import java.util.*;

public class Exercise07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digital = 0;
		int character = 0;
		int other = 0;
		int blank = 0;
		char ch[] = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ���ַ�:");
		String s = sc.nextLine();
		sc.close();
		ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(ch[i] >= '0' && ch[i] <= '9') digital++;
			else if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) character++;
			else if(ch[i] == ' ') blank++;
			else other++;
			
		}
	     System.out.println("���ָ���: " + digital);
	     System.out.println("Ӣ����ĸ����: " + character);
	     System.out.println("�ո����: " + blank);
	     System.out.println("�����ַ�����:" + other );

		

	}

}
