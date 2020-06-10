public class lab1 {
    public static void main(String[] args) {
        int zaliknumber = 9105;
        int C2 = zaliknumber % 2;
        int C3 = zaliknumber % 3;
        int C5 = zaliknumber % 5;
        int C7 = zaliknumber % 7;
        System.out.println("Welcome to my program!\nNumber of record book is " + zaliknumber);
        System.out.println("C2 = " + C2);
        System.out.println("C3 = " + C3);
        System.out.println("C5 = " + C5);
        System.out.println("C7 = " + C7);

        float a = 2;
        float n = 5;
        float b = 3;
        float m = 6;
        final float C = 0;
        double ans = 0;
        for(float i = a; i <= n; i++) {
            if (i - C == 0) {
                System.out.println("Sorry, but I can't dividing by 0");
                System.exit(-1);
            }
            for(float j = b; j <= m; j++) {
                ans += (double)(i * j)/(i - C);
            }
        }
        System.out.println("Answer : " + ans);
    }
}