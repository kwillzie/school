package lab1;

public class BuddyInfo {

	private String name;
	private int number;
	private String address;
	
	public BuddyInfo(String name, int number, String address){
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args){
		BuddyInfo liam = new BuddyInfo("Liam", 999999, "room next to mine");
		System.out.println("Hello " + liam.getName());
		
	

	}

}
