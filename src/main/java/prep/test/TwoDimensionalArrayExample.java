package prep.test;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		int[][] arr = {{5,2,9},{4,6,8}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
