package interfacePack;

public class A_InterfaceChild implements A_InterfaceParent{
	
	

	public static void main(String[] args) {
		A_InterfaceChild objChild = new A_InterfaceChild();
		objChild.display();

	}

	@Override
	public void display() {
		System.out.println("Content of display method");
		
	}

}
