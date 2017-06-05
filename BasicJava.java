import java.util.ArrayList;

class BasicJava {
  public void print255() {
    for(int i = 0; i < 255; i++) {
      System.out.println(i + 1);
    }
  }

  public void printOdd() {
    for(int i = 0; i < 255; i += 2) {
      System.out.println(i + 1);
    }
  }

  public void printSum() {
    int current = 0;

    for(int i = 0; i < 255; i++) {
      current += i + 1;
      System.out.println("New number: " + (i+1) + " Sum: " + current);
    }
  }

  public void printArray(int[] myArr) {
    for(int i = 0; i < myArr.length; i++) {
      System.out.println(myArr[i]);
    }
  }

  public int max(int[] myArr) {
    int max = myArr[0];

    for (int i = 0; i < myArr.length; i++) {
      if (myArr[i] > max) {
        max = myArr[i];
      }
    }
    return max;
  }

  public int sum(int[] myArr) {
    int sum = 0;

    for (int number : myArr) {
      sum += number;
    }
    return sum;
  }

  public int average(int[] myArr) {
    return sum(myArr)/myArr.length;
  }

  public ArrayList<Integer> arrayOdd() {
    ArrayList<Integer> myArr = new ArrayList<>();

    for (int i = 0; i < 255; i += 2) {
      myArr.add(i + 1);
    }
    return myArr;
  }

  public int greaterY(int[] myArr, int y) {
    int numberOfGreater = 0;

    for (int number : myArr) {
      if (number > y) {
        numberOfGreater ++;
      }
    }
    return numberOfGreater;
  }

  public int[] arraySquared(int[] myArr) {
    int[] myOutputArr = new int[myArr.length];

    for (int i = 0; i < myArr.length; i++) {
      myOutputArr[i] = myArr[i] * myArr[i];
    }
    return myOutputArr;
  }

  public ArrayList<Integer> arrayPositive(int[] myArr) {
    ArrayList<Integer> myOutputArr = new ArrayList<>();

    for (int number : myArr) {
      if (number >= 0) {
        myOutputArr.add(number);
      }
    }
    return myOutputArr;
  }
}