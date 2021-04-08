package week6;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson salp1 = new SalesPerson("101","ÕÔËÄ","5B410",9000f,500);
		System.out.println(salp1.toString());
		salp1.updateSalary();
		System.out.println(salp1.toString());
		
		System.out.println();
		
		Administrator adms1 = new Administrator("108","ÍõÈı","5B480",10000f,2000f);
		System.out.println(adms1.toString());
		adms1.updateSalary();	
		System.out.println(adms1.toString());

	}

}
