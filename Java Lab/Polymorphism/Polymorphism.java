class Bird {
  public void sing() {
      System.out.println("chirp chirip chirip");
  }
}

class Robin extends Bird {
    public void sing() {
      System.out.println("woof woof woof");
      
  }
}

class Pelican extends Bird {
    public void sing() {
      System.out.println("hiok hiok hiok");
      
  }
}

public class Polymorphism {
    
    public static void main (String[] args) {
      Robin b = new Robin();
      b.sing();
      
      Pelican p = new Pelican();
      p.sing();
    }
}