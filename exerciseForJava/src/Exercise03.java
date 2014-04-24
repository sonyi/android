
public class Exercise03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1, b2, b3;
		for(int i = 100; i <=999; i++){
			b1 = i / 100;
			b2 = (i % 100) / 10;
			b3 = i % 10;
			if(i == (b1*b1*b1 + b2*b2*b2 + b3*b3*b3)){
				System.out.println(i + "ÎªË®ÏÉÊý¡£");
			}
		}
	}

}
