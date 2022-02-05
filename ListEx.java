package 연습장;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class ListEx {

	public static void main(String[] args) {
	
		
		// LinkedList : ArrayList에 비해 데이터 추가,삭제가 용이하나 탐색 속도가 느리다
		
		
		LinkedList list = new LinkedList(); //타입 미설정 object로 선언된다
	//	LinkedList<Student> members = new LinkedList<Student>(); // student 객체만 사용가능
		LinkedList<Integer> num = new LinkedList<Integer>();
		LinkedList<Integer> num2 = new LinkedList<>(); //타입 생략 가능하지만 자주쓰지않는다
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1,2)); //생성시 값 추가
		
		list.addFirst(1); // 가장 앞에 데이터 추가
		list.addLast(2); // 가장 뒤에 데이터 추가
		list.add(3); // 뒤에 데이터 추가
		list.add(0,10); // index 0에 데이터 추가
		
	//	list.removeFirst(); // 가장 앞의 데이터 제거
	//	list.removeLast(); // 가장 뒤에 데이터 제거
		list.remove(); // 0번째 index 제거
		list.remove(1); // index 1제거
		list.clear(); // 모든 값 제거
		System.out.println(list);
		
		System.out.println("--------------------------");
		
		LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(2,4,6,8));
		ArrayList<String> arr = new ArrayList<>();  // 뒷부분 자료형은 적지않아도 무방하다
		arr.add("12");
		arr.add("125");
		
		System.out.println(arr.get(0)); // 0번째 index 값 출력
		System.out.println(arr.size()); // 담긴 개수 출력
		System.out.println(arr.contains("12")); // 값을 포함 하였는지 true false로 리턴 Linkedlist는 안된다
		System.out.println(list3.indexOf(2)); // 2가 있는 index 반환 없으면 -1 반환
		System.out.println(arr.remove("12"));  // 객체 입력시 true false 리턴
		System.out.println(arr.remove(0)); // index 입력시 삭제된 객체 리턴
		
		System.out.println("--------------------------");
		
		for (Integer i : list3) { // for문 이용한 전체 출력
			System.out.println(i);
		}
		
		String[] data = {"가","나","다"};
		LinkedList<String> list4 = new LinkedList<>(Arrays.asList(data)); // 배열로 생성가능
		ArrayList<String> list5 = new ArrayList<>(Arrays.asList("라","마","바")); // 자료형으로 생성가능
		
		for (String i : list5) { // for문 이용한 전체 출력
			System.out.print(i);
		}
		list4.sort(Comparator.naturalOrder()); // 오름차순 정렬
		list4.sort(Comparator.reverseOrder()); // 내림차순 정렬
		
		System.out.println(list4);
	}

}
