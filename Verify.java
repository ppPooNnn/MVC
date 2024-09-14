import java.util.ArrayList;

import CowStrike.Cow;
import CowStrike.CowQueue;
import CowStrike.CowStrike;
import CowStrike.Machine;

public class Verify 
{
    int errorCount = 0;
    public boolean case1(ArrayList<Machine> machines)
    {
        for (Machine m : machines)
        {
            if (m.cowInMachine.udder > 4)
            {
                errorCount++;
                return true;
            }
        }
        return false;
    }  
    
    public boolean case2(ArrayList<Machine> machines)
    {
        for (Machine m : machines)
        {
            if (m.cowInMachine.sex == 0)
            {
                errorCount++;
                return true;
            }
        }
        return false;
    }

    public boolean case3(ArrayList<Machine> machines)
    {
        int count = 0;
        for (Machine m : machines)
        {
            if (m.machineNum != m.cowInMachine.like)
                count++;
        }
        if (count >= 8)
        {
            errorCount++;
            return true;
        }
        return false;
    }
}
