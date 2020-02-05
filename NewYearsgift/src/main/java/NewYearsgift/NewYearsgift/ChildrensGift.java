package NewYearsgift.NewYearsgift;
import java.util.*;
public class ChildrensGift {
    // ChildrensGift Collection of Objects
	 static ArrayList<sweet> l=new ArrayList<>();
	 ChildrensGift(String type,int w)
	 {
		
		   
		    if(w>=75 && w<=150) {  // weight > 75 falls under CocoaChocolate
	 		Random r=new Random();
		   	int k=r.nextInt(500);
		   	sweet c1=new chocolate(w,k);
		   	c1.setType(type);
		   	c1.present();
		    l.add(c1);
		    }

		    
		    else if(w<75)
		    {
		    Random r=new Random();   // weight < 75 falls under Candy
		   	int k=r.nextInt(50);
		   	sweet c1=new Candies(w,k);
		   	c1.setType(type);
		   	c1.present();
		    l.add(c1);
		    }
		    
		      // Sweets gift
		    else if(w>200)  // weight > 200 falls under Laddu
		    {
		 	 Random r=new Random();
		   	int k=r.nextInt(500);
		   	sweet c1=new Laddu(w,k);
		   	c1.setType(type);
		   	c1.present();
		    l.add(c1);   
		 	}
		    
		    else if(w>150 && w<=200)
		    {
		    Random r=new Random();   // weight >150 falls under GulabJamun
 		   	int k=r.nextInt(50);
 		 	sweet c1=new GulabJamun(w,k);
		    l.add(c1);
		    c1.present();
		    } 
		    else    // Wrong input 
		    {
		    System.out.println("sorry this gift is not for you!");	
		    }
	 }
	
		
    public static void main( String[] args )
    {
    	Random r=new Random();
    	int l=r.nextInt(4);
    	l+=1;
    	System.out.println("You will recieve "+l+" gifts");
    	System.out.println("Which type of Gift do you want?");
    	System.out.println("Enter the sweet and its weight");
    	System.out.println("All Chocolates and candies should have weights less than 150");
    	
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<l;i++)
    	{
    		String s=sc.nextLine();
       // Create a new ChildrensGift object
    		new ChildrensGift(s.split(" ")[0],Integer.parseInt(s.split(" ")[1]));
    	}
    	sc.close();
    	// Output  weights,calories and form of gifts
    	 for(sweet str: ChildrensGift.l) {
    		 System.out.println(str);
    		 System.out.println("---------------------------+");
    	 }
    	int w=0;
    	 for(sweet str: ChildrensGift.l){
    		w+=str.weight;	
 	        }
    	 System.out.println("Total weight of gifts is: "+w);
    	 System.out.println("-----------------------------");
    	 
    	// identify the chocolates and candies
    	 int c=0,ch=0;
    	 	 for(sweet str: ChildrensGift.l){
    		 
 			if(str.weight>=75 && str.weight<=150) {
 				System.out.println(str.getType()+" is a chocolate");
 			ch=1;
 			}
    		 if(str.weight<75) {
    			 System.out.println(str.getType()+" is a Candy");
    			 c=1;
    		 }
 			
 	   }
    	 	 if(c==0)
    	 	System.out.println("No Candy Gift!");
    	 	 if(ch==0)
    	    System.out.println("No Chocolate Gift!");
    	    	 	
    }
}
