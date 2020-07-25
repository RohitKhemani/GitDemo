package JavaCode;

public class Society {

	
	String buildingname;
	int amount;
	
	
public static void main(String[] args) {
		
		Society sc = new Society("AdnaniBhawan", 10000000);
		Society sc2 = new Society("DeepakDarbar", 20000000);

		System.out.println("Name is :" +sc.buildingname);
		System.out.println(sc2.amount);

		

	}

	
	public Society(String buildingname, int amount) {
		
		this.buildingname=buildingname;
		this.amount=amount;
	}
	
	
}
