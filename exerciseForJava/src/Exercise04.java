import java.util.*;
public class Exercise04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("请键入一个正整数：  ");
		int n = s.nextInt();
		int k = 2;
		System.out.print(n + "=");
		while(k <= n){
			if(k == n) {
				System.out.println(n);
				break;
			}
			else if(n % k == 0){
				System.out.print(k + "*");
				n = n / k;
			}
			else k++;
		}
		s.close();
     }

}


