import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		String name = sc.next();
		System.out.println("�ֹι�ȣ�� �Է��Ͻÿ�");
		String code = sc.next();
		char ch = code.charAt(7);
		
		String gen = "��";
		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			System.out.println("�ٽ� �Է��Ͻÿ�");
		}else if(ch=='1'||ch=='3'||ch=='5'){
			gen ="��";
		}
		System.out.println(name+":"+code+":"+gen);
	}
}