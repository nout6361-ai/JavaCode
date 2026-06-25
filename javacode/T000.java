public class T000 
{
    public static void main(String[] args) 
    {
        String secret = "735";
        int attempts = 0;
        for (int num = 0 ; num < 1000; num++) 
        {
            String guess =  String.format("%03d",num);

            attempts++;
            System.out.println("Trying " + guess + "... ");
            if (guess.equals(secret))  {
                System.out.println("\n Lock opened! Code is" + guess  );
                System.out.println("Total Attempts: " + attempts);

                return;
            }
        } 
    }
}