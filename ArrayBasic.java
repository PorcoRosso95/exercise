package 연습장;

public class ArrayBasic {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 배열 참조변수만 선언
		int[] arr;
		
		// 배열 선언과 크기 할당
		int[] arr1 = new int[5];
		String[] arrS = new String[5];

		// 배열의 길이 출력
		System.out.println("arr.length = "+arr1.length);
		
		// 배열의 값 출력
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1 ["+i+"] = "+arr1[i]);
		}
		// 배열 선언 초기화  
		int[] arr2 = {1,2,3,4,5}; 
		
		// 배열 선언 후 초기화
		int[] arr3; 
		arr3 = new int[] {2,3,4,5,6};
		
		//for문 이용한 배열 초기화
		for(int i=0;i<arr3.length;i++) {
			arr3[i]= i*10+50;
			System.out.println("arr3 ["+i+"] = "+arr3[i]);
		}
		
	}
}

