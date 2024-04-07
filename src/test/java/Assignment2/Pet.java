package Assignment2;

public class Pet {
	
	 public void brag() {
      System.out.println("I have the best pet!");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
      d1.brag();
	}

}

class Dog extends Pet {
//  @Override
  public void brag() {
      super.brag(); 
      System.out.println("I have the best dog!");
  }
}

