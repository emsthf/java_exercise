import java.util.Scanner;

public class Main {
    static int measure(int x) {
        for(int i = 1; i <= x; i++) {   // 입력받은 수까지 1씩 증가시키면서
            if(x % i == 0) {            // 나머지가 0인 수를 구해서 출력시킨다
                System.out.println(i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        measure(x);
        // 조건부터 찾아주고(약수인 조건 : 나머지가 0)
        // 그 조건을 반복
    }
}
