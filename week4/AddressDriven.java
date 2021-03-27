package test;

public class AddressDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ads1 = new Address("中国","湖北","武汉","阳光大道","0100");
		ads1.displayInfo();
		ads1.setCity("海口");
		ads1.setProvince("海南");
		ads1.setPostCode("1210");
		ads1.displayInfo();

	}

}
