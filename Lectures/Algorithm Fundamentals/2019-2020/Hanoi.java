
import java.util.Date;
public class Hanoi {

    int steps=0;
    void job(int n, char from, char to, char aux){
        steps++;
        if(n==1){
            System.out.println("DISK 1 MOVED From "+from+ " To "+to);
            return;
        }
        job(n-1,from ,aux ,to);
        System.out.println("DISK "+ n +" MOVED From "+from+ " To "+to);
        job(n-1, aux,to, from);
    }
    public static void main(String[] args) {
        Hanoi obj = new Hanoi();
        long start = new Date().getTime();
        obj.job(4, 'A', 'C', 'B');
        long end = System.currentTimeMillis();
        System.out.println("Steps: "+ obj.steps);

        System.out.println("Took: "+ (end-start) +"ms");
    }
}