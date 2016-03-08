package prob2;

public class Money {

	private int count;
	private int rest;
	private int unit;
	private String moneyName;
	
	public void calculate(int unit,int rest,String moneyName){
		
		if(unit == 50000) this.rest = rest;
		
		this.count = this.rest/unit;
		this.rest = this.rest - this.count * unit;
		
		if(unit>=1000){
			System.out.println(moneyName+ "권 : " + this.count + "매");
		}else{
			System.out.println(moneyName+ " : " + this.count + "개");
		}
	}
	
	
}
