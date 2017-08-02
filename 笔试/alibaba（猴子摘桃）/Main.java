import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while(in.hasNext()) {
			n = in.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			/*System.out.println(n);
			for(int i = 0; i < n; i++) {

				System.out.println(arr[i]);
			}*/
			System.out.println(mostPe(arr, n));
		}

	}

	public static int mostPe(int[] array, int n) {
		int[] count = new int[n];
		for(int i = 0; i < n; i++) {
			int base = array[i];
			count[i] = 1;
			for(int j = i + 1; j < n; j++) {
				if(array[j] > base) {
					count[i]++;
					base = array[j];
				}
			}
		}
		int max = 0;
		for(int i = 0; i < n; i++) {	
			if(count[i] > max) {
				max = count[i];
			}
		}
		return max;
	}
}