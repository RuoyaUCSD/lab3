import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void filterKeepsOrder() {
        List<String> in = Arrays.asList("Yes", "", "sigh", "and", "andp", "was");
        List<String> out = Arrays.asList("Yes","sigh", "was");
        compareLists(out, ListExamples.filter(in, (String s) -> s.contains("s")));
    }
    @Test
    public void testMerge() {
        List<String> a = Arrays.asList("a", "d", "x");
        List<String> b = Arrays.asList("b", "c");
        List<String> out = Arrays.asList("a","b","c","d","x");
        compareLists(out, ListExamples.merge(a,b));
        compareLists(out, ListExamples.merge(b,a));
    }

    void compareLists(List x, List y) {
        assertEquals(x.size(), y.size());
        for (int i = 0; i < x.size(); i++) {
            assertEquals(x.get(i), y.get(i));
        }
    }
}
