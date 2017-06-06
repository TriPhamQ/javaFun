import java.util.Arrays;
import java.util.ArrayList;;

class BasicJavaTest {
  public static void main(String[] args) {
    BasicJava bJ = new BasicJava();
    int[] myArray = {-9,-1,1,3,5,9,21,65,35,24,15}; 

    int maxInArray = bJ.max(myArray);
    int averageInArray = bJ.average(myArray);
    ArrayList<Integer> y = bJ.arrayOdd();
    int numberOfGreater = bJ.greaterY(myArray, 6);
    int[] squaredArray = bJ.arraySquared(myArray);
    ArrayList<Integer> positiveArray = bJ.arrayPositive(myArray);
    int[] maxMinAvg = bJ.maxMinAverage(myArray);
    int[] shiftedArray = bJ.shiftValues(myArray);

    System.out.println("Print 255");
    bJ.print255();
    System.out.println("Print Odd");
    bJ.printOdd();
    System.out.println("Print Sum");
    bJ.printSum();
    System.out.println("Print Array");
    bJ.printArray(myArray);
    System.out.println("MaxInArray");
    System.out.println(maxInArray);
    System.out.println("Average");
    System.out.println(averageInArray);
    System.out.println("Array Odd");
    System.out.println(y);
    System.out.println("Number of Greater Y");
    System.out.println(numberOfGreater);
    System.out.println("Squared Array");
    bJ.printArray(squaredArray);
    System.out.println("Eliminate Negative");
    System.out.println(positiveArray);
    System.out.println("Max Min Avg");
    bJ.printArray(maxMinAvg);
    System.out.println("Shift Values");
    bJ.printArray(shiftedArray);
  }
}