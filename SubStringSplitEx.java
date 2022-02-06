package 연습장;

public class SubStringSplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// substring 예제
	
		String str = "abcdefg";
		str.substring(3); // 3부터 끝까지 출력
		str.substring(1,3); // 1부터 3앞까지 출력
	
		// 마지막 3글자 출력
		String result = str.substring(str.length()-3, str.length()); 
		System.out.println(result); // 결과 efg
		
		// 특정문자 이후의 문자열 출력 
		String result1 = str.substring(str.lastIndexOf("e")+1); 
		System.out.println(result1);
		
		// 특정부분만 출력
		String target = "bc";
		int target_num = str.indexOf(target);
		String result3 = str.substring(target_num,(str.substring(target_num).indexOf("f")+target_num));
		System.out.println(result);
		 
				// split 예제
	
		// 특정 문자열로 잘라서 배열에 넣기
		String str2 = "";
		for(int i=0;i<5;i++) {
			str2 += i+"#";
			}
		String[] array = str2.split("#");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]); // 01234 출력
			}
		System.out.println();
		
		String str3 = "A,B,C,D";
		String[] array2 = str3.split(",");
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]); // ABCD 출력
			}
		System.out.println();
		
		// 공백(" ")으로 문자열 잘라서 배열에 넣기
		String str4 = "동해물과 백두산이 마르고 닳도록 하나님이 보우하사 우리나라 만세";
		String[] array3 = str4.split(" ");
		for(int i=0;i<array3.length;i++) {
			System.out.println(array3[i]);
			}
	
	}

}

