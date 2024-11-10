abstract class Bank{    
    abstract int getInterestRate();    
}
class Citi extends Bank{    
    int getInterestRate(){return 7;}    
}
class HSBC extends Bank{    
    int getInterestRate(){return 6;}    
}    
     
class abstruction{    
    public static void main(String args[]){    
        Bank b;  
        b = new Citi ();
        System.out.println("\n Citi Rate of Interest is: "+b.getInterestRate()+"%");    
        b = new HSBC ();
        System.out.println("\n HSBC Rate of Interest is: "+b.getInterestRate()+"%");    
    }
} 