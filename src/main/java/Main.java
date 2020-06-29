public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
        a.hashCode();
    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            ComplexNumber tot = (ComplexNumber) o;
            return Double.compare(tot.re, re) == 0 &&
                    Double.compare(tot.im, im) == 0;
        }

        @Override
        public int hashCode() {
            int result = 31 + (int) (Double.doubleToLongBits(re) - (Double.doubleToLongBits(re) >>> 32));
            return 31 * result + (int) (Double.doubleToLongBits(im) - (Double.doubleToLongBits(im) >>> 32));
        }
    }
}
