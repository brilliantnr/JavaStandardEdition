import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ش� ���� ������ ���� �˷��帳�ϴ�. \n ���� �Է��Ͻÿ�");
		int month = sc.nextInt();
		int end = 1;

		switch(month){
			case 2 : end = 28 ; break;
			case 4 : end = 30 ; break;
			case 6 : end = 30 ; break;
			case 9 : end = 30 ; break;
			case 11 : end = 30 ; break;
			default: end = 31 ; break;
		}

		System.out.println(month+"�� "+end+"�� �Դϴ�.");

	}
}