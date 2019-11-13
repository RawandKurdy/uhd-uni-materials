
public class TBI extends Bank{
    TBI(int id, double balance){
        super(id, balance);
    }

    @Override
    double getInterest(){
        return this.balance * 0.03;
    }
}