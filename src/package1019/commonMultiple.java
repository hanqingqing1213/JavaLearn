package package1019;

import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.Scanner;

//������������С������

public class commonMultiple {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	public void searchZhiyinShu(int num1,int num2) {
		
		//���һ������������
		for (int i = 2; i < num1; ) {
			if (num1%i == 0) {
				list1.add(i);
				num1 = num1/i;
				
			}else {
				i++;
			}
			/*
			 * if (i == num1) { list1.add(i); }
			 */
		}
		list1.add(num1);
	
		
		//��ڶ�������������
		for (int i = 2; i < num2; ) {
			if (num2%i ==0) {
				list2.add(i);
				num2 = num2/i;
				
			}else {
				i++;
			}
		}
		list2.add(num2);
		
		
	}
	
	//��������������С������
	public void exeCommonMultiple() {
		int total = 1;
		int j;
		for (int i = 0; i < list1.size(); ) {
			for (j = 0; j < list2.size();) {
				//���list1��ֵ=list2��ֵ����˺�remove��list1��list2
				if (list1.get(i) == list2.get(j)) {
					total = total*list1.get(i);
					list2.remove(j);
					list1.remove(i);
					break;
				}else {
					//���list1��ֵ��list2��ֵ����ȣ�list2�ı���˳��+1
					j++;
					
				}
				//���j=list2�ĳ��ȣ�˵��list1�ĵ�ǰֵ������list2�б��ڵ�ֵ����list.get(0)!=list.get();
				if (j == list2.size()) {
					total = total*list1.get(0);
					list1.remove(0);
					//list2.remove(0);
				}
				
				
			}
			//list2��ֵ����remove����list1���������������
			if (list2.size() == 0&&list1.size()!=0) {
				total = total*list1.get(i);
				i++;
			}
			
		}
		//list1��ֵ����remove��list2����ֵ�����
		if (list1.size() == 0) {
			for (int k = 0; k < list2.size(); k++) {
				total = total*list2.get(k);
			}
		}
		
		
		System.out.println("��С������Ϊ��"+total);
	}
	public static void main(String[] args) {
		commonMultiple cMultiple = new commonMultiple();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input num1:");
		int num1 = scanner.nextInt();
		System.out.println("Input num2:");
		int num2 = scanner.nextInt();
		cMultiple.searchZhiyinShu(num1, num2);
		cMultiple.exeCommonMultiple();
	}
}
