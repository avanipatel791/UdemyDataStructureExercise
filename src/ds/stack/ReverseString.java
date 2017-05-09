package ds.stack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Avani"));

    }

    static  String reverse(String s){
        char[] stringArr = s.toCharArray();

        Stack st = new Stack(stringArr.length);
        for(int i = 0 ; i<stringArr.length; i++){
            st.push(stringArr[i]);
        }

        int[] res = new int[stringArr.length];
        int i=0;
        while (!st.isEmpty()){
            res[i]=st.pop();
            i++;
        }
        System.out.println(res);
        return res.toString();
    }
}
