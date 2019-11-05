public class Example {   

    public static void main(String[] args) {
        NationalBank Akar = new NationalBank(1, 2000);

        System.out.println("Interest Rate of Akar/NB: "
         + Akar.getRate());
         System.out.println("Interest Rate of 4000>>%9: "
         + Akar.getRate(4000));

         CountryBank Soma = new CountryBank(1, 2000);

         System.out.println("Interest Rate of Soma/CB: "
          + Soma.getRate());
        }
}

class Bank {
    int id;
    double balance;
    
    Bank(int id){
        balance=0;
        this.id = id;
    }
    double getRate(){
        return 1 * this.balance;
    }
}

class NationalBank extends Bank{
    double balance;

    NationalBank(int id, double balance) {
        super(id);
        this.balance = balance;
    }

    @Override
    double getRate(){
        return this.balance * 0.09;
    }

    // OVERLOADING
    double getRate(double balance){
        return 0.09 * balance;
    }

}

class CountryBank extends Bank{
    double balance;

    CountryBank(int id, double balance) {
        super(id);
        this.balance = balance;
    }

    @Override
    double getRate(){
        return this.balance * 0.03;
    }

}