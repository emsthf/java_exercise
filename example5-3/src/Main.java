public class Main {
    public static void main(String[] args) {
        int[] score;
        score = new int[10];
        for(int i=0; i < 10; i++) {
            score[i] = (int)(Math.random() * 101);   // 배열에 1~100의 랜덤 수를 넣는다
        }

        for(int value : score) {   // for each 반복문. score가 들어온 만큼 반복. score 배열의 길이가 10이므로 10번 반복
            System.out.println(value);
        }
        System.out.println("==================");

        int[][] box;   // 이중 배열. 좌표나 표처럼 생겼다고 이해하면 편함
        box = new int[5][5];
        int num = 1;
        for(int i=0; i< box.length; i++) {   // 박스의 가로 길이만큼 반복
            for(int j=0; j<box[i].length; j++) {   // 박스의 세로 길이만큼 반복
                box[i][j] = num++;
            }
        }

        for(int i=0; i<5; i++) {
            for(int j=0; j < 5; j++) {
                System.out.printf("%2d ", box[i][j]);   // C언어의 출력 문법. printf에 2자리수로 출력하겠다는 뜻
//                System.out.println(box[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("********************");

        for(int i=0; i<5; i++) {
            for(int j=0; j < 5; j++) {
                System.out.printf("%2d ", box[j][i]);   // C언어의 출력 문법. printf에 2자리수로 출력하겠다는 뜻
//                System.out.println(box[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("** 원본 표를 90도 돌렸을 때 **");

        for(int i=0; i<5; i++) {
            for(int j=0; j < 5; j++) {
                System.out.printf("%2d ", box[j][4-i]);   // C언어의 출력 문법. printf에 2자리수로 출력하겠다는 뜻
//                System.out.println(box[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("** 원본 표를 180도 돌렸을 때 **");

        for(int i=0; i<5; i++) {
            for(int j=0; j < 5; j++) {
                System.out.printf("%2d ", box[4-i][4-j]);   // C언어의 출력 문법. printf에 2자리수로 출력하겠다는 뜻
//                System.out.println(box[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("** 원본 표를 270도 돌렸을 때 **");

        for(int i=0; i<5; i++) {
            for(int j=0; j < 5; j++) {
                System.out.printf("%2d ", box[4-j][i]);   // C언어의 출력 문법. printf에 2자리수로 출력하겠다는 뜻
//                System.out.println(box[i][j] + " ");
            }
            System.out.println();
        }
    }
}
