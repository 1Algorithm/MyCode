package test3;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle()
	{
		this.length = 1.0f;
		this.width = 1.0f;
	}
	public Rectangle(float length,float width){
		this.length = length;
		this.width = width;
	}
	
	public void setwidth(float width){
		this.width = width;
	}
	public float getwidth(){
		return this.width;
	}
	public void setlength(float length){
		this.length = length;
	}
	public float getlength(){
		return this.length;
	}
	public float calculateArea(){
		float area = this.length * this.width;
		return area;
	}
	public float calculatePetimeter(){
		float perimeter = (this.length + this.width)*2;
		return perimeter;
	}
	public void display(){
		System.out.println("the length is:"+this.length);
		System.out.println("the width is:"+this.width);
		
	}

}
