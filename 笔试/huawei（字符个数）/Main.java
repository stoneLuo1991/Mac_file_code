import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ch = sc.nextLine();
		// System.out.println();
		// System.out.println(str);
		// System.out.println(ch);
		char[] chr1 = str.toCharArray();
		char[] chr2 = ch.toCharArray();
		int result = chr2NumberInChr1(chr1, chr2);
		System.out.println(result);
	}
	public static int chr2NumberInChr1(char[] a, char[] b) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] >= 'A' && a[i] <= 'Z') {
				a[i] = (char)(a[i] + 32);
			}
			if(b[0] >= 'A' && b[0] <= 'Z') {
				b[0] = (char)(b[0] + 32);
			}
			if(a[i] == b[0]) {
				count++;
			}
		}
		return count;
	}
}