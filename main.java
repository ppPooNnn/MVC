import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        CowQueue cows = new CowQueue();
        for(int i = 0; i < 100; i++)
        {
            cows.enqueue(new Cow());
        }
        cows.display();


        ArrayList<Machine> machines = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            machines.add(new Machine(i + 1));
    }
}
