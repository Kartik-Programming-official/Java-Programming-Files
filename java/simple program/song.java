interface Moviename{
	void KGF();
	void Dunki();
	void Avtar();
}
interface actorname{
	void yash();
	void SRK();
	void zeo();
}
class Movieactor implements Moviename,actorname{
	public void KGF(){
		System.out.println("\n Dheera Dheera");
	}
	public void yash(){
		System.out.println("The main actor name of KGF movie yash.");
	}
	public void Dunki(){
		System.out.println("\n O Maahi");
		System.out.println("Lutt Putt Gaya");
	}
	public void SRK(){
		System.out.println("The main actor name of Dunki Movie Taapsee pannu");
	}
	public void Avtar(){
		System.out.println("\n Sorry!\n this movie does not song available");
	}
	public void zeo(){
		System.out.println("The main actor name of Avtar movie Zoe saldana");
	}
}
public class song{
	public static void main(String[]args){
	Movieactor object=new Movieactor();
	object.KGF();
	object.yash();
	object.Dunki();
	object.SRK();
	object.Avtar();
	object.zeo();
	}
}