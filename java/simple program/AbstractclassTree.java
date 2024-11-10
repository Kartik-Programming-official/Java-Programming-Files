abstract class Tree{
	public abstract void Growup();
}
class Cactus extends Tree{
	public void Growup(){
		System.out.println("\n Grow up in desert.");
	}
}
class Moss extends Tree{
	public void Growup(){
		System.out.println("\n Grow up in enough of water.");
	}
}
public class AbstractclassTree{
	public static void main(String[]args){
		Cactus cactus=new Cactus();
		cactus.Growup();
		Moss moss=new Moss();
		moss.Growup();
	}
}