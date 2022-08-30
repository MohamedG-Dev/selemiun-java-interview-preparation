package prep.test;

public class EqualsMethodAndEqualToOperatorDifference {

	public static void main(String[] args) {
		String x = new String("hello");
		String y = new String("hello");
		System.out.println(x==y);//false
		System.out.println(x.equals(y));

	}

}
