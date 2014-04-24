
public class Exercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h = 100, s = 100;
		for(int i = 1; i < 10; i++){
			s += h;
			h = h / 2;
		}
		System.out.println("经过路程：" + s);
		System.out.println("第十次反弹高度：" + h);
	}

}
