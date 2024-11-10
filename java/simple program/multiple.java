interface Character{
	void attack();
}
interface Weapon{
	void use();
}
class Warrior implements Character,Weapon{
	public void attack(){
		System.out.println("\n Warrior attack with a sword.");
	}
	public void use(){
		System.out.println("\n Warrior uses a sword.");
	}
}
class Mage implements Character,Weapon{
	public void attack(){
		System.out.println("\n Mage attack with a wand.");
	}
	public void use(){
		System.out.println("\n Magr uses a wand.");
	}
}
public class multiple{
	public static void main(String[]args){
		Warrior warrior= new Warrior();
		Mage mage= new Mage();
		warrior.attack();
		warrior.use();
		mage.attack();
		mage.use();
	}
}