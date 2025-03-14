//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main { // 생일 연월일 나누기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생일을 입력하세요. : ");
        //int Year = scanner.nextInt();
        //int Month = scanner.nextInt();
        //int Day = scanner.nextInt(); // 문제는 한번에 8자리 입력이지만 이 방법은 토큰을 나눠야함

        int Birthday = scanner.nextInt();

        int Year = Birthday / 10000; // 입력 숫자 10000으로 나눌 시 연도만 남게 됨
        int Month = (Birthday / 100) % 100; // 월만 남게 됨
        int Day = Birthday % 100; // 일만 남게 됨

        System.out.println(Year + "년 " + Month + "월 " + Day + "일");
        scanner.close();
    }
}