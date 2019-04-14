package DataArt;

/*
cos x = 1 - x^2/2! + x^4/4! + x^6/6! +...
 */

public class CosCalculator{

    private int pow(int x, int exponent){
        int res=1;
        for (int i = 0; i<exponent; i++){
            res *=x;
        }
        return res;
    }

    private int factorial(int n) {
        int k=1;
        for (int i = 1; i<=n; i++){
            k *= i;
        }
        return k;
    }

    public double cos(int x, int n) {
        double res = 1D;
        for (int i = 1; i<=n; i++){
            res += (double)pow(-1,i)*pow(x, (2*i))/factorial(2*i);
        }
        return res;
    }

}
