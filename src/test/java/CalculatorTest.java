import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator=new Calculator();

    @Test
    void additional(){
        assertEquals(4,calculator.add(2,2));
    }
    @Test
    void substractional(){
        assertEquals(4,calculator.subtract(7,3));
    }
    @Test
    void deviding(){
        assertEquals(4,calculator.devide(8,2));
    }
    @Test
    void multiplication(){
        assertEquals(6,calculator.multiply(2,3));
    }
}
