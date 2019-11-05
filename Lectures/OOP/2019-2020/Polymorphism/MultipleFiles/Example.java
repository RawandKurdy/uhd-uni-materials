
public class Example {
    public static void main(String[] args){
        KurdistanBank Akar = new KurdistanBank(1, 1000);
        System.out.println("Interest Rate of Akar: "
        + Akar.getInterest());

        TBI Soma = new TBI(1, 1000);
        System.out.println("Interest Rate of Soma: "
        + Soma.getInterest());
    }

}