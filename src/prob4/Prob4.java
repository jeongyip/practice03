package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;
        int[] count = new int[intArray.length];
        
        System.out.println("숫자를 입력하세요.");

        /* 키보드에서 배열 크기만큼 입력 받아 배열에 정장하는 코드 */
        for(int i=0; i<intArray.length; i++){
        	count[i] = in.nextInt();
        }
        
        /* 배열에 저장된 정수 값 더하기 */
        sum = 0;
        for(int i=0; i<count.length; i++){
        	sum = sum + count[i];
        }
        
        double average = sum/count.length;

        /* 출력 */
        System.out.println("평균은 "+ average+"입니다.");
        
	}

}
