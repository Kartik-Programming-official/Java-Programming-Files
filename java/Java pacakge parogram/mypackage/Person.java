package mypackage;
public class Person{
	/**private String name;
	private int age;*/
	private long acc_no;
    private String name,email;
    private float ammount;
	
	/*public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}*/
public long getAcc_no(){
    return acc_no;
}
public void setAcc_no(long acc_no){
    this.acc_no=acc_no;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public float getAmmount(){
    return ammount;
}
public void setAmmount(float ammount){
    this.ammount=ammount;
	}
}


/***public class Account{
	private long acc_no;
    private String name,email;
    private float ammount;
public long getAcc_no(){
    return acc_no;
}
public void setAcc_no(long acc_no){
    this.acc_no=acc_no;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public float getAmmount(){
    return ammount;
}
public void setAmmount(float ammount){
    this.ammount=ammount;
}
}**/