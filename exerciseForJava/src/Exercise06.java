import java.util.*;
public class Exercise06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, m;
		Scanner s = new Scanner(System.in);
		System.out.print("�������һ��������");
		a = s.nextInt();
		System.out.print("������ڶ���������");
		b = s.nextInt();
		s.close();
		
		Deff de = new Deff();
		m = de.deff(a,b);
		int n = a * b / m;
		
		System.out.println("���Լ��Ϊ��" + m );
		System.out.println("��С������Ϊ��" + n);
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