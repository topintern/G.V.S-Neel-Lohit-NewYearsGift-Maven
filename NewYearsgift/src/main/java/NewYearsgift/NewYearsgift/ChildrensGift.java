package NewYearsgift.NewYearsgift;
import java.util.*;
public class ChildrensGift {
    // ChildrensGift Collection of Objects
	 static ArrayList<Object> l=new ArrayList<>();
	 ChildrensGift(int n,String type,int w)
	 {
		
		    if(n==1) // chocolates Gift
		    {
		    if(w>50) {  // weight > 50 falls under CocoaChocolate
	 		Random r=new Random();
		   	int k=r.nextInt(500);
		   	CocoaChocolate c1=new CocoaChocolate(w,k);
		   	c1.setForm("choco-Bar"); // all CocoaChocolate are choco-bars
		   	c1.setType(type);
		    l.add(c1);
		    }
		    else
		    {
		    Random r=new Random();   // weight < 50 falls under Candy
		   	int k=r.nextInt(50);
		   	Candies c1=new Candies(w,k);
		   	c1.setForm("candy-wrap"); // all Candies are candy-wrap
		   	c1.setType(type);
		    l.add(c1);
		    }
		    }
		    
		   else if(n==2)    // Sweets gift
		    {
			 
		    if(w>50)  // weight > 50 falls under Laddu
		    {
		 	 Random r=new Random();
		   	int k=r.nextInt(500);
		   	Laddu c1=new Laddu(w,k);
		   	c1.setType(type);
		    l.add(c1);   // all Laddus are plain boxes
		 	 }
		    else
		    {
		    Random r=new Random();   // weight < 50 falls under MilkSweets
 		   	int k=r.nextInt(50);
 		 	Milksweet c1=new Milksweet(w,k);
 		 	c1.present("gift-wrap");  // all MilkSweets are gift-wraps
 		 	c1.setType(type, 2020);
		    l.add(c1);
		 	}
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
    	System.out.println("Enter 1 for chocolate and enter the type of chocolate and its weight");
    	System.out.println("Enter 2 for sweet and enter the type of sweet and its weight");
    	
    	Scanner sc=new Scanner(System.in);
    	for(int i=0;i<l;i++)
    	{
    		String s=sc.nextLine();
       // Create a new ChildrensGift object
    		new ChildrensGift(Integer.parseInt(s.split(" ")[0]),s.split(" ")[1],Integer.parseInt(s.split(" ")[2]));
    	}
    	sc.close();
    	// Output  weights,calories and form of gifts
    	 for(Object str: ChildrensGift.l) {
    		 System.out.println(str);
    		 System.out.println("---------------------------+");
    	 }
    	 
    	int w=0;
    	 for(Object str: ChildrensGift.l){
    		 if (str instanceof chocolate)
 			w+=((chocolate)str).weight;
    		 else
    		w+=((sweet)str).weight;	
 	        }
    	 System.out.println("Total weight of gifts is: "+w);
    	 System.out.println("--------------------------------");
    	 
    	int c=0,ch=0;
    	 	 for(Object str: ChildrensGift.l){
    		 if (str instanceof chocolate) {
 			if(((chocolate)str).weight>50) {
 				System.out.println(((chocolate)str).getType()+" is a chocolate");
 			ch=1;
 			}
    		 else {
    			 System.out.println(((chocolate)str).getType()+" is a Candy");
    			 c=1;
    		 }
 			}
 	   }
    	 	 if(c==0)
    	 	System.out.println("No Candy Gift!");
    	 	 if(ch==0)
    	    System.out.println("No Chocolate Gift!");
    	    	 	
    }
}
