import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class selectMax {
	public int[] inputNumber() {
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		scanner.close();
		return num;
	}
	
	public int getMaxNum (int num[]) {
		int a;
		for (int i = 0; i < num.length-1; i++) {
			if (num[i] >= num[i+1]) {
				a = num[i];
				num[i] = num[i+1];
				num[i+1] = a;
			}
		}
		return num[num.length-1];
	}
	
	
	public static void main(String[] args) {
		selectMax selectMax = new selectMax();
		int b = selectMax.getMaxNum(selectMax.inputNumber());
		System.out.println(b);
	}
}
