import java.util.*;
public class Exercise05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		char grade;
		Scanner s = new Scanner(System.in);
		System.out.print("������һ���ɼ���");
		x = s.nextInt();
		grade = x >= 90 ? 'A': x > 60 ? 'B' : 'C';
		System.out.println("�ȼ�Ϊ��" + grade);
		s.close();
	}

}
