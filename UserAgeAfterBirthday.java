package List2;
//programa1
class User{
	String name;
	int age;
	
	void ageAfterBirthday(int quantityBrithday) {
		int newIdade = this.age+quantityBrithday;
		System.out.println("No "+quantityBrithday+"º aniversario, depois do de "+this.age+" anos, "+this.name + " terá " + newIdade + " anos.");
	}
}
public class UserAgeAfterBirthday {
	public static void main(String[] args) {
		User userInfo = new User();
		
		userInfo.name="Gessyca";
		userInfo.age=21;
		
		for (int quantityBirthday=1; quantityBirthday<5; quantityBirthday++) {
			userInfo.ageAfterBirthday(quantityBirthday);
		}
	}
}

