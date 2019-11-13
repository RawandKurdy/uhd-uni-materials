
abstract class Bank {
    int id;
    double balance;
    
    Bank(int id, double balance){
        this.id=id;
        this.balance=balance;
    }
    
    abstract double getInterest();
}