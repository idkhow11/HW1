import java.util.Scanner;

public class Main3 { // 정수 10개 입력받고 각 자리수 합이 9인 숫자 출력
    public static void main(String[] args) {
    // 예문에서는 3자리수까지이나, 4자리수 이상이 된다면?

        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[10];

        System.out.println("양의 정수 10개 입력하세요. : ");
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print("자리수의 합이 9인 것은 "); // 줄 바꿈을 방지하기 위해 println이 아닌 print
        for(int num :intArray) { // num 은 intArray[] 반복
            if (everySum(num) == 9) { // 자릿수합이 9
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }

    public static int everySum(int num){ // 자리수 합을 구하는 메서드
        int sum = 0;
        while(num > 0){
            sum += num % 10; // num을 10으로 마지막 자리수를 sum에 더함
            num /= 10; // 나눈 뒤 자리 이동
        }
        return sum;
    }
}
