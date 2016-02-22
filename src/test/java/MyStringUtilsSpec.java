import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Taylor on 2/21/16.
 */
public class MyStringUtilsSpec {
    MyStringUtils myStringUtils;
    String[] stringsArr = {"these","are","some","strings"};
    char[] charsArr = {'t','h','e','s','e','a','r','e','s','o','m','e','c','h','a','r','s'};

    @Before
    public void setUp() {
        myStringUtils = new MyStringUtils();
    }

    @Test
    public void combineCharactersOrStringsTestChars() {
        String actual = myStringUtils.combineCharactersOrStrings(charsArr);
        String expected = "t,h,e,s,e,a,r,e,s,o,m,e,c,h,a,r,s";
        assertEquals("The string of characters was not composed correctly",expected,actual);
    }

    @Test
    public void combineCharactersOrStringsTestStrings() {
        String actual = myStringUtils.combineCharactersOrStrings(stringsArr);
        String expected = "these,are,some,strings";
        assertEquals("The string of strings was not composed correctly",expected,actual);
    }

    @Test
    public void makeArrayOfStringsTest() {
        String aString = "Here is\na string with\nmultiple lines";
        String[] actual = myStringUtils.makeArrayOfStrings(aString);
        String[] expected = {"Here is","a string with","multiple lines"};
        assertArrayEquals("The arrays were not returned correctly",expected,actual);
    }

    @Test
    public void reverseCapitalizeTest() {
        String aString = "here are some words to be reverse capitalized";
        String actual = myStringUtils.reversCapitialize(aString);
        String expected = "hERE aRE sOME wORDS tO bE rEVERSE cAPITALIZED";
        assertEquals("The string was not reverse capitalized",expected,actual);
    }

    @Test
    public void reverseStringTest() {
        String aString = "A string to be reversed";
        String actual = myStringUtils.reverseString(aString);
        String expected = "desrever eb ot gnirts A";
        assertEquals("The string was not reversed",expected,actual);
    }

    @Test
    public void replaceWhiteSpaceWithNewLineTest() {
        String aString = "A string with whitespace";
        String actual = myStringUtils.replaceWhiteSpaceWithNewline(aString);
        String expected = "A\nstring\nwith\nwhitespace";
        assertEquals("Spaces were not replaced",expected,actual);
    }

    @Test
    public void permutateTest() {
        int expected = 6;
        int actual = myStringUtils.permutate("abc").size();
        assertEquals("Did not return the correct number of permutations",expected,actual);
    }
}
