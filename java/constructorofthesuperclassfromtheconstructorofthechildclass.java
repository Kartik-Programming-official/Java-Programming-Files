public class constructorofthesuperclassfromtheconstructorofthechildclass{
	constructorofthesuperclassfromtheconstructorofthechildclass(int version1,int version2){
		if(version1>version2){
			System.out.println("\n The last version is :- "+version1);
		}else{
			System.out.println("\n the last version is:- "+version2);
		}
	}
}
class main extends constructorofthesuperclassfromtheconstructorofthechildclass{
	main(){
		super(11,8);
	}
	public static void main(String[]args){
		main obj=new main();
	}
}