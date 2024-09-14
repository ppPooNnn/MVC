import java.util.*;

public class CowStrike 
{
    public void working(CowQueue cowList, ArrayList<Machine> machines)
    {
        while(true)
        {
            if (machines.get(cowList.peek().like).machineStatus == Status.AVALIABLE)
                machines.get(cowList.peek().like).putCowInMachine(cowList.dequeue());
            else
            {
                int check = 0;
                for(Machine m : machines)
                {
                    if (m.machineStatus == Status.AVALIABLE)
                    check = 1;
                }
                if (check == 0)
                {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                boolean found = false;
                int i = cowList.peek().like + 1;
                while (!found)
                {
                    if (i > 10)
                        i = 1;
                    if (machines.get(i).machineStatus != Status.AVALIABLE)
                    {    
                        i++;
                        continue;
                    }
                    else
                    {
                        machines.get(i).putCowInMachine(cowList.dequeue());
                        found = true;
                        break;
                    }
                }
            }
        }
    }

    public int collect(ArrayList<Machine> machines)
    {
        int milk = 0;
        for (Machine m : machines)
        {
            if (m.checkStatus() == Status.DONE)
                milk += m.yeild();
        }
        return milk;
    }
}
