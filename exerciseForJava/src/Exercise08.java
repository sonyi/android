import java.util.*;

public class Exercise08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a, b = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("输入数字a的值：");
		a = sc.nextInt();
		System.out.print("输入相加的项数：");
		int n = sc.nextInt();
		sc.close();
		int i = 0;
		while(i < n){
			b += a;
			sum += b;
			a = a * 10;
			i++;
		}
		System.out.println(sum);

	}

}
