import java.util.Scanner;

public class Main {
    static int add(int a, int b) {
        // static이 붙는 이유?
        // 아래 코드에 add 메소드 안에 add 메소드가 파라미터로 들어있는데
        // 파라미터의 add 메소드는 연산이 처리되기 전에는 무슨 값이 나오는지 알 수 없기 때문에
        // 정적인 static이 붙어야만 작동한다
        return a + b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 4개를 입력해 주세요.");
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.print("입력받은 네 수의 합 : ");
        System.out.println( add( add(a,b), add(c,d) ) );   // 내부에 파라미터로 들어있는 add가 먼저 처리됨

        System.out.print("입력받은 네 수의 곱 : ");
        System.out.println( mul(mul(a,b), mul(c,d)) );

        System.out.print("입력받은 네 수의 나눗셈 : ");
        System.out.println( div( div(a,b), div(c,d) ));
        // 나눗셈은 순서가 중요하기도 하고 0으로 나누면 안되기 때문에 오류가 발생할 수 있다
    }
}
