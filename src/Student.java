public class Student {
  private String[] candies = new String[20];
  private final int score;
  private final String name;
  private static int numberOfStudents;

  public Student(int score, String name) {
    this.score = score;
    this.name = name;
    numberOfStudents++;
  }

  public String getName() {
    return this.name;
  }
  private int countCandy() {
    int counter = 0;
    for (int i = 0; i < candies.length; i++) {
        if (candies[i] != null) {
          counter++;
        }
    }
    return counter;
  }
  private void updateCandy(int index, String coString) {
    candies[index] = coString;
  }
  public void receiveCandy(String coloString) {
    int index = countCandy();
    updateCandy(index, coloString);
  }

  public String[] showCandy() {
    return this.candies;
  }

  public int showScore() {
    return this.score;
  }

  public static int getNumberOfStudents() {
    return numberOfStudents;
  }
}
