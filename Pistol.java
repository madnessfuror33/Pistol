import java.io.IOException;

public class Pistol {
    public static void main(String[] args)
    {
       Runtime runtime = Runtime.getRuntime();

       int[] arr = new int[6];
       final int random = (int) (Math.random() * arr.length-1) + 1 ;

       arr[0] = 0;
       arr[1] = 0;
       arr[2] = 1;
       arr[3] = 0;
       arr[4] = 0;
       arr[5] = 0;

       if(arr[random] == 1)
       {
       try
       {
          System.out.println("Bye bye");
          runtime.exec("shutdown -s -t 5");
       }

       catch(IOException e)
       {
          System.out.println("Exception: " +e);
       }
    }

    else
    System.out.println("You live");
    }


    
}
