import java.util.ArrayList;
import java.util.Random;

class PuzzleJava {
  Random randomNumber = new Random();

  public int sum(int[] myArr) {
    int sum = 0;

    for(int i = 0; i < myArr.length; i++) {
      sum += myArr[i];
    }

    return sum;
  }

  public ArrayList<Integer> greaterThanY(int[] myArr, int y) {
    ArrayList<Integer> myOutputArrayList = new ArrayList<Integer>();

    for(int i = 0; i < myArr.length; i++) {
      if (myArr[i] > y) {
        myOutputArrayList.add(myArr[i]);
      }
    }

    return myOutputArrayList;
  }

  public String[] shuffleStringArray(String[] myArr) {
    String[] myOutputArray = myArr;

    for(int i = 0; i < myArr.length; i++) {
      int randomIndex = randomNumber.nextInt(myArr.length - 1);

      String tempValue = myOutputArray[i];
      myOutputArray[i] = myOutputArray[randomIndex];
      myOutputArray[randomIndex] = tempValue;
    }
    if (myOutputArray[0] == "a" || myOutputArray[0] == "e" || myOutputArray[0] == "i" || myOutputArray[0] == "o" || myOutputArray[0] == "u" || myOutputArray[0] == "y") {
      System.out.println("First character is a vowel");
    }
    if (myOutputArray[myOutputArray.length - 1].length() == 1) {
      System.out.println("Last character is: " + myOutputArray[myOutputArray.length - 1]);
    }

    return myOutputArray;
  }

  public ArrayList<String> longerThanYCharacters(String[] myArr, int y) {
    ArrayList<String> myOutpuArrayList = new ArrayList<String>();

    for(int i = 0; i < myArr.length; i++) {
      if (myArr[i].length() > y) {
        myOutpuArrayList.add(myArr[i]);
      }
    }

    return myOutpuArrayList;
  }

  public int[] randomNumberArray() {
    int[] myOutputArray = new int[10];

    for(int i = 0; i < myOutputArray.length; i++) {
      myOutputArray[i] = randomNumber.nextInt(100) + 55;
    }

    return myOutputArray;
  }

  public String randomString(int y) {
    String[] myAlphabetArr = alphabetArray();
    String myOutputString = "";

    for(int i = 0; i < y; i++) {
      myOutputString += myAlphabetArr[randomNumber.nextInt(myAlphabetArr.length - 1)];
    }

    return myOutputString;
  }

  public String[] alphabetArray() {
    String[] myAlphabetArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    return myAlphabetArr;
  }

  public String[] randomStringArray(int y) {
    String[] myOutputArray = new String[y];

    for(int i = 0; i < y; i++) {
      myOutputArray[i] = randomString(5);
    }

    return myOutputArray;
  }
}