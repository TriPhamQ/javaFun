class FizzBuzzTest {
  public static void main(String[] args) {
    FizzBuzz fB = new FizzBuzz();
    int input = (int) Math.floor(Math.random() * 101);
    String fizzBuzz = fB.fizzBuzz(input);

    System.out.println(input + " " + fizzBuzz);
  }
}