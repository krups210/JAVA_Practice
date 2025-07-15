package Core;

class userr{
	int id;
	String name;
	String add;
	long cont;
	userr(int id, String name,String add,long cont){
		System.out.println("id: " + id + " Name: " + name + " Address: " + add + " contect No. " + cont);
		this.id = id;
		this.name = name;
		this.add = add;
		this.cont = cont;
		
	}
	public void ShowData() {
		System.out.println("id: " + id + " Name: " + name + " Address: " + add + " contect No. " + cont);
	}
	
}

public class ThisKeyword{
	public static void main(String[] args) {
		userr u = new userr(1, "java", "Ahmedabad", 534556);
		u.ShowData();
	}
}