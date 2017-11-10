package submission_nakazawa;

public class Problem9{
    public static void main(String[] args){
        int valueA;
        int valueB;
        int result;
        valueA = 100;
        valueB = 0;
        if (valueB == 0){
          throw new IllegalArgumentException("valueBの値は0です");
        } else {
          result = valueA / valueB;
          System.out.println(result);
        }
    }
}
