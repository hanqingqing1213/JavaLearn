package package1021;

import java.util.Scanner;

//����һ���ַ����ֱ�ͳ�Ƴ���Ӣ����ĸ���ո����ֺ������ַ��ĸ�����

public class CalulerTypeNum {
	public void caluler(String string) {
		int k = 0;  //�ո�
		int s = 0;  //����
		int z = 0;  //��ĸ
		int q = 0;  //�����ַ�
		char[] str = string.toCharArray();
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				k++;
			}else if ((str[i] >= 'a' && str[i] <='z') || (str[i] >='A' && str[i] <='Z')) {
				z++;
			}else if (str[i] >= '0' && str[i]<='9') {
				s++;
			}else {
				q++;
			}
		}
		System.out.println("�ո��У�"+k+"��");
		System.out.println("�����У�"+s+"��");
		System.out.println("��ĸ�У�"+z+"��");
		System.out.println("�����ַ��У�"+q+"��");
	}
	
	public static void main(String[] args) {
		System.out.println("������һ���ַ���");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		CalulerTypeNum calulerTypeNum = new CalulerTypeNum();
		calulerTypeNum.caluler(str);
		scanner.close();
	}
}
