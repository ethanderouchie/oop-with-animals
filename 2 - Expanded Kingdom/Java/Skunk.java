public class Skunk extends WildAnimal {
    // Default constructor
    public Skunk() {
        super();
    }

    // A Constructor that takes a name for the animal
    public Skunk(String name) {
        super(name);
    }

    public String species() {
        return "Skunk";
    }

    public int numberOfLegs() {
        return 4;
    }

    public String habitat() {
      return "Den";
    }
 
    
}