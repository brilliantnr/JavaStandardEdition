import java.util.Scanner;
public class GradeReport01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� ?\n");
		
		String name = sc.next();


		System.out.print("��������?\n");
		int k = sc.nextInt();	
		if ( k<0 || k>100){
			return ;
		}
		System.out.print("��������?\n");
		int e = sc.nextInt();		
		if ( e<0 || e>100){
			return ;
		}		
		System.out.print("��������?\n");
		int m = sc.nextInt();
		if ( m<0 || m>100){
			return ;
		}
		
		String grade = "";
		int ever = (k+e+m)/30;

		switch(ever){
			case 9 : grade = "A";break;
			case 8 : grade = "B";break;
			case 7 : grade = "C";break;
			case 6 : grade = "D";break;
			default : grade = "F";break;
		}
		System.out.println(name+"[���] " + (k+e+m)/3 +" [����] " + grade );
	}
}