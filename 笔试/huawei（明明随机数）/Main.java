import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sort(arr);
            // print(arr);
            int numOfRep = numOfRep(arr);
            // System.out.println(numOfRep);
            int[] result = new int[n - numOfRep];
            delRep(arr, result);
            // HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
            // Iterator it = set.iterator();
            // while (it.hasNext()) {
            //     System.out.println(it.next());
            // }    
            print(result);
        }
    }

    public static void sort(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int numOfRep(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length -1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

   public static void delRep(int[] arr, int[] a) {
       // 关于删除这里做了好久好久都没有AC真是TM头疼
       // 比较重复时，不要再arr中自己比较，可用a中已存在的和arr中的比较
       // 这样也许就不会下标越界啦 嗯 现在试试。累死老子了

       // 遍历arr
       int j = 0;
       a[0] = arr[0];
       for(int i = 1; i < arr.length; i++) {
           if(arr[i] == arr[i - 1]) {
                continue;
           }else {
                a[++j] = arr[i];
           }
       }
   }
}