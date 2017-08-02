  public static void delRep(int[] arr, int[] a) {
       // 关于删除这里做了好久好久都没有AC真是TM头疼
       // 比较重复时，不要再arr中自己比较，可用a中已存在的和arr中的比较
       // 这样也许就不会下标越界啦 嗯 现在试试。累死老子了

       // 遍历arr
      //arr 中后面和前面的一样时 跳过即可
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