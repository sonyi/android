
public class Test {
	public static void main(String args []){
		int num = 2;
		toBin(num);
	}
	public static void toBin(int num){
		System.out.println(trans(num, 1, 1));
	}
	
	public static String trans(int num, int base, int offset){
		char chs[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
			'a', 'b', 'c', 'd', 'e', 'f'};
		char arr[] = new char[32];
		int post = arr.length;
		if(num == 0) 
			return num+"";
		else{
			while(num != 0){
				int temp = num & base;
				arr[--post] = chs[temp];
				num = num>>>offset;
			}
			return new String(arr);
		}
		
	}


}
