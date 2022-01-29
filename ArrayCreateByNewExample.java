package ezen;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// arr1 : 참조변수 : 주소를 저장한다,stack에 할당
		//정수배열 3개 heap메모리에 할당된다 그 메모리의 첫번째 주소를 arr1저장
		int [] arr1= new int [3];
		for(int i = 0 ;i <3;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		int a;
		System.out.println("배열의 합="+add(new int[] {1,2,2,3,4,1,1,23,3,4}));
		System.out.println("배열의 합="+add(new double[] {1.2,2.2,2,3,4,1,1,23,3,4}));
		System.out.println("a+b="+add(20,20));
	}
	//class 이름. 뒤에 있는 필드나 메소드는 static 정의
	//배열의 합 구하는 메소드 add 두개 : method overloading(메소드 중복)
	//메소드 중복시 매개변수의 타입에 가장 맞는 메소드가 호출된다.
	//매개변수의 개수와 타입이 같으면 동일한 메소드로 인식한다
	 public static int add(int [] scores) {
		int sum = 0;
		for (int i = 0;i<scores.length;i++)sum+=scores[i];
		return sum;
		
	 }
	public static double add(double[]scores) {
		double sum=0;
		for (int i = 0;i<scores.length;i++)sum+=scores[i];
		return sum;
	}
	/*public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int e) {
		return a+b;
	}
	*/public static double add(double a,double b) {
		return a+b;
	}
}
