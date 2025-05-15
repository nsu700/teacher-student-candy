public class TuckShop {
  private static String[] candyInStock = new String[] { "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda", "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda", "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda", "Toyota", "Mercedes", "BMW", "Volkswagen", "Skoda" };

  public static String sellCandy(int number) {
    String color;
    if(candyInStock[number] != null) {
      color = candyInStock[number];
      candyInStock[number] = null;
      return color;
    } else {
      return null;
    }
  }

  public int checkInventory() {
    return candyInStock.length;
  }
}
