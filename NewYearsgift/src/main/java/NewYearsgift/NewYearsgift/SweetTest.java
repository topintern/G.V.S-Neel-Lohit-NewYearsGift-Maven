package NewYearsgift.NewYearsgift;

/*sweets class:
The concepts Implemented here are:
1.Interfaces
2.encapsulation
3.Static PolyMorphism
4.Inheritance
5.Runtime PolyMorphism
*/
interface form{
	final String form="\nBox of sweets ";
	void present(String w);//methods are abstract by default
	
}
class sweet
{ 
    // the sweet class has two fields 
    public int weight; 
    private int calories;
    private String type;
    public int year;
          
    // the sweet class has one constructor 
    public sweet(int weight, int calories) 
    { 
        this.weight = weight; 
        this.calories = calories; 
    } 
          
    // the sweet class has three methods 
    public void setType(String type)
    {
    	this.type=type;
    }
    //method overloading of method setType
    public void setType(String type,int year)
    {
    	this.type=type;
    	this.year=year;
    	
    }
    public String getType()
    {
    	if(year!=0)
    	return type+" "+year;
    	return type;
    }
   //abstract method to be implemented by the subclasses 
          
    public void caloriesUp(int increment) 
    { 
        calories += increment; 
    } 
      
    // toString() method to print info of sweet 
    public String toString()  
    { 
        return("weight of sweet is "+weight 
                +"\n"
                + "calories of sweet is "+calories); 
    }  
} 
  
// derived class 
class Milksweet extends sweet  implements form
{ 
	String wrap;
    // the Milksweet subclass has one constructor 
	
    public Milksweet(int weight,int calories) 
    { 
        // invoking base-class(sweet) constructor 
        super(weight, calories); 
        
    }  
          
    // the Milksweet subclass adds one more method 
   
      
    // overriding toString() method 
    // of sweet to print more info 
    @Override
    public String toString() 
    { 
    	if(wrap!=null)
            return (super.toString()+form+wrap); 
        	return (super.toString()+form+"no wrap"); 
    }
    //implement abstract method present
    public void present(String w)
    {
    	wrap=w;
    }
      
} 
class Laddu extends sweet  implements form
{ 
      
    String wrap;
  
    // the Laddu subclass has one constructor 
    public Laddu(int weight,int calories) 
    { 
        // invoking base-class(sweet) constructor 
        super(weight, calories); 
       
    }  
          
   
      
    // overriding toString() method 
    // of sweet to print more info 
    @Override
    public String toString() 
    { 
    	if(wrap!=null)
        return (super.toString()+form+wrap); 
    	return (super.toString()+form+" no wrap"); 
    	
    } 
    public void present(String w)
    {
    	wrap=w;
    }
      
} 

public class SweetTest {
	public static void main(String args[]) {
	 //sweet s=new sweet(10,100); --> Not possible since sweet is an abstract class
	// base class reference (class sweet) pointing to subclass object (class Milksweet)
	 sweet s1 = new Milksweet(10,100); 
     Laddu s2 = new Laddu(5, 50); 
     s1.setType("Mysore pak",2020);
     s2.setType("mothi-chur");
     s2.present("gift-packed");
     s1.getType();
     //Run time PolyMorphism (Method override) 
     System.out.println(s1.toString()); 
     System.out.println(s1.getType());  
     System.out.println();    
     System.out.println(s2.toString()); 
     System.out.println(s2.getType());    

}
}
