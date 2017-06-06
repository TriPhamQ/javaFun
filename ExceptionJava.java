import java.util.List;
import java.util.ArrayList;

class ExceptionJava {
  public static void main(String[] args) {
    List myList = new ArrayList<>();

    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    System.out.println(myList);

    for(int i = 0; i < myList.size(); i++) {
      try {
        int castedValue = (Integer) myList.get(i);
        myList.set(i, castedValue);
        System.out.println(castedValue);
      } catch (Exception e) {
        myList.set(i, -1);
        System.out.println("ERROR ON INDEX " + i);
      }
    }

    System.out.println(myList);
  }
}