import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Class With Tests")
public class JUnit5ExampleTests {

    @Test
    @DisplayName("Check QA User")
    void Check_QA_User() {
        Assertions.assertEquals(100, 100);
    }

    @Test
    @DisplayName("Check UAT User")

    void Check_UAT_User() {
        Assertions.assertEquals(200, 200);
    }

    @Test
    @DisplayName("Check SUPP User")
    void Check_SUPP_User() {
        Assertions.assertEquals(300, 300);
    }
}