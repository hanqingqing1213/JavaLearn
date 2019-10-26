package package1023;

import java.util.Scanner;

//输入某年某月某日，判断这一天是这一年的第几天？

public class ExeCountDay {
	public void jiSuan(Integer year,int month,int day) {
		int monthday1[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int monthday2[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		int totalday = 0;
		//闰年
		if ((year%400==0)||(year%4==0&&year%100!=0)) {
			for (int i = 0; i < month-1; i++) {
				totalday = totalday + monthday2[i];
			}
			totalday = totalday+day;
			System.out.println("该天为这一年的第"+totalday+"天");
		}else {
			for (int i = 0; i < month-1; i++) {
				totalday = totalday + monthday1[i];
			}
			totalday = totalday+day;
			System.out.println("该天为这一年的第"+totalday+"天");
		}
	}
	public static void main(String[] args) {
		System.out.print("输入要查询的年份：");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("月份：");
		int month = scanner.nextInt();
		if (month<0 || month >12) {
			System.out.println("月份错误！");
		}else {
			System.out.println("哪天：");
			int day = scanner.nextInt();
			ExeCountDay exeCountDay = new ExeCountDay();
			exeCountDay.jiSuan(year, month, day);
			
		}
		
		
	}
}
