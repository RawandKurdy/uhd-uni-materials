
public class Bank {
    int id;
    double balance;
    
    Bank(int id, double balance){
        this.id=id;
        this.balance=balance;
    }
    
    double getInterest(){
       return this.balance * 1;
    }
}