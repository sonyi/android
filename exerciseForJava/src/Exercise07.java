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
		System.out.print("请输入一串字符:");
		String s = sc.nextLine();
		sc.close();
		ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(ch[i] >= '0' && ch[i] <= '9') digital++;
			else if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) character++;
			else if(ch[i] == ' ') blank++;
			else other++;
			
		}
	     System.out.println("数字个数: " + digital);
	     System.out.println("英文字母个数: " + character);
	     System.out.println("空格个数: " + blank);
	     System.out.println("其他字符个数:" + other );

		

	}

}
