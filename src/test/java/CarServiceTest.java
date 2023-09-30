import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void analyzeCarByParams_millageNull_throwIllegalArgumentException(){

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = null;
        CarService service = new CarService();

        //when
        //boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
}
