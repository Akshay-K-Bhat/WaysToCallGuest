public class Recursion {

    public static int callguest(int n){

        if(n<=1){
            return 1;
        }

        int individual =callguest(n-1);

        int pairs = (n-1)*callguest(n-2);

        return  individual+pairs;


    }

    public static void main(String[] args) {
         int n=3;
         System.out.println(callguest(n));

    }
}
