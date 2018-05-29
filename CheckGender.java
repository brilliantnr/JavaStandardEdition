import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		String name = sc.next();
		System.out.println("주민번호를 입력하시오");
		String code = sc.next();
		char ch = code.charAt(7);
		
		String gen = "여";
		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			System.out.println("다시 입력하시오");
		}else if(ch=='1'||ch=='3'||ch=='5'){
			gen ="남";
		}
		System.out.println(name+":"+code+":"+gen);
	}
}