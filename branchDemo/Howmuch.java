import java.util.Scanner;
public class Howmuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�󸶿���?");
		
		int n1 = sc.nextInt();
		System.out.println(n1+"���Դϴ�");
		System.out.println("� �帱���");

		int n2 = sc.nextInt();
		System.out.println(n2+"�� �ּ���");

		int n3 = n1 * n2;
		System.out.println("�� �ݾ��� "+n3 +"�� �Դϴ�.");
		System.out.println("��ο� ����ּ���");
		System.out.println("�� �ۼ�Ʈ DC �ұ��?");	

		int n4 = sc.nextInt();
		String result = "�� �Ⱦƿ�.";

		if(n4 < 10){
			result = n3*(100-n4)/100 + "�� �Դϴ�";
		} 
		System.out.println(result);
	}
}