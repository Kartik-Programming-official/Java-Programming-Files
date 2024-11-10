class paramiterizedconstructor{
	int id;
	String name;
	paramiterizedconstructor(int i,String n){
		id=i;
		name=n;
	}
	void display(){System.out.println(id+ " " +name);}
	public static void main(String[]args){
	paramiterizedconstructor s1=new paramiterizedconstructor(988331,"Rohit");
	paramiterizedconstructor s2=new paramiterizedconstructor(700159,"Anu");
	s1.display();
	s2.display();
	}
}