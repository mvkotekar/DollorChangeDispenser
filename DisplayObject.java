public class DisplayObject {
  String dollor, quarter, dime, nickel, cents;

  public DisplayObject(int d, int q, int di, int n, int c) {
    dollor = String.valueOf(d);
    quarter = String.valueOf(q);
    dime = String.valueOf(di);
    nickel = String.valueOf(n);
    cents = String.valueOf(c);
  }

  public void DisplayChange() {
    System.out.println("Dollor = " + dollor);
    System.out.println("Quarter = " + quarter);
    System.out.println("Dime = " + dime);
    System.out.println("Nickel = " + nickel);
    System.out.println("Cents = " + cents);
  }
}