package patternquestions.AdvancePatterns;

public class Rhombus {
  public static void main(String args[]) {
    int n = 5;
    for(int i = 1; i <= n; i++) {
      int space = n - i;
      for(int j = 0; j <= space; j++) {
        System.out.print(" ");
      }
      space--;
      for(int j = 1; j <= 4; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
