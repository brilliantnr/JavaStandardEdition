import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("BMI�� �Է��Ͻÿ�");
		double bmi = sc.nextDouble();
		String result = "";
		if(bmi<18.5){
			result = "��ü��";
		}else if(bmi>=18.5 && bmi<23){
			result = "����";
		}else if(bmi>=23 && bmi<25){
			result = "�� ���ܰ�";
		}else if(bmi>=25 && bmi<30){
			result = "1�ܰ� ��";
		}else if(bmi>=30 && bmi<35){
			result = "2�ܰ� ��";
		}else{
			result = "3�ܰ� ��";
		}
		
		System.out.println(result);
	}
}