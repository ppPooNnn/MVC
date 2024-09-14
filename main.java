import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            cows.add(new Cow());
        }
        for(Cow c : cows)
            System.out.println(c);


        ArrayList<Machine> machines = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            machines.add(new Machine());
    }
}
