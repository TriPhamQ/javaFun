class StringManipulatorTest {
  public static void main(String[] args) {
    StringManipulator sM = new StringManipulator();
    String str1 = "Hello, How are you today? ";
    String name = "Tri";
    String find = "are";
    char character = 'o';

    String trimAndConcat = sM.trimAndConcat(str1, name);
    int getIndexOfCharOrNull = sM.getIndexOrNull(str1, character);
    int getIndexOfStrOrNull = sM.getIndexOrNull(str1, find);
    String concatSubString = sM.concatSubstring(str1, 7, 19, name);

    System.out.println(trimAndConcat);
    System.out.println(getIndexOfCharOrNull);
    System.out.println(getIndexOfStrOrNull);
    System.out.println(concatSubString);
  }
}