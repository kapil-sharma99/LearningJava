import java.util.*;

import javax.lang.model.util.ElementFilter;

public class Conditional {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num > 18) {
      System.out.println("Adult!!");
    } else {
      System.out.println("Not an Adult!!");
    }

    //Odd or Even
    int num2 = sc.nextInt();
    if(num2 % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    //Whcih one is greater
    int a = sc.nextInt();
    int b = sc.nextInt();
    // if(a == b) {
    //   System.out.println("A=b");
    // } else {
    //   if(a > b) {
    //     System.out.println("A>B");
    //   } else {
    //     System.out.println("A<B");
    //   }
    // }
    if(a == b) {
      System.out.println("Equal");
    } else if(a > b) {
      System.out.println("greater");
    } else {
      System.out.println("Smaller");
    }
  }
}
