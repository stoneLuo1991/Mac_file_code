import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(lengthOfWords(str));
    }
    
    public static int lengthOfWords (String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for(int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] != ' ') {
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}