import java.util.Arrays;
import java.util.ArrayList;;

class BasicJavaTest {
  public static void main(String[] args) {
    BasicJava bJ = new BasicJava();
    int[] myArray = {-9,-1,1,3,5,9,21,65,35,24,15}; 

    bJ.print255();
    bJ.printOdd();
    bJ.printSum();
    bJ.printArray(myArray);
    int maxInArray = bJ.max(myArray);
    int averageInArray = bJ.average(myArray);
    ArrayList<Integer> y = bJ.arrayOdd();
    int numberOfGreater = bJ.greaterY(myArray, 6);
    int[] squaredArray = bJ.arraySquared(myArray);
    ArrayList<Integer> positiveArray = bJ.arrayPositive(myArray);

    System.out.println(maxInArray);
    System.out.println(averageInArray);;
    System.out.println(y);
    System.out.println(numberOfGreater);
    bJ.printArray(squaredArray);
    System.out.println(positiveArray);
  }
}