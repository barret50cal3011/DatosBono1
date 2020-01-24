public class Execute
{
    public static void main(String[] args)
    {
        try
        {
            Runtime.getRuntime().exec("./Main.class");
            Runtime.getRuntime().exec("./LinkedEficiency.class");
        }catch(Exception e)
        {

        }
    }
}