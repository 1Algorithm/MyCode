package test3;

public class RectangleDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle();
		rec1.display();
		System.out.println("the rec1 area is :"+rec1.calculateArea());
		System.out.println("the rec1 perimeter is :"+rec1.calculatePetimeter());
		System.out.println();
		
		Rectangle rec2 = new Rectangle(4,5);
		rec2.display();
		System.out.println("the rec2 area is :"+rec2.calculateArea());
		System.out.println("the rec2 perimeter is :"+rec2.calculatePetimeter());
		System.out.println();
		
		rec2.setlength(2.3f);
		rec2.setwidth(4.3f);
		rec2.display();
		System.out.println("the new rec2 area is :"+rec2.calculateArea());
		System.out.println("the new rec2 perimeter is :"+rec2.calculatePetimeter());

	}

}
