
public class Bird implements Animals {
	   private String name; 
	   private String type; 
	   
	   //Constructor that accept name as parameter.
	   public Bird(String name, String type)
	   {
	      this.name = name;
	      this.type = type;
	   }
	   
	   // Method to implement getName(), getType() and animalSound() methods from Animals interface
	   //getName()
	   public String getName()
	   {
	      return name;
	   }
	   
	   //getType()
	      public String getType()
	   {
	      return type;
	   }
	   
	   //animalSound()
	   public String animalSound()
	   {
	      return "Chirp Chirp!";
	   }
}
