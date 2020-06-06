import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(result, 2);
    }
}
