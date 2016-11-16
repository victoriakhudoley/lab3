public class lw03 implements var02 {

    @Override
    public void poka(double N) {
        int K = 0, sum = 0;
        while (sum <= N) {
            K++;
            sum += K;
        }
        System.out.println(String.format("K = %d, SUM = %d", K, sum));
    }

    @Override
    public void massivy(double[] A, int K, int L) {
        double sum = 0;
        for (int i = K; i <= L; i++) {
            sum += A[i];
        }
        System.out.println(String.format("Sum = %f", sum));
    }

    @Override
    public double logika(double d1, double d2, double d3) {
        if (d1 < d2 && d2 < d3) {
            return d2;
        } else if (d3 < d2 && d2 < d1) {
            return d2;
        } else if (d2 < d1 && d1 < d3) {
            return d1;
        } else if (d3 < d1 && d1 < d2) {
            return d1;
        } else if (d1 < d3 && d3 < d2) {
            return d3;
        } else {
            return d3;
        }
    }
}