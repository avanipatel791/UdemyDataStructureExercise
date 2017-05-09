package algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1,5,8,9,36,4,55,7};
        int[] myArr = selectionSort(a);

        for(int i = 0;i<myArr.length;i++){
            System.out.print(" - " + myArr[i]);
        }
    }

    public static int[] selectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j]<a[min]){
                    min = j;
                }
            }

            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        return a;
    }
}