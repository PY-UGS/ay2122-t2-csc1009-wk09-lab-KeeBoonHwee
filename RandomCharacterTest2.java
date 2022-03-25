import static org.junit.jupiter.api.Assertions.*;
import        org.junit.jupiter.api.*;
import        java.util.*;

public class RandomCharacterTest2 
{
    RandomCharacter                rc = null;
    HashMap< String, Integer > primes = new HashMap< String, Integer >();

    @BeforeEach
    @Test
    void setup()
    {
        rc = new RandomCharacter();
        primes.put("2",2);
        primes.put("3",3);
        primes.put("5",5);
        primes.put("7",7);
        primes.put("11",11);
        primes.put("13",13);
        primes.put("17",17);
        primes.put("19",19);
        primes.put("23",23);
        primes.put("29",29);
        primes.put("31",31);
        primes.put("37",37);
        primes.put("41",41);
        primes.put("43",43);
        primes.put("47",47);
        primes.put("53",53);
        primes.put("59",59);
        primes.put("61",61);
        primes.put("67",67);
        primes.put("71",71);
        primes.put("73",73);
        primes.put("79",79);
        primes.put("83",83);
        primes.put("89",89);
        primes.put("97",97);
        primes.put("101",101);
        primes.put("103",103);
        primes.put("107",107);
        primes.put("109",109);
        primes.put("113",113);
        primes.put("127",127);
        assertTrue(rc instanceof RandomCharacter);
    }

    @DisplayName("Test getRandomLowerCaseLetter()")
    @RepeatedTest(15)
    void Test$getRandomLowerCaseLetter()
    {
        char result = rc.getRandomLowerCaseLetter();
        assertTrue( 97     <= result);
        assertTrue( result <=    122);
        assertFalse( Character.isDigit( result ) );
        assertTrue( Character.isLetter( result ) );
        assertTrue( Character.isLowerCase( result ) );
        assertFalse( Character.isUpperCase( result ) );
        
        if(primes.containsKey( String.valueOf( (int)result ) ))
        {
            assertTrue( rc.isPrime( (int) result ) );
        }
        else
        {
            assertFalse( rc.isPrime( (int) result ) );
        }
    }

    @DisplayName("Test getRandomUpperCaseLetter()")
    @RepeatedTest(15)
    void Test$getRandomUpperCaseLetter()
    {
        char result = rc.getRandomUpperCaseLetter();
        assertTrue( 65     <= result);
        assertTrue( result <=    90);
        assertFalse( Character.isDigit( result ) );
        assertTrue( Character.isLetter( result ) );
        assertFalse( Character.isLowerCase( result ) );
        assertTrue( Character.isUpperCase( result ) );
        if(primes.containsKey( String.valueOf( (int)result ) ))
        {
            assertTrue( rc.isPrime( (int) result ) );
        }
        else
        {
            assertFalse( rc.isPrime( (int) result ) );
        }
    }

    @DisplayName("Test getRandomDigitCharacter()")
    @RepeatedTest(15)
    void Test$getRandomDigitCharacter()
    {
        char result = rc.getRandomDigitCharacter();
        assertTrue( 48     <= result);
        assertTrue( result <=    57 );
        assertTrue( Character.isDigit( result ) );       // 
        assertFalse( Character.isLetter( result ) );     // 
        assertFalse( Character.isLowerCase( result ) );  // check generate character is lower case
        assertFalse( Character.isUpperCase( result ) );  // check generate character is upper case
        if(primes.containsKey( String.valueOf( (int)result ) ))
        {
            assertTrue( rc.isPrime( (int) result ) );
        }
        else
        {
            assertFalse( rc.isPrime( (int) result ) );
        }
    }

    @DisplayName("Test getRandomCharacter()")
    @RepeatedTest(15)
    void Test$getRandomCharacter()
    {
        char result = rc.getRandomCharacter();
        assertTrue( 0      <= result );
        assertTrue( result <=    127 );
        assertFalse( result >    127 );
        if(primes.containsKey( String.valueOf( (int)result ) ))
        {
            assertTrue( rc.isPrime( (int) result ) );
        }
        else
        {
            assertFalse( rc.isPrime( (int) result ) );
        }
    }
}
