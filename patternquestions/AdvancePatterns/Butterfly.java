package patternquestions.AdvancePatterns;

public class Butterfly {
  public static void main(String args[]) {
    int n = 4;
    for(int i = 1; i <= n; i++) {
      int space = 2*n - 2*i;
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for(int j = 1; j <= space; j++) {
       System.out.print(" "); 
      }
      space = space - 1;
      for(int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i = n; i >= 1; i--) {
      int space = 2*n - 2*i;
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for(int j = 1; j <= space; j++) {
       System.out.print(" "); 
      }
      space = space - 1;
      for(int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
