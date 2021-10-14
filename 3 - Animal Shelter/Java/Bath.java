public class Bath implements ISellable {
  public String description() {
    return "A luxury bath for your pet.";
  }
  
  public String lengthOfTime() {
    return "/ hour";
  }

  public double unitPrice() {
    return 24.99;
  }

  public String sku() {
    return "bath60";
  }


}