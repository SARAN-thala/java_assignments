class Mammals implements Animal{
  public void eat(){
    System.out.println("Mammal eats");
  }
  public void travel(){
    System.out.println("Mammal travels");
  }
//   public int numOfLegs(){
// System.out.println(0);
//     return 0;
//   }
  public static void main(String[] args) {
    Mammals m = new Mammals();
    m.eat();
    m.travel();
    // m.numOfLegs();
  }
}