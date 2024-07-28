package chapter04;

import java.util.Scanner;

// switch << 시험 x 

public class SwitchJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하실 주류를 선택하세요.");
		System.out.println("   가. 맥주");
		System.out.println("   나. 소주");
		System.out.println("   다. 양주");
		String select = sc.nextLine(); // 문자열 입력
		
		//switch~case 구문(조건문)
		switch(select) {
		    case "가":
			    System.out.println("맥주 : 9000원");
			    break;
		    case "나":
			    System.out.println("소주 : 10,000원");
			    break;
		    case "다":
		    	System.out.println("양주 : 80,000원");
		    	break;
		    default:
			    System.out.println("잘못 입력하셨습니다.");
			    break;
		}
	}
}
