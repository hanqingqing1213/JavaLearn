package package1016;

import java.util.Scanner;

/*���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ
*/

public class Test {
	public void mainExecute(int num) {
		if(num>=90) {
			System.out.println("�ȼ�ΪA");
		}else if (num>=60 && num<90) {
			System.out.println("�ȼ�ΪB");
		}else {
			System.out.println("�ȼ�ΪC");
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Input��");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		test.mainExecute(num);
		scanner.close();
		
		
	}
}
