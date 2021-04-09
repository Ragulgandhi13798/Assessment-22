package preexample;

import java.util.ArrayList;
import java.util.function.BiPredicate;

class product1
{
	String product;
	int size;
	int price;
	
	public product1(String product, int size, int price) {
		super();
		this.product = product;
		this.size = size;
		this.price = price;
	}
	
}


public class Bipre {

	public static void main(String[] args) {
		ArrayList<product1> al = new ArrayList<product1>();
		al.add(new product1 ("paragon",1,45));
		al.add(new product1 ("par",16,55));
		al.add(new product1 ("vkc",10,325));
		
	
		
	  BiPredicate<Integer,Integer> c = (c1,c2)->(c1+c2)>50;
		
		
		for(product1 r : al)
		{
		
			if(c.test(r.price,r.size))
			System.out.println("this product is cost"+  r.price+" "+ r.size+" ");
			else {
				System.out.println("this product is cheap"+ r.price+" "+ r.size+" ");
			
		}
		

	}

	}

}
