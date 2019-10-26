package package1016;

import java.util.Scanner;

/*利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
*/

public class Test {
	public void mainExecute(int num) {
		if(num>=90) {
			System.out.println("等级为A");
		}else if (num>=60 && num<90) {
			System.out.println("等级为B");
		}else {
			System.out.println("等级为C");
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
