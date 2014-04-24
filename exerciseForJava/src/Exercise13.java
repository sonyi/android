
public class Exercise13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = -100; x <= 100000; x++){
			if(Math.sqrt(x + 100) % 1 == 0){
				if(Math.sqrt(x + 268) % 1 == 0){
					System.out.print(x + "  ");
				}
			}
		}
	}

}
