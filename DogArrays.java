/*
 * Activity 3.1.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    Dog[] myDogs = {new Dog("Buddy"), new Dog("Lucy"), new Dog("Max")};
    Dog[] neighborsDogs = new Dog[2];

    neighborsDogs[0] = new Dog("Rocky");
    neighborsDogs[1] = new Dog("Bella");

    System.out.println(neighborsDogs[0]);
    System.out.println(neighborsDogs[1]);
    
    // ERROR: This array has a size of 2, so the highest valid index is 1. Index 2 is out of bounds.
    // neighborsDogs[2] = new Dog("Cocoa");
  }
}
