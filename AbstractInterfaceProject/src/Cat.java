public class Cat implements Animals 
{
	   private String name; 
	   private String type; 
	   
	   //Constructor that accept name as parameter.
	   public Cat(String name, String type)
	   {
	      this.name = name;
	      this.type = type;
	   }
	   
	   // method required to implement the animal interface.
	   public String getName()
	   {
	      return name;
	   }
	   
	   //animal type 
	      public String getType()
	   {
	      return type;
	   }
	   
	   // method required to implement the animal interface.
	   public String animalSound()
	   {
	      return "Meow!";
	   }


}
