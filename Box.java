public class Box {

  private int boxNumber;
  private int jumpTo;
  private boolean hasSnake;
  private boolean hasLadder;

  public Box(int boxNumber, int jumpTo, boolean hasSnake, boolean hasLadder){
    this.jumpTo = jumpTo;
    this.boxNumber = boxNumber;
    this.hasLadder = hasLadder;
    this.hasSnake = hasSnake;
  }

  public int getBoxNumber(){
    return boxNumber;
  }

  public int getJumpTo(){
    return jumpTo;
  }

  public boolean hasLadder () {
    return hasLadder;
  }

  public boolean hasSnake () {
    return hasSnake;
  }
}
