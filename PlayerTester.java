public class PlayerTester {
  public static void main(String[] args) {
    Player player = new Player();

    //test player after  it's constructed
    System.out.println("After constructor:");
    System.out.println("player's score [exp: 0]: " + player.getScore());
    System.out.println("player's hand [exp: empty arrayList]: " + player.getCards());


    CardSimComponent simComponent = new CardSimComponent();


    simComponent.hit("player");



  }

}
