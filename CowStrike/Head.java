package CowStrike;
public class Head
{
    int headnum;
    Status headStatus;
    public Head(int num)
    {
        headnum = num;
        headStatus = Status.AVALIABLE;
    }
    
    public void changeToCleaning()
    {
        headStatus = Status.CLEANING;
    }

    public void changeToReady()
    {
        headStatus = Status.READY;
    }

    public void changeToWorking()
    {
        headStatus = Status.WORKING;
    }
}
