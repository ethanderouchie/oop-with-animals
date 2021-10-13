public abstract class WildAnimal extends Animal{
  
  public WildAnimal (String name) {
    super(name);
  }

  public WildAnimal() {
    super();
  }

  public abstract String habitat();

  public String toString() {
        return String.format("%s %s.", super.toString(), "Wild");
  }
  
  
}