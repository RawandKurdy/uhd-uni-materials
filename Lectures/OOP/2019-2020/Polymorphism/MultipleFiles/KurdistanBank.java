
public class KurdistanBank extends Bank{
    KurdistanBank(int id, double balance){
        super(id, balance);
    }

    @Override
    double getInterest(){
        return this.balance * 0.09;
    }

    double getInterest(double balance){
        return balance * 0.09;
    }
}