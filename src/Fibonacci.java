public class Fibonacci {

    public int fibonacci(int n){

        int last = 0;
        int next = 1;
        for( int i = 0; i< n; i++){
            int oldLast = last;
            last = next;
            next = last + oldLast;
        }return next;
    }


}


