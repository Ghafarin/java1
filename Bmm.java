public class Bmm {
    public static void main(String[] args) {
        double n = 36;
        double m = 18;
        double t = 0;
        double r = 0;
        int end = 0;

        if (m < n){
            t = n;
            n = m;
            m = t;
        }

        while (end == 0) {
            r = m % n;
            if (r == 0) {
                //System.out.println(n);
                end = 1;
                break;
            }

            m = n;
            n = r;


        }

        System.out.println("b m m:" + n);


    }
}
