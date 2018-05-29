import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("BMI를 입력하시오");
		double bmi = sc.nextDouble();
		String result = "";
		if(bmi<18.5){
			result = "저체중";
		}else if(bmi>=18.5 && bmi<23){
			result = "정상";
		}else if(bmi>=23 && bmi<25){
			result = "비만 전단계";
		}else if(bmi>=25 && bmi<30){
			result = "1단계 비만";
		}else if(bmi>=30 && bmi<35){
			result = "2단계 비만";
		}else{
			result = "3단계 비만";
		}
		
		System.out.println(result);
	}
}