package test;

public class Address {
	public String country, province, city, street, postCode;

	public String getCountry() {
		return country;
	}

	public Address(String country, String province, String city, String street, String postCode) {
		this.country = country;
		this.province = province;
		this.city = city;
		this.street = street;
		this.postCode = postCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public void displayInfo()
	{
		System.out.println("��ַ��ϢΪ��"+this.country+this.province+"ʡ"+this.city+"��"+this.street+"  ��������:"+this.postCode);
	}

}
