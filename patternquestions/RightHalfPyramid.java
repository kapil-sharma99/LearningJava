package patternquestions;

public class RightHalfPyramid {
  public static void main(String args[]) {
    int n = 5;
    for(int i = 1; i <= n; i++) {
      int space = n - i;
      for(int j = 0; j <= space; j++) {
        System.out.print(" ");
      }
      for(int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
