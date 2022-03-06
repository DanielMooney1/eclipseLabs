package Lab15;

public class Verifier {
    
    abstract public class MyOutOfRangeException
    {

    }
    private static void MyOutOfRangeException() 
    {
    }

    public void verifyIntRange(int value,int low, int high)
    {
        if (value >= low && value <= high)
        {
            MyOutOfRangeException();
        }
    }
}
