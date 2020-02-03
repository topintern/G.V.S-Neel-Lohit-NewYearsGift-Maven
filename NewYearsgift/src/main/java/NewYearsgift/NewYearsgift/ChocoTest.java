package NewYearsgift.NewYearsgift;

/*chocolates class:
 * The concepts used here are:
 * 1.Abstraction
 * 2.Encapsulation
 * 3.Inheritance
 * 
 */
abstract class chocolate 
{ 
    // the chocolate class has two fields 
    public int weight; 
    private int calories;
    private String type;
          
  
   
    // the chocolate class has one constructor 
    public chocolate(int weight, int calories) 
    { 
        this.weight = weight; 
        this.calories = calories; 
    } 
          
    // the chocolate class has three methods 
    //one abstract method setForm
    public void setType(String type)
    {
    	this.type=type;
    }
    public int getWeight()
    {
    	return weight;
    }
    public String getType()
    {
    	return type;
    }
    
    abstract void setForm(String type); 
          
    public void caloriesUp(int increment) 
    { 
        calories += increment; 
    } 
      
    // toString() method to print info of chocolate 
    public String toString()  
    { 
        return("weight of chocolate is "+weight 
                +"\n"
                + "calories of chocolate is "+calories); 
    }  
} 
  
// derived class 
class CocoaChocolate extends chocolate 
{ 
      
    // the CocoaChocolate subclass adds one more field 
      String form;
  
    // the CocoaChocolate subclass has one constructor 
     
    
    public CocoaChocolate(int weight,int calories) 
    { 
        // invoking base-class(chocolate) constructor 
        super(weight, calories); 
    }  
          
    // the CocoaChocolate subclass adds one more method 
    public void setForm(String newValue) 
    { 
        form = newValue; 
    }  
      
    // overriding toString() method 
    // of chocolate to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nForm of chocolate is "+form); 
    } 
      
} 
class Candies extends chocolate  
{ 
      
    // the Candies subclass adds one more field 
      String form;
  
    // the Candies subclass has one constructor 
    public Candies(int weight,int calories) 
    { 
        // invoking base-class(chocolate) constructor 
        super(weight, calories); 
    }  
          
    // the Candies subclass adds one more method 
    public void setForm(String newValue) 
    { 
        form = newValue; 
    }  
      
    // overriding toString() method 
    // of chocolate to print more info 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nForm of chocolate is "+form); 
    } 
      
} 

public class ChocoTest {
	public static void main(String[] args) {
	 chocolate s1 = new CocoaChocolate(10,100); 
     chocolate s2 = new Candies(5, 50); 
     s1.setType("Dark chocolate");
     s2.setType("sugar candy");
     System.out.println(s1.toString()); 
     System.out.println(s1.getType());  
     System.out.println();    
     System.out.println(s2.toString()); 
     System.out.println(s2.getType());    
	}

}

