package package1025;

import java.util.Scanner;

/*��s=a+aa+aaa+aaaa+aa��a��ֵ������a��һ�����֡�
����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�����������ʽ�磺2+22+222=246��*/
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
		System.out.println("��������������֣�");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("����������Ĵ�����");
		int times = scanner.nextInt();
		unknownName.exeCount(num, times);
		scanner.close();
	}
}
