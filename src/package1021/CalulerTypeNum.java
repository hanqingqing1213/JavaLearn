package package1021;

import java.util.Scanner;

//输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。

public class CalulerTypeNum {
	public void caluler(String string) {
		int k = 0;  //空格
		int s = 0;  //数字
		int z = 0;  //字母
		int q = 0;  //其它字符
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
		System.out.println("空格有："+k+"个");
		System.out.println("数字有："+s+"个");
		System.out.println("字母有："+z+"个");
		System.out.println("其它字符有："+q+"个");
	}
	
	public static void main(String[] args) {
		System.out.println("请输入一行字符：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		CalulerTypeNum calulerTypeNum = new CalulerTypeNum();
		calulerTypeNum.caluler(str);
		scanner.close();
	}
}
