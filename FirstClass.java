import java.util.*;

class FirstClass {
  public static void main(String args[]) {
    System.out.println("Hello World!!");
    System.out.print("HEllo World!!\n");
    System.out.print("Hello World\n");
    System.out.println("*\n**\n***\n****");

    //Variables
    //String name = "Tony Stark";
    //System.out.println(name);
    //int a = 25;
    //int b = 10;
    //double price = 25.25;
    //System.out.println(b);
    //b = 30;
    //System.out.println(b);

    int a = 10;
    int b = 20;
    int sum = a + b;
    System.out.println(sum);

    //Inputs in Java
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);

    int a1 = sc.nextInt();
    int b1 = sc.nextInt();
    int sum1 = a1 + b1;
    System.out.println(sum1);
  }
}