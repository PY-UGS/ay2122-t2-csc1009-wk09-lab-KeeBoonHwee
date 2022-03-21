
import java.util.*;

public class RandomCharacter
{

    public char getRandomLowerCaseLetter()
    {
        // 97 to 122
        int[] digit = new Random().ints(1, 97, 122).toArray();
        return (char)digit[0];
    }

    public char getRandomUpperCaseLetter()
    {
        // 65 to 90
        int[] digit = new Random().ints(1, 65, 90).toArray();
        return (char)digit[0];
    }

    public int getRandomDigitCharacter()
    {
        int[] digit = new Random().ints(1, 0, 9).toArray();
        return digit[0];
    }

    public char getRandomCharacter()
    {
        int[] digit = new Random().ints(1, 0, 255).toArray();
        return (char)digit[0];
    }

    public static void main(String[] args)
    {
        RandomCharacter rc = new RandomCharacter();
        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomLowerCaseLetter() : " + rc.getRandomLowerCaseLetter() + "\n" );
        }

        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomUpperCaseLetter() : " + rc.getRandomUpperCaseLetter() + "\n" );
        }

        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomDigitCharacter() : " + rc.getRandomDigitCharacter() + "\n" );
        }

        for(int i = 0 ; i < 15 ; i++)
        {
            System.out.print( (i + 1) + ") getRandomCharacter() : " + rc.getRandomCharacter() + "\n" );
        }
    }

    
}