import java.util.Scanner;                                                //java>유틸중>Scanner 클래스작동
public class Font{
    public static void main(String[] args){
        System.out.print("이름을 입력하시옹");
        Scanner sc = new Scanner(System.in);                    // 문자 입력을 인자로 Scanner 생성
        String name = sc.next();
        System.out.print("안녕"+name);
    }
}