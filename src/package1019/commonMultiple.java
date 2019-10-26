package package1019;

import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.Scanner;

//求两个数的最小公倍数

public class commonMultiple {
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	public void searchZhiyinShu(int num1,int num2) {
		
		//求第一个数的质因数
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
	
		
		//求第二个数的质因数
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
	
	//计算两个数的最小公倍数
	public void exeCommonMultiple() {
		int total = 1;
		int j;
		for (int i = 0; i < list1.size(); ) {
			for (j = 0; j < list2.size();) {
				//如果list1的值=list2的值，相乘后remove掉list1和list2
				if (list1.get(i) == list2.get(j)) {
					total = total*list1.get(i);
					list2.remove(j);
					list1.remove(i);
					break;
				}else {
					//如果list1的值和list2的值不相等，list2的遍历顺序+1
					j++;
					
				}
				//如果j=list2的长度，说明list1的当前值不等于list2列表内的值，即list.get(0)!=list.get();
				if (j == list2.size()) {
					total = total*list1.get(0);
					list1.remove(0);
					//list2.remove(0);
				}
				
				
			}
			//list2的值都被remove完且list1还有质因数的情况
			if (list2.size() == 0&&list1.size()!=0) {
				total = total*list1.get(i);
				i++;
			}
			
		}
		//list1的值都被remove且list2还有值的情况
		if (list1.size() == 0) {
			for (int k = 0; k < list2.size(); k++) {
				total = total*list2.get(k);
			}
		}
		
		
		System.out.println("最小公倍数为："+total);
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
