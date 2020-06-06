import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class SUTTest {
    @Test
    public void testStringConcatenation_length2_typeI() {
        String s1 = "a";
        String s2 = "b";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 1);
    }

    @Test
    public void testStringConcatenation_length5_typeII() {
        String s1 = "abc";
        String s2 = "de";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 1);
    }
    @Test (expected=IllegalArgumentException.class)
    public void testStringConcatenation_length45_throwsException() {
    	String s1="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    	String s2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    	SUT sut = new SUT();
    	sut.stringConcatenation(s1, s2);
    }
    @Test
    public void testStringConcatenation_length45_throwsException2() {
    	String s1="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    	String s2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    	SUT sut = new SUT();
    	assertThrows(IllegalArgumentException.class,()->sut.stringConcatenation(s1, s2));
    }
    
}
