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

    //Switch Statement
    int button = sc.nextInt();
    if(button == 1) {
      System.out.println("Hello");
    } else if(button == 2) {
      System.out.println("Namaste");
    } else {
      System.out.println("Bonjour");
    }

    switch(button) {
      case 1:
        System.out.println("Hello");
        break;
      case 2:
        System.out.println("Namaste");
        break;
      case 3:
        System.out.println("Bonjour");
        break;
      default:
        System.out.println("Invalid Input");
    }
  }
}
