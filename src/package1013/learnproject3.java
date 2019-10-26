package package1013;

import java.util.Scanner;

/*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？*/                                                                                                                                                                                           

public class learnproject3 {
	public int doCount(int month) {
		int[] count = new int[100];
		//兔子成长期，第一个月仅有一对
		count[0] = 1;
		//兔子成长期，第二个月仅有一对
		count[1] = 1;
		//开始计算兔子对数，斐波那契数列
		for (int i = 0; i < count.length-2; i++) {
			count[i+2] = count[i]+count[i+1];
		}
		
		return count[month-1];
	}
	public static void main(String[] args) {
		learnproject3 learnproject3 = new learnproject3();
		System.out.println("请输入要查询的月份：");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		if (month >100) {
			do {
				System.out.println("暂仅支持查看100月内,请重新输入：");
				month = scanner.nextInt();
			} while (month>100);
			if (month <=100) {
				System.out.println(learnproject3.doCount(month));
			}
		}else {
			System.out.println(learnproject3.doCount(month));
		}
	}
}
