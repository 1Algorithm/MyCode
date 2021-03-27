package test;

public class Dog {
	public String name,color,age,breed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog(String name, String color, String age, String breed) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.breed = breed;
	}
	public void displayInfo()
	{
		System.out.println("狗狗信息为");
		System.out.println("名字:"+this.name);
		System.out.println("颜色:"+this.color);
		System.out.println("年龄:"+this.age);
		System.out.println("品种:"+this.breed);
	}
	

}
