import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.*;

public class ListTests {
    @Test
    public void Testfilter(){
        List<String> listy = new ArrayList<>(); 
        listy.add("yes");
        listy.add("no");

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s){
                return true;
            }
        };
        ListExamples.filter(listy,sc);

        assertArrayEquals(listy.toArray(), ListExamples.filter(listy, sc).toArray());

    }

    @Test 
    public void Testmerge(){
        List<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");

        List<String> a2 = new ArrayList<>();
        a2.add("d");
        a2.add("e");
        a2.add("f");

        List<String> a3 = new ArrayList<>();
        a3.add("a");
        a3.add("b");
        a3.add("c");
        a3.add("d");
        a3.add("e");
        a3.add("f");

        assertArrayEquals(a3.toArray(), ListExamples.merge(a1, a2).toArray());

    }
}