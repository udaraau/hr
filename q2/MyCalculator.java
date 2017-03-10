public class MyCalculator {
    
    public int power(int n, int p) throws Exception{
        
        if ( n < 0 | p < 0){
            throw new Exception("n and p should be non-negative");
        }else if ( p == 0) {
            return 1;
        }else if ( p%2 == 0) {
            int x = power(n,p/2);
            return x * x;
        }else {
            return n*power(n,p-1);
        }
    }
}