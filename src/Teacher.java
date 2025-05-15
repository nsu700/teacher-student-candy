public class Teacher {
  private static String[] Candy = new String[20];
  private String color;

  // Count how many candies still available
  public int checkCandy() {
    int counter = 0;
    for(int i = 0; i < Candy.length; i++) {
      if(Candy[i] != null) {
        counter++;
      }
    }
    return counter;
  }

  public String[] showCandy() {
    return Candy;
  }
  public void updateCandy(int index, String colString) {
    Candy[index] = colString;
  }

  public String awardCandy() {
    int num = this.checkCandy();
    if(num > 0) {
      color = Candy[num-1];
      updateCandy(num-1, null);
      return color;
    } else {
      return null;
    }
  }
  public void buyCandy(int number) {
    for (int i = 0; i < number; i++) {
        color = TuckShop.sellCandy(i);
        updateCandy(i, color);
    }
  }
}
