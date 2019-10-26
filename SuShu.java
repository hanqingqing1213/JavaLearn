package package1011;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

//寻找输入数值内所有的素数
public class SuShu {
	
	public int  inputNum() {
		System.out.print("输入最大值：");
		Scanner scanner = new Scanner(System.in);
		int maxNum = scanner.nextInt();
		return maxNum;
	}
	
	public void selectNum(int maxNum) {
		int a;
		for (int i = 1; i <= maxNum; i++) {
			a = 1;
			for (int j = 2; j <= i/2; j++) {
				if ((i%j) == 0) {
					a = 0;
					break;
				}
				
			}
			if (a == 1) {
				System.out.println(i);
				
				
				
			}
			
			
		}
		
		
	}
	public static void main(String args[]) {
		SuShu shu = new SuShu();
		int maxNum = shu.inputNum();
	//	ArrayList<Integer> list = new ArrayList<Integer>();
		shu.selectNum(maxNum);
	//	for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
		}
	}

