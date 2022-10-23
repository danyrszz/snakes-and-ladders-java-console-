public class Player {

  private int token;
  private int currentBox;
  private String name;
  
  public Player(int playerToken, String name){
    this.token = playerToken;
    this.name = name;
    this.currentBox = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public void setCurrentBox(int number){
    this.currentBox = number;
  }

  public int getCurrentBox() {
    return currentBox;
  }

  public int getPlayerToken(){
    return token;
  }

}
