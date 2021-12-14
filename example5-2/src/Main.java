import java.util.Scanner;

public class Main {
//    static int decimal(int x) {
//        boolean check = false;
//        for(int i=2; i < x; i++) {   // 1과 자기자신은 제외해야 하므로 반복 단계에서부터 제외
//            if(x % i != 0) {
//                System.out.println("소수입니다.");
//                check = true;
//            } else {
//                System.out.println("소수가 아닙니다.");
//                break;
//            }
//        }
//        if(check) {
//            System.out.println("소수입니다.");
//        } else {
//            System.out.println("소수가 아닙니다.");
//        }
//        return 0;
//    }


    static int de(int x) {
        boolean check = true;
        for(int i=2; i < x; i++) {
            if(x > 1) {
                if(x % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if(check) {
            System.out.println("소수");
        } else {
            System.out.println("소수가 아님");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1보다 큰 정수를 입력해 주세요.");
        int x = sc.nextInt();

        decimal(x);
    }
}
