import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class hackerrank {

//    public static void main(String[] args) {
//        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
//        System.out.println("Hello, World.");
//        System.out.println("Hello, Java.");
//    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();// Complete this line
//        int c = scan.nextInt();// Complete this line
//
//        System.out.println(a);
//        System.out.println(b);// Complete this line
//        System.out.println(c);// Complete this line
//    }

//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
//            System.out.println("Weird");;
//        } else {
//            System.out.println("Not Weird");
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//        scan.close();
//
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//        bufferedReader.close();
//        for(int i =1; i<=10; i++) {
//            System.out.println(N + " " + "x" + " " + i + " " + "=" + " " + N*i);
//        }
//    }
//
////    OR
//
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int N = in.nextInt();
//
//            for(int i = 1; i <= 10; i++){
//
//                System.out.printf("%d x %d = %d%n", N, i, N*i);
//            }
//        }

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            for (int j = 0; j < n; j++) {
                c += Math.pow(2, j) * b;
                System.out.printf("%s ", c);
            }
            System.out.println();
        }
        in.close();
    }


}
