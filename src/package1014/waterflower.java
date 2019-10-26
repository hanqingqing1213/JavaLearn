package package1014;

/*打印出所有的”水仙花数”，所谓”水仙花数”是指一个三位数，
其各位数字立方和等于该数本身。例如：153是一个”水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。*/


public class waterflower {
	public void mainExecute() {
		int num1; 	//百位数
		int num2; 	//十位数
		int num3;	//个位数
		for (int i = 100; i < 1000; i++) {
			num1 = i/100;
			num2 = (i/10)%10;
			num3 = i%10;
			if (Math.pow(num3, 3)+Math.pow(num2, 3)+Math.pow(num1, 3) == i) {
				System.out.println(i);
			}
		}
	}
	
	//主方法
	public static void main(String[] args) {
		waterflower w1 = new waterflower();
		w1.mainExecute();
	}
}
