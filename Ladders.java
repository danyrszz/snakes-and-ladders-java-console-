import java.util.HashMap;

public class Ladders {
  private HashMap <Integer,Integer> ladders = new HashMap <Integer,Integer>();
  public Ladders () {
    this.ladders.put(2,38);
    this.ladders.put(7,14);
    this.ladders.put(8,31);
    this.ladders.put(15,26);
    this.ladders.put(21,42);
    this.ladders.put(28,84);
    this.ladders.put(36,44);
    this.ladders.put(51,67);
    this.ladders.put(71,91);
    this.ladders.put(78,98);
    this.ladders.put(87,94);
  }

  public HashMap<Integer,Integer> getLadders (){
    return ladders;
  }
}