import java.util.*;
public class Exercise06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		a = s.nextInt();
		System.out.print("请输入第二个整数：");
		b = s.nextInt();
		s.close();
		
		Deff de = new Deff();
		m = de.deff(a,b);
		int n = a * b / m;
		
		System.out.println("最大公约数为：" + m );
		System.out.println("最小公倍数为：" + n);
	}
}

class Deff{
	public int deff(int x, int y){
		int t;
	    if(x < y) {
	    	t = x;
	    	x = y;
	    	y = t;
	    }  
	    while(y != 0) {
	    	if(x == y) return x;
	    	else {
	    		int k = x % y;
	    		x = y;
	    		y = k;
	    	}
	   }
	   return x;

	}
	
}