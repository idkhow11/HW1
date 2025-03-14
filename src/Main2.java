import java.util.Scanner;
public class Main2 { // 초 개수 구하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요. :");

        int Age = scanner.nextInt();

        if(Age <= 0){ // 나이가 음수일 때
            System.out.println("나이는 양수로만 입력하세요.");
        }

        if(Age > 0){ // 나이가 양수일 때

        int Tens = Age / 10; // 10의 자리 숫자, 빨간 초. 입력받은 숫자가 27이면 2
        int Fives = (Age % 10) / 5; // 파란 초

        if(Age % 10 < 5){ // 한 자리수가 5 미만일 때
            int Units1 = Age % 10; // 1, 2 같은 변수명은 지양해야하나 일단은 사용
            int Sum = Tens + Fives + Units1; // 여기선 Fives가 0개 고정. 생략 가능

            System.out.println("빨간초 " + Tens + "개, " + "파란초 " + Fives + "개, "
                    + "노란초 " + Units1 + "개." + " 총 " + Sum + "개가 필요합니다.");
        }
        else { // 한 자리수가 5 이상일 때
            int Units2 = (Age % 10) - 5;  // 노란 초

            int Sum = Tens + Fives + Units2;

            System.out.println("빨간초 " + Tens + "개, " + "파란초 " + Fives + "개, "
                    + "노란초 " + Units2 + "개." + " 총 " + Sum + "개가 필요합니다.");
            }
        }
    }
} // 절차지향식으로 코딩을 해버려서 개인적으로 불만족하는 코드입니다. 객체지향으로 한번 다시 짜보는 연습도 해보겠습니다.
