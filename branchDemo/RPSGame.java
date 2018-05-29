import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("A - R,P,S.");
	String a = sc.next();
	System.out.println("B - R,P,S.");
	String b = sc.next();

	String result = "";
	if(a.equals(b)){
		result = "DRAW";
	}else if(
		(a.equals("R") && b.equals("S"))
			||
		(a.equals("P") && b.equals("R"))
			||
		(a.equals("S") && b.equals("P"))
		){
		result = "A WIN";
	}else{
		result = "B WIN";
	}
	
	System.out.println(result);
	}
}