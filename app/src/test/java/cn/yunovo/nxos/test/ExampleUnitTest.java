package cn.yunovo.nxos.test;

import org.hamcrest.core.StringEndsWith;
import org.hamcrest.core.StringStartsWith;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Rule
    public MyRule rule = new MyRule();

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        assertThat("soul", StringEndsWith.endsWith("so"));
        assertThat("soul", StringStartsWith.startsWith("so"));
    }

    @Test
    public void testTelePhoneNumber(){
        assertThat("1111111111111111",new IsMobilePhoneMatcher());
    }
}