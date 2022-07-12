import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private String CONST = "const";
    private final static String bd = "pui";

    @Test
    public void equalsOneToOne(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        CONST = "newValue";
        assertEquals("newValue", CONST);
    }

    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd == new String("pui")) {
            res = "asd";
        }

        assertEquals("a", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = List.of("1", "viskas", "chupocabra");
        for (String element: sourceData){
            sourceData.equals(element);
        }
        assertTrue(sourceData.contains("1"));
    }


}
