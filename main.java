import java.util.ArrayList;

import CowStrike.Cow;
import CowStrike.CowQueue;
import CowStrike.CowStrike;
import CowStrike.Machine;

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

        CowStrike cStrk = new CowStrike();
        cStrk.working(cows, machines);
    }
}
