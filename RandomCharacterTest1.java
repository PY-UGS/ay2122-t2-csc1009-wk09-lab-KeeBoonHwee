import static org.junit.jupiter.api.Assertions.*;
import        org.junit.jupiter.api.*;

public class RandomCharacterTest1 
{
    RandomCharacter rc;

    @BeforeEach
    @Test
    void setup()
    {
        rc = new RandomCharacter();
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
    }

    @DisplayName("Test getRandomCharacter()")
    @RepeatedTest(15)
    void Test$getRandomCharacter()
    {
        char result = rc.getRandomCharacter();
        assertTrue( 0      <= result );
        assertTrue( result <=    127 );
        assertFalse( result >    127 );
    }
}
