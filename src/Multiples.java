public class Multiples {
    public static void main(String[] args) {
        int res = 0;
        int i = 1;
        while (i < 1000) {
            if ((i % 3 == 0) || (i % 5 == 0)){
                res++;
            }
            i++;
        }
        System.out.println(res);
    }
}
