package algorithm;


public class LinearSearch {
    public static void main(String[] args){
        int[] data = {1,2,3,4,5,6,7,8,9,10,12,15};
        int res = linearSearch(data, 0, 9);

        System.out.println(" result" + res);
    }

    static int linearSearch(int a[], int i, int x){
        if(i > a.length-1){
            return -1;
        } else if(a[i] == x){
            return i;
        } else {
            System.out.println("-- index" + i);
            return linearSearch(a, i+1, x);
        }
    }
}
