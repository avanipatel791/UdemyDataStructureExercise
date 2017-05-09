package algorithm;


public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {4,5,8,88,44,5,74,12};

        int[] res = insertionSort(a);
        for (int i =0;i<res.length;i++){
            System.out.print(" - " + res[i]);
        }
    }

    public static int[] insertionSort(int[] a){
        for (int i =0; i<a.length; i++){
            int ele = a[i];
            int j = i -1;
            while (j>=0 && a[j]>ele){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ele;
        }
        return a;
    }
}
