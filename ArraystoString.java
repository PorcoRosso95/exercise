package 연습장;

import java.util.Arrays;

public class ArraystoString {

	public static void main(String[] args) {

		int [] a = {1,2,3};
		int [][] b = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Arrays.toString 1차원 배열만 출력가능
		System.out.println(Arrays.toString(a));
			
		//2차원 배열이상은 Arrays.deepToString 로 출력 가능
		System.out.println(Arrays.deepToString(b));
	
	
	}
		

	}


