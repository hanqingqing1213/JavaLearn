package package1015;

import java.util.ArrayList;
import java.util.Scanner;

/*将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5*/

public class Test {
	public void mainExecute(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print(num +"=");
		for (int i = 2; i < num; ) {
			if (num%i == 0) {
				num = num/i;
				System.out.print(i+"*");
			//	list.add(i);
			}else {
				i++;
			}
			if (i == num) {
				//list.add(num);
				System.out.print(num);
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Input：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		test.mainExecute(num);
		scanner.close();
	}
}
