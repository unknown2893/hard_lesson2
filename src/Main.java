public class Main {
    public static void main(String[] args) {
        Fibon fib1 = new Fibon(7);
        System.out.println("Порядковый номер числа: " + fib1.number);
        System.out.println("Число Фибоначи: " + fib1.f);
    }
}

class Fibon {

    int number;
    int f;

    public Fibon(int n){
        this.number = n;
        this.f = setNumber(n);
    }

    public int setNumber (int number){
        int f1=0;   int f2=1; int fn=0;
        switch (number){
            case (0):
                fn=f1;
                break;
            case (1):
                fn=f2;
                break;
            default:
                for (int i=1; i<number; i++){
                    fn=f1+f2;
                    f1=f2;
                    f2=fn;
                }
                break;
        }
        return fn;
    }
}