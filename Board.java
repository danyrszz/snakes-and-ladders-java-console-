
public class Board {

  private static final int BOARD_LENGHT = 120;
  private Snakes snakes = new Snakes ();
  private Ladders ladders = new Ladders ();
  private Box[] board ;
  
  public Board(){
    //builds a 100-box board
    this.board = new Box[BOARD_LENGHT];

    for(int i=1; i<BOARD_LENGHT; i++){
      if(this.snakes.getSnakes().get(i) != null){
        this.board[i] = new Box (i,this.snakes.getSnakes().get(i), true, false);
        continue;
      }
      if(this.ladders.getLadders().get(i) != null){
        this.board[i] = new Box (i,this.ladders.getLadders().get(i) ,false, true);
        continue;
      }
      this.board[i] = new Box (i,i, false, false);
    }
  }

  public Box getBox(int position){
    return board[position];
  }

  public int getBoxToJump (int index) {
    return board[index].getJumpTo();
  }

  public boolean hasSnake(int position){
    return board[position].hasSnake();
  }

  public boolean hasLadder(int position){
    return board[position].hasLadder();
  }
}
