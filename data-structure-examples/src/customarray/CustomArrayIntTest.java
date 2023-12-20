package customarray;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayIntTest {

    private final CustomArrayInt underTest = new CustomArrayInt();

    @Test
    public void test_add(){
        underTest.add(1);
        assertEquals(1, underTest.size());
    }

}
