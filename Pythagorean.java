import java.lang.Math;

class Pythagorean {
  public Double calculateHypotenuse(int legA, int legB) {
    Double answer = Math.sqrt((Math.pow(legA, 2)+Math.pow(legB, 2)));

    return answer;
  }
}