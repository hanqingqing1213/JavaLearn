package package1017;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


//�������������Լ��
public class Test {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	//����������������
	public void searchZhiyinNum(int num1,int num2) {
		
		for (int i = 2; i < num1; ) {
			if (num1%i == 0) {
				list1.add(i);
				num1 = num1/i;
		//		System.out.print(i);
			}else {
				i++;
			}
			if (i == num1) {
				list1.add(i);
	//			System.out.print(i);
				
			}
		}
		for (int i = 2; i < num2; ) {
			if (num2%i == 0) {
				list2.add(i);
				num2 = num2/i;
	//			System.out.print(i);
			}else {
				i++;
			}
			if (i == num2) {
				list2.add(i);
		//		System.out.print(i);
				
			}
		}
		
	}
	public void searchSameNum() {
		
		int total=1;
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					total = total*list1.get(i);
					//���list2��ĳ��ֵ�Ѿ���list1��ֵ��ͬ�ˣ���remove���������ظ��Ƚ�
					list2.remove(j);
					break;
				}
			}
		}
		
		if (total == 1) {
			System.out.println("��������û�����Լ��");
		}else {
			System.out.println(total);
		}
		
		
	}
	public static void main(String[] args) {
		Test test = new Test();
		Scanner scanner = new Scanner(System.in);
		System.out.println("����num1��");
		int num1 = scanner.nextInt();
		System.out.println("����num2��");
		int num2 = scanner.nextInt();
		test.searchZhiyinNum(num1, num2);
		test.searchSameNum();
		scanner.close();
		
	}
	
	
}
