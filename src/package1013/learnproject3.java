package package1013;

import java.util.Scanner;

/*��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣�*/                                                                                                                                                                                           

public class learnproject3 {
	public int doCount(int month) {
		int[] count = new int[100];
		//���ӳɳ��ڣ���һ���½���һ��
		count[0] = 1;
		//���ӳɳ��ڣ��ڶ����½���һ��
		count[1] = 1;
		//��ʼ�������Ӷ�����쳲���������
		for (int i = 0; i < count.length-2; i++) {
			count[i+2] = count[i]+count[i+1];
		}
		
		return count[month-1];
	}
	public static void main(String[] args) {
		learnproject3 learnproject3 = new learnproject3();
		System.out.println("������Ҫ��ѯ���·ݣ�");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		if (month >100) {
			do {
				System.out.println("�ݽ�֧�ֲ鿴100����,���������룺");
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
