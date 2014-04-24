
public class Exercise02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 101; i < 200; i++){
			boolean b = false;
			for(int j = 2; j < Math.sqrt(i); j++){
				if(i%j == 0){
					b = false;
					break;
				}
				else{
					b = true;
				}
					
			}
			if(b){
				count++;
				System.out.println(i);
			}
		}
		System.out.println("素数的个数为：" + count);

	}

}
