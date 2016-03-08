package prob2;

import java.util.Scanner;

public class Prob2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int price = sc.nextInt();
		System.out.println();
		
		int count = 0;
		int rest = price;
		
		Money mn = new Money();
		
		mn.calculate(50000,rest,"오만원");
		mn.calculate(10000,rest,"만원");
		mn.calculate(5000,rest,"오천원");
		mn.calculate(1000,rest,"천원");
		mn.calculate(500,rest,"오백원");
		mn.calculate(100,rest,"백원");
		mn.calculate(50,rest,"오십원");
		mn.calculate(10,rest,"십원");
		mn.calculate(1,rest,"일원");
		
		
		
//		if(price>=50000){
//			count = price/50000;
//			rest = price - count * 50000;
//			System.out.println("오만원권 : " + count + "매");
//		}
//		
//		if(rest>=10000){
//			count = rest/10000;
//			rest = rest - count * 10000;
//			System.out.println("만원권 : " + count + "매");
//		}
//		
//		if(rest>=5000){
//			count = rest/5000;
//			rest = rest - count * 5000;
//			System.out.println("오천원권 : " + count + "매");
//		}
		
		
		
	}
	
}

