import java.util.Scanner;
public class GradeReport{
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

		int avg = (k+e+m)/3;
		String grade = "F";

		if(avg >= 90){
			grade = "A";
		}else if(avg >= 80){
			grade = "B";
		}else if(avg >= 70){
			grade = "C";
		}else if(avg >= 60){
			grade = "D";
		}

		System.out.println(name+"[���] " + avg +" [����] " + grade );
	}
}

