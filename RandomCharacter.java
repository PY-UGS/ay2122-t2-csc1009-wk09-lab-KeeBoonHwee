
import java.util.*;

public class RandomCharacter
{

    public char getRandomLowerCaseLetter()  // This method is used to get one random lower case character between ‘a’ and ‘z’.
    {
        // 97 to 122
        int[] digit = new Random().ints(1, 97, 122).toArray();
        return (char)digit[0];
    }

    public char getRandomUpperCaseLetter()  //  This method is used to get one random upper case letter between ‘A’ and ‘Z’.
    {
        // 65 to 90
        int[] digit = new Random().ints(1, 65, 90).toArray();
        return (char)digit[0];
    }

    public char getRandomDigitCharacter()  //  This method is used to get one random digit number between ‘0’ and ‘9’.
    {
        // 48 to 57
        int[] digit = new Random().ints(1, 48, 57).toArray();
        return (char)digit[0];
    }

    public char getRandomCharacter()
    {
        int[] digit = new Random().ints(1, 0, 127).toArray();
        return (char)digit[0];
    }

    public boolean isPrime(int number)
    {

        if(number <= 1 ) return false;
        if(number == 2 || number==3) return true;
        if(number % 2 == 0)
        {
            return false;
        }
        else
        {
            int sqrt = (int) Math.sqrt(number) + 1;
            for (int i = 3; i < sqrt; i += 2)
                {
                    if (number % i == 0) 
                    {
                        return false;
                    }
                }
            return true;
        }
    }

    public static void main(String[] args)
    {
        RandomCharacter rc = new RandomCharacter();

        System.out.println("Generating 15 random characters using getRandomLowerCaseLetter() :");
        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomLowerCaseLetter() : " + rc.getRandomLowerCaseLetter() + "\n" );
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Generating 15 random characters using getRandomUpperCaseLetter() :");
        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomUpperCaseLetter() : " + rc.getRandomUpperCaseLetter() + "\n" );
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Generating 15 random characters using getRandomDigitCharacter() :");
        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomDigitCharacter() : " + rc.getRandomDigitCharacter() + "\n" );
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Generating 15 random characters using getRandomCharacter() :");
        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomCharacter() : " + rc.getRandomCharacter() + "\n" );
        }
        System.out.println("----------------------------------------------------------------------------------------");
        
        for(int i = 0 ; i < 15 ; i++)
        {
            int rand = (int)rc.getRandomCharacter();
            if( rc.isPrime(rand) )
            {
                System.out.println(rand + " is a Prime number.");
            }
            else
            {
                System.out.println(rand + " is not a Prime number.");
            }
        }
        
    }

    
}