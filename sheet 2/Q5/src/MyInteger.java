
public class MyInteger {
    private int value ;
    MyInteger () {}
    MyInteger(int x){
        this.value=x;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        int x = this.value;
        if (x % 2 == 0 )
            return true;
        return false;
    }
    public boolean isOdd(){
        int x = this.value;
        if (x % 2 != 0 )
            return true;
        return false;
    }
    public boolean isPrime(){
        int x = this.value/2 ;
        if ((this.value==0)||(this.value==1))
            return false;
        else {
            for (int i = 2; i <= x; i++) {
                if (this.value % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static boolean isEven(int num){
        if (num % 2 == 0 )
            return true;
        return false;
    }
    public static boolean isOdd(int num){
        if (num % 2 != 0 )
            return true;
        return false;
    }
    public static boolean isPrime(int num){
        int x = num/2 ;
        if ((num==0)||(num==1))
            return false;
        else {
            for (int i = 2; i <= x; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static boolean isEven(MyInteger x){
        boolean z = x.isEven();
        return z;
    }
    public static boolean isOdd(MyInteger x){
        boolean z = x.isOdd();
        return z;
    }
    public static boolean isPrime(MyInteger x){
        boolean z = x.isPrime();
        return z;
    }
    public boolean equals(int x) {
        if (x == value)
            return true;
        return false;
    }
    public boolean equals(MyInteger x) {
        if (x.getValue() == this.value)
            return true;
        return false;
    }
}
class Main{
    public static void main(String[] args) {
        MyInteger A=new MyInteger(10);
        MyInteger D=new MyInteger(7);
        int B= 10;
        int C= 5;
        int x= A.getValue();
        int y= D.getValue();
        boolean aeven = A.isEven();
        boolean Aodd =A.isOdd();
        boolean Aprime =A.isPrime();
        boolean Deven = D.isEven();
        boolean Dodd =D.isOdd();
        boolean Dprime =D.isPrime();
        boolean Beven = MyInteger.isEven(B);
        boolean BOdd =MyInteger.isOdd(B);


    }

}
