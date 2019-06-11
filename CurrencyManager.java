import java.math.BigDecimal;

public class CurrencyManager {
    void GetChange(int totalCents) {
    int quarter = 0;
    int dime = 0;
    int nickel = 0;

    // Convert the dollors into the smallest unit cents
    // integer type helps avoid log of typecasting/downcasting etc    
    int dollor = totalCents/100;
    totalCents = totalCents%100;

    if(totalCents >= 25) {
        quarter = totalCents/25;
        totalCents = totalCents%25;
    }

    if(totalCents >= 10) {
      dime = totalCents/10;
      totalCents = totalCents%10;
    }

    if(totalCents >= 5) {
      nickel = totalCents/5;
      totalCents = totalCents%5;
    }

    DisplayObject d = new DisplayObject(
    dollor,
    quarter,
    dime,
    nickel,
    totalCents);
    d.DisplayChange();
  }

    public void CalculateChange(
      // There is a catch here with data type as BigDecimal
      // Double or Float cannot be used as their precision varies during subtraction or division.
      // If anyone has good idea bout right data type please comment or discuss here.  
      BigDecimal itemPrice, 
      BigDecimal givenMoney) {
      BigDecimal dispenceChange = givenMoney.subtract(itemPrice);  
      
      System.out.println("----------------------------");
      System.out.println("Item Price: " + itemPrice);
      System.out.println("Given Amount: " + givenMoney);
      System.out.println("Dispence: " + dispenceChange);
      System.out.println("----------------------------");

      if(dispenceChange.doubleValue() == 0) {
        System.out.println("No changes required.");
        return;
      }

      if(dispenceChange.doubleValue() < 0 ) {
        System.out.println("Invalid transaction. Amount is less than item price");
        return;
      }

      if(dispenceChange.doubleValue() > 0) {
        BigDecimal amountInCents = dispenceChange.multiply(BigDecimal.valueOf(100));
        int amountCents = amountInCents.intValue();
        GetChange(amountCents);
      }
  }
}
