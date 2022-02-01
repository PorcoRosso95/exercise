package 연습장;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		//arraycopy 활용
		//어디서,어디부터,어디에,어디부터,length
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if(i<newStrArray.length-1)
			System.out.print(",");
		}
		//for문 활용 배열 copy
		for(int i=0; i<oldStrArray.length; i++) {
			newStrArray[i] = oldStrArray[i];
		}
		
	}

}
