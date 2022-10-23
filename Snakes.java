import java.util.HashMap;

public class Snakes {

  private HashMap <Integer,Integer> snakes = new HashMap <Integer,Integer>();
  public Snakes() {
    this.snakes.put(16,6);
    this.snakes.put(46,25);
    this.snakes.put(49,11);
    this.snakes.put(62,19);
    this.snakes.put(64,60);
    this.snakes.put(74,53);
    this.snakes.put(89,68);
    this.snakes.put(92,88);
    this.snakes.put(95,75);
    this.snakes.put(99,80);
  }

  public HashMap<Integer,Integer> getSnakes (){
    return snakes;
  }
  
}