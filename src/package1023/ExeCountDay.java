package package1023;

import java.util.Scanner;

//����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿

public class ExeCountDay {
	public void jiSuan(Integer year,int month,int day) {
		int monthday1[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int monthday2[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		int totalday = 0;
		//����
		if ((year%400==0)||(year%4==0&&year%100!=0)) {
			for (int i = 0; i < month-1; i++) {
				totalday = totalday + monthday2[i];
			}
			totalday = totalday+day;
			System.out.println("����Ϊ��һ��ĵ�"+totalday+"��");
		}else {
			for (int i = 0; i < month-1; i++) {
				totalday = totalday + monthday1[i];
			}
			totalday = totalday+day;
			System.out.println("����Ϊ��һ��ĵ�"+totalday+"��");
		}
	}
	public static void main(String[] args) {
		System.out.print("����Ҫ��ѯ����ݣ�");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println("�·ݣ�");
		int month = scanner.nextInt();
		if (month<0 || month >12) {
			System.out.println("�·ݴ���");
		}else {
			System.out.println("���죺");
			int day = scanner.nextInt();
			ExeCountDay exeCountDay = new ExeCountDay();
			exeCountDay.jiSuan(year, month, day);
			
		}
		
		
	}
}
