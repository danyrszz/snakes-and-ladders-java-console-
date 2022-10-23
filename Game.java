
public class Game {

  private Player[] players;
  private Board board;
  private int turn;
  private boolean gameOver;

  public Game(){
    System.out.println("############################");
    System.out.println("#### Snakes and Ladders ####");
    System.out.println("############################");
    
    //setting up the players
    System.out.print(" \n How many players are gonna be? ");
    String numberPlayers = System.console().readLine();

    players = new Player [Integer.parseInt(numberPlayers)];

    for(int i=0; i<players.length; i++){
      System.out.println(" \n What's player's "+ (i+1) +" name?");
      String name = System.console().readLine();
      players[i] = new Player(i+1,name);
    }

    //setting up the board
    System.out.println("\n setting up the board...");
    this.turn = 1;
    this.gameOver = false;
  }

  public int[] rollDice(){

  }

  public boolean getGameOver () {
    return gameOver;
  }

  public Board getBoard(){
    return board;
  }

  public int getTurn(){
    return turn;
  }



}