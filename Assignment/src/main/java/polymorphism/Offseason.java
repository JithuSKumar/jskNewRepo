package polymorphism;

public class Offseason extends Onseason 
{
	public double discount(double price)
	{
        double discountAmount = price * 0.15;
        double finalPrice = price - discountAmount;
        return finalPrice;
        
	}

	public static void main(String[] args) 
	
	{
		Onseason onseason = new Onseason();
        Offseason offseason = new Offseason();
        
        double originalPrice = 100.0; // Example price
        
        double onseasonPrice = onseason.discount(originalPrice);
        double offseasonPrice = offseason.discount(originalPrice);
        
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Onseason Price after 40% discount: " + onseasonPrice);
        System.out.println("Offseason Price after 15% discount: " + offseasonPrice);
	}

}
