import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
public class ArrCheckTest {
    ArrayCheck ac;
    @Before
    public void init() {
        ac = new ArrayCheck();
    }
    @Test
    public void arrayCheckTest() throws RuntimeException{
        Assert.assertEquals(Arrays.toString (new int[] {1,5}), ac.arrayCheck (new int[]{1,4,5,6,4,1,5}));
        Assert.assertEquals(Arrays.toString (new int[] {444,11,52}), ac.arrayCheck (new int[]{1,424,5,4,444,11,52}));
        Assert.assertEquals(Arrays.toString (new int[] {5,6,7,8}), ac.arrayCheck (new int[]{1,4,5,6,4,14,4,3,1,4,5,6,7,8}));
        Assert.assertEquals(Arrays.toString (new int[] {1,5,7,5,7}), ac.arrayCheck (new int[]{1,4,5,6,4,1,5,7,5,7}));
    }
    @Test(expected = RuntimeException.class)
    public void arrayCheckTestRuntimeException() {
        ac.arrayCheck(new int[]{1,3,6,7,8});
    }
    @Test
    public void arrCheck1and4Test(){
        Assert.assertEquals (true, ac.arrCheck1and4 (new int[]{1,4,4,4,4,1,1}));
        Assert.assertEquals (false, ac.arrCheck1and4 (new int[]{1,4,4,5,4,1,1}));
        Assert.assertEquals (false, ac.arrCheck1and4 (new int[]{4,4,4,4,4,4,4}));
        Assert.assertEquals (false, ac.arrCheck1and4 (new int[]{1,1,1,1,1,1,1}));
    }
}
