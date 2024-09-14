public class Machine 
{
    Status[] headStatus = new Status[4];
    Status machineStatus;

    public Machine()
    {
        machineStatus = Status.AVALIABLE;
        for(int i = 0; i < 4; i++)
            headStatus[i] = Status.AVALIABLE;
    }
}
