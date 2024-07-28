package chapter09;

public class CollectionJava {
	// 컬렉션 프레임워크
	//  - 변수에 여러 개의 값을 정하는 방법
	//  - 기존방법 (Array)
	//    * 항상 사용을 안하더래도 생성된 크기만큼 유지(정적) 
	//    -> 메모리 낭비
	//    * 항상 동일한 자료형만 저장 가능
	//  -> 위의 문제점을 보완하기 위해 LIST, HASHMAP 많이 사용
	
	// 제네릭(Generic) 
	//  - 클래스 내부에서 사용할 자료형을 정의해 타입 세이프를 구현하는 기능
	//  - 유효성 체크
	
	// * 제네릭 + 컬렉션 프레임워크 = 한 쌍
	
	// LIST
	//  - Linked List 사용
	//  - 이전값 주소의 값 : 다음값 주소
	// MAP
	//  - JSON(Key:Value)
	
	//  - 게시글 1건 정보 -> MAP(번호, 제목, 작성자, 일자, 조회수, ...)
	//  - 다수의 게시글 -> LIST 
	
	/*
	LIST integerList = new ArrayList();
	integerList.add(13);  // 값 저장
	integerList.get(0);   // 값 조회
	
	Map<String, String> map = new HashMap<>();
	
	map.put("1", "체리"); // 값 저장
	map.get("1");        // 값 조회
	map.size(); 
	*/
}
