import java.math.BigDecimal;

class Main {
  public static void main(String[] args) {
    CurrencyManager cm = new CurrencyManager();
    cm.CalculateChange(BigDecimal.valueOf(643.57), BigDecimal.valueOf(875));
  }
}