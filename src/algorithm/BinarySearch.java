package algorithm;


public class BinarySearch {
    public static void main(String[] args){
        int[] data = {1,2,3,4,5,6,7,8,9,10,12,15};

        int res = binarySearch(data, 9);

        System.out.println("binarySearch result : " + res);

        int res1 = recursiveBinarySearch(data,0,15, 9);

        System.out.println("recursiveBinarySearch result : " + res1);

    }

    static int binarySearch(int a[], int x){
        int p = 0;
        int r = a.length -1;

        while(p<=r){
            int q = (p+r)/2;
            if(x < a[q]){
                r = q-1;
            } else if(x > a[q]){
                p = q+1;
            } else {
                return q;
            }
        }

        return -1;
    }

    static int recursiveBinarySearch(int a[], int p, int r, int x){
        if(p > r){
            return -1;
        } else {
            int q = (p+r)/2;
            if(a[q] == x){
                return q;
            } else if(a[q] > x){
                return recursiveBinarySearch(a, p, q-1, x);
            } else {
                return recursiveBinarySearch(a, q+1, r, x);
            }
        }
    }
}
