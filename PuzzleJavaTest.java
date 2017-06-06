import java.util.ArrayList;
import java.util.Arrays;

class PuzzleJavaTest {
  public static void main(String[] args) {
    PuzzleJava puzzleJava = new PuzzleJava();

    int[] myArr = {3,5,1,2,7,9,8,13,25,32};
    String[] myNameArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    int y = 7;
    String[] myAlphabetArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    int sum = puzzleJava.sum(myArr);
    ArrayList<Integer> greaterThanY = puzzleJava.greaterThanY(myArr, 10);
    String[] shuffleNameArray = puzzleJava.shuffleStringArray(myNameArr);
    ArrayList<String> longerThanYCharacters = puzzleJava.longerThanYCharacters(myNameArr, 5);
    String[] shuffleAlphabetArray = puzzleJava.shuffleStringArray(myAlphabetArr);
    int[] randomNumberArray = puzzleJava.randomNumberArray();
    String randomString = puzzleJava.randomString(5);
    String[] randomStringArray = puzzleJava.randomStringArray(10);

    System.out.println(sum);
    System.out.println(greaterThanY); 
    System.out.println(Arrays.toString(shuffleNameArray));
    System.out.println(longerThanYCharacters);
    System.out.println(Arrays.toString(shuffleAlphabetArray));
    System.out.println(Arrays.toString(randomNumberArray));
    Arrays.sort(randomNumberArray);
    System.out.println(Arrays.toString(randomNumberArray));
    System.out.println(randomNumberArray[0]);
    System.out.println(randomNumberArray[randomNumberArray.length - 1]);
    System.out.println(randomString);
    System.out.println(Arrays.toString(randomStringArray));
  }
}