import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        System.out.println("entera");
         int  a = sc.nextInt();
        System.out.println("enter b");
         int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        sc.close();

    }
}
