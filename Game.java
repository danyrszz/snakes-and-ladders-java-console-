
public class Game {

  private Player[] players;
  private Board board;
  private int turn;
  private boolean gameOver;
  private static final int MAX_DICE = 6;
  private static final int MIN_DICE = 1;
  private static final int FINAL_BOX = 100;

  public Game(){
    System.out.println("############################");
    System.out.println("#### Snakes and Ladders ####");
    System.out.println("############################");
    
    //setting up the players
    System.out.print(" \n How many players are gonna be? ");
    String numberPlayers = System.console().readLine();
    this.players = new Player [Integer.parseInt(numberPlayers)];
    for(int i=0; i<players.length; i++){
      System.out.println(" \n What's player's "+ (i+1) +" name?");
      String name = System.console().readLine();
      players[i] = new Player(i,name);
    }
    //setting up the board
    this.board = new Board();
    this.turn = 0;
    this.gameOver = false;
  }

  private int rollDice(){
    return (int)(Math.random() * (MAX_DICE-MIN_DICE + MIN_DICE)) + MIN_DICE;
  }

  //game starts
  public static void main (String [] args){

    Game game = new Game ();

    do{
      Player currentPlayer = game.players[game.turn];
      int dice1 = game.rollDice();
      int dice2 = game.rollDice();
      String playerName = currentPlayer.getName();

      int currentBox = currentPlayer.getCurrentBox();
      
      System.out.println(
        "\n ##########################################"+
        "\n"+playerName+"'s turn. (currently at box #"+ (currentBox)+")"
        );
      System.console().readLine();
      
      int targetBox = currentBox+dice1+dice2;
      System.out.println(
        "\n dice 1 / dice 2"+
        "\n   "+dice1+"  /   "+dice2+
        "\n you move "+ (dice1+dice2) + " boxes."
      );

      //before moving check the final box to see if its the end of the game
      if(targetBox == FINAL_BOX){
        game.gameOver = true;
        System.out.println("Congrats! "+playerName+ " you are the winner!");
      }
      else if(targetBox > FINAL_BOX){
        int diceRest = (dice1+dice2) - (FINAL_BOX - currentBox);
        targetBox = FINAL_BOX - diceRest;
      }

      int boxToJump = game.board.getBoxToJump(targetBox);
      if(game.board.hasSnake(targetBox)) System.out.println("Sorry, you've found a snake!");
      if(game.board.hasLadder(targetBox)) System.out.println("Lucky! a Ladder!");
      currentPlayer.setCurrentBox(boxToJump);
      System.out.println(playerName+" has moved to box #" + currentPlayer.getCurrentBox());
      
      //change to next player
      if(game.turn >= game.players.length-1){
        game.turn = 0;
      }else{
        game.turn++;
      }

    } while(!game.gameOver);
  }
}