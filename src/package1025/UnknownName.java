package package1025;

import java.util.Scanner;

/*求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。
例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；*/
public class UnknownName {
	public void exeCount(int num,int times) {
		int replacenum = 0;
		int num1[] = new int[100];
		int total = 0;
	
		for (int i = 0; i < times; i++) {
			replacenum = (int) (replacenum +(Math.pow(10, i)*num));
			num1[i] = replacenum;
		}
		for (int i = 0; i < times; i++) {
			total = total + num1[i];
			if (i != times-1) {
				System.out.print(num1[i]+"+");
			}else {
				System.out.print(num1[i]+"="+total);
			}
		}
	
		
	}
	
	public static void main(String[] args) {
		UnknownName unknownName = new UnknownName();
		System.out.println("输入你想算的数字：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("输入你想算的次数：");
		int times = scanner.nextInt();
		unknownName.exeCount(num, times);
		scanner.close();
	}
}
