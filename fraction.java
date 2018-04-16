/**
 * Created by sky on 16/4/18.
 * www.github.com/aakashjaiswal1
 * aakashjaiswal@hotmail.co.in
 * aakashjaiswal.in@gmail.com
 * people die if they are killed
 */
public class fr {
    public static void main(String[] args) {
        Fraction f=new Fraction(2,3);
        f.subtract(new Fraction(4,3));
        System.out.println(f.num);
        System.out.println(f.denom);
    }
    static class Fraction{
        long num;
        long denom;
        Fraction(long num , long denom){
            this.num=num;
            this.denom=denom;
        }
        void add(Fraction f){
            long num=f.num;
            long denom=f.denom;
            long new_denom=denom*this.denom;
            long new_num=(new_denom/denom)*num+(new_denom/this.denom)*this.num;
            long gcd=gcd(new_denom,new_num);
            this.num=new_num/gcd;
            this.denom=new_denom/gcd;
        }

        void subtract(Fraction f){
            long num=f.num;
            long denom=f.denom;
            long new_denom=denom*this.denom;
            long new_num=-(new_denom/denom)*num+(new_denom/this.denom)*this.num;
            long gcd=gcd(new_denom,Math.abs(new_num));
            this.num=new_num/gcd;
            this.denom=new_denom/gcd;
        }
    }
    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }
}
