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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
