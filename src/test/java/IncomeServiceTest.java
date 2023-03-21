import org.example.FrilanceService.services.IncomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class IncomeServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/IncomeServiceDate.csv")
    public void colc1version1(int income, int expenses, int threshold,int expected) {
        IncomeService service = new IncomeService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}