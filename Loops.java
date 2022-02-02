import java.util.*;

public class Loops {
  public static void main(String args[]) {
    for(int i = 0; i < 10; i++) {
      System.out.println("Hello World!!");
    }

    for(int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    int i = 1;
    while(i < 11) {
      System.out.println(i);
      i++;
    }

    int j = 0;
    do {
      System.out.println(j);
      j++;
    } while(j < 11);
  }
}
