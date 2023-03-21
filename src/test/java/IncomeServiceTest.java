import org.example.FrilanceService.services.IncomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class IncomeServiceTest {

    @Test
    void colc1version1() {
        IncomeService service = new IncomeService();

        // подготавливаем данные:
        int expected = 3;

        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void colc1version2() {
        IncomeService service = new IncomeService();

        // подготавливаем данные:
        int expected = 2;

        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

}