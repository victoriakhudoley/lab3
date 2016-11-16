public class Main {
    public static void main(String[] args) {
        double a = 17.0, b = 60.3, c = 16.0;
        double N = 27.1;
        double A[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};

        lw03 lw = new lw03();
        lw.poka(N);
        lw.massivy(A, 2, 4);
        System.out.println(String.format("Logic answer is = %f", lw.logika(a, b, c)));
    }

}