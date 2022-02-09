package 연습장;

import java.util.*;


public class ArrayListEx {

	public static void main(String[] args) {
		
					//ArrayList 선언
		
		ArrayList list = new ArrayList();//타입 미설정 Object로 선언된다.
	//	ArrayList<Student> members = new ArrayList<Student>();//타입설정 Student객체만 사용가능
		ArrayList<Integer> num = new ArrayList<Integer>();//타입설정 int타입만 사용가능
		ArrayList<Integer> num2 = new ArrayList<>();//new에서 타입 파라미터 생략가능
		ArrayList<Integer> num3 = new ArrayList<Integer>(10);//초기 용량(capacity)지정
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//생성시 값추가

					//ArrayList 값추가
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3); //값 추가
		list3.add(null); //null값도 add가능
		list3.add(1,10); //index 1에 10 삽입
		
/*
 * 		ArrayList<Student> members = new ArrayList<Student>(); Student student = new
 * 		Student(name,age); members.add(student); members.add(new Member("홍길동",15));
 */		
					//ArrayList 값삭제
		
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		list4.remove(1);  //index 1 제거
		list4.clear();  //모든 값 제거
		
					//ArrayList 크기구하기
		
		ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(list5.size()); //list 크기 : 3
		
					//ArrayList 값 출력
		
		ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(1,2,3));

		System.out.println(list6.get(0));//0번째 index 출력
				
		for(Integer i : list6) { //for문을 통한 전체출력
		    System.out.println(i);
		}

		Iterator iter = list6.iterator(); //Iterator 선언 
		while(iter.hasNext()){//다음값이 있는지 체크
		    System.out.println(iter.next()); //값 출력
		    
		    		//ArrayList 값 검색
		    
	    ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(1,2,3));
	    System.out.println(list7.contains(1)); //list에 1이 있는지 검색 : true
	    System.out.println(list7.indexOf(1)); //1이 있는 index반환 없으면 -1
	}
	}

}
