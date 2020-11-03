import org.junit.*;
import static org.junit.Assert.*;

public class JUnit {
    private Idrettsgren test;

    @Before
    public void førTest(){
        test= new Idrettsgren();
    }

    @After
    public void etterTest(){
        test=null;
    }

    public void testinnsetting(){
        test.reg("100 m løping",);

    }
}
