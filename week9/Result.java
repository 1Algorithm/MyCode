package week9.vo;

public class Result {
 	private int salesNum=0;     //���۱���      
	private int salesVol=0;       //��������
	private float allmoney=0;         //���۽��
	public int getSalesNum() {
		return salesNum;
	}
	public void setSalesNum(int salesNum) {
		this.salesNum = salesNum;
	}
	public int getSalesVol() {
		return salesVol;
	}
	public void setSalesVol(int salesVol) {
		this.salesVol = salesVol;
	}
	public float getAllmoney() {
		return allmoney;
	}
	public void setAllmoney(float allmoney) {
		this.allmoney = allmoney;
	}
	public Result() {
		super();
	}
	public Result(int salesNum, int salesVol, float allmoney) {
		super();
		this.salesNum = salesNum;
		this.salesVol = salesVol;
		this.allmoney = allmoney;
	}
	@Override
	public String toString() {
		return "�ܼƣ�\t���۱���"+salesNum+ ",�������� "+salesVol+",���۽�� "+allmoney;
	}
	

}
