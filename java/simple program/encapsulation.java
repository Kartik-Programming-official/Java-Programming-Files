class Account{
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
}
public class encapsulation{
    public static void main(String[]args){
        Account acc= new Account();
        acc.setAcc_no(455986562556L);
        acc.setName("kartik");
        acc.setEmail("kartikpatra@gmail.com");
        acc.setAmmount(50000f);
        System.out.println(acc.getAcc_no()+ " " +acc.getName()+ " " +acc.getEmail()+ " " +acc.getAmmount());
    }
}