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
		System.out.println("������ϢΪ");
		System.out.println("����:"+this.name);
		System.out.println("��ɫ:"+this.color);
		System.out.println("����:"+this.age);
		System.out.println("Ʒ��:"+this.breed);
	}
	

}
