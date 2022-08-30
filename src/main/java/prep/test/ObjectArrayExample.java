package prep.test;

public class ObjectArrayExample {

	public static void main(String[] args) {
		Object[] objectArray = {"hello",'C',123,4.67,8L,1.456f,true};
		
		for(int i=0;i<objectArray.length;i++) {
			System.out.print(objectArray[i]+" ");
		}
	}

}
