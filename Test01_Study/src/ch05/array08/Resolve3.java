package ch05.array08;

import java.util.Arrays;

public class Resolve3 {
    public static void main(String[] args) {
        // 배열 5개 할당
        int[] arrN = {8, 6, 7, 12, 1};
        System.out.print("현재 배열의 인덱스: ");
        System.out.println(Arrays.toString(arrN));

        // 새로운 배열 선언
        int[] reversedArr = new int[arrN.length];
        System.out.print("새로운 배열 선언: ");
        System.out.println(Arrays.toString(reversedArr));

        // 배열을 거꾸로 저장하고 반환된 배열을 받아옴
        int[] reArr = reverseArray(arrN);

        // 변경된 배열 출력
        System.out.println("거꾸로 저장된 배열: " + Arrays.toString(reArr));
    }

    public static int[] reverseArray(int[] arrN) {
        // 새로운 배열을 선언하여 배열을 거꾸로 저장
        int[] reversedArr = new int[arrN.length];
        System.out.print("거꾸로 저장 전 배열: ");
        System.out.println(Arrays.toString(reversedArr));

        // 배열을 거꾸로 저장
        for (int i = arrN.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arrN[i];
        }

        // 거꾸로 저장된 배열을 반환
        return reversedArr;
    }
}

