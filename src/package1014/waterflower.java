package package1014;

/*��ӡ�����еġ�ˮ�ɻ���������ν��ˮ�ɻ�������ָһ����λ����
���λ���������͵��ڸ����������磺153��һ����ˮ�ɻ���������Ϊ153=1�����η���5�����η���3�����η���*/


public class waterflower {
	public void mainExecute() {
		int num1; 	//��λ��
		int num2; 	//ʮλ��
		int num3;	//��λ��
		for (int i = 100; i < 1000; i++) {
			num1 = i/100;
			num2 = (i/10)%10;
			num3 = i%10;
			if (Math.pow(num3, 3)+Math.pow(num2, 3)+Math.pow(num1, 3) == i) {
				System.out.println(i);
			}
		}
	}
	
	//������
	public static void main(String[] args) {
		waterflower w1 = new waterflower();
		w1.mainExecute();
	}
}
