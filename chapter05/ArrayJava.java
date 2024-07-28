package chapter05;


/// 배열 >>> 시험 x 
public class ArrayJava {
	public static void main(String args[]) {
		// 변수
		//  - 하나의 값을 저장할 수 있는 메모리 공간
		
		// 배열
		//  - 동일한 타입의 값들을 다수 저장할 수 있는 객체
		//  - 값마다 인덱스를 부여함(0부터 시작)
		//  - 확장 불가!(4개의 값을 넣는 배열 생성)
		//  - 메모리 비효율적으로 사용!
		//    ㄴ 100칸짜리 배열을 생성하고 값을 2개만 넣음
		//       98칸은 유휴시간!
		//  - 컬렉션 프레임워크 사용! (LIST, MAP)
		
		// 배열 기본 문법
		// int[] num_array;
		// int num_array[100];
		//배열 생성및 초기화
		int num_array[] = {1, 2, 3, 4, 5};  // 5칸짜리
		int no_array[] = new int[10]; // 10칸
		no_array[9] = 200; // 배열 값 넣음
		System.out.println(no_array[9]);   // 배열 값 출력
		// no_array.length; // 배열의 길이 알려줌
		
		
		// TIP
		//String name; // 권장하지 않음!
		//System.out.println(name);
		
		//String name = ""; // 권장 
		
	}
}
