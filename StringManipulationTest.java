package dishansh.codeup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringManipulationTest {

    @Test
    void getLongestSubstringWithNonrepeatedCharacters() {
        StringManipulation stringManipulation = new StringManipulation();
        Assertions.assertEquals(3, stringManipulation.getLongestSubstringWithNonrepeatedCharacters("dvdf"));
        Assertions.assertEquals(3, stringManipulation.getLongestSubstringWithNonrepeatedCharacters("abcabc"));
        Assertions.assertEquals(5, stringManipulation.getLongestSubstringWithNonrepeatedCharacters("abcabcabde"));
        Assertions.assertEquals(3, stringManipulation.getLongestSubstringWithNonrepeatedCharacters("peweke"));
    }
}