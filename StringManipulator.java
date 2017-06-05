class StringManipulator {
  public String trimAndConcat(String str1, String str2) {
    return str1.trim() + str2.trim();
  }

  public int getIndexOrNull(String str, char character) {
    return str.indexOf(character);
  }

  public int getIndexOrNull(String str, String findStr) {
    return str.indexOf(findStr);
  }

  public String concatSubstring(String str1, int start, int end, String str2) {
    return str1.substring(start, end) + str2;
  }
}