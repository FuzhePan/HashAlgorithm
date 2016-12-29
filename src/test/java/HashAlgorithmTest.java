
import fuzhepan.hash.algorithm.HashAlgorithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class HashAlgorithmTest {

    @Test
    public void testHash(){
        long a = HashAlgorithm.KETAMA_HASH.hash("a");
        long b = HashAlgorithm.KETAMA_HASH.hash("b");
        long abc = HashAlgorithm.KETAMA_HASH.hash("abcdegrgfgw2343454534ffd3454545455");

        System.out.println(a);
        System.out.println(b);
        System.out.println(abc);
    }
}
