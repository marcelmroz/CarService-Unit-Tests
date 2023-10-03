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

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_allValuesOk_resultTrue(){
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_carMillageNotOk_resultFalse(){
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 21000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_millageLessThanZero_throwIllegalArgumentException(){

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = -1;
        CarService service = new CarService();

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_valuesEqualMinOrMax_resultFalse(){
        //given
        Integer treadThickness = 2;
        Integer fuelUsage = 14;
        Integer carMillage = 0;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertFalse(result);
    }


    @Test
    public void analyzeCarByParams_fuelUsageNull_throwIllegalArgumentException(){
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = null;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_fuelUsageNegative_throwIllegalArgumentException(){
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = -5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_carMillageMaxValue_resultFalse(){
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 20000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_fuelUsageMaxValue_resultFalse(){
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 14;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_treadThicknessGreaterThanMax_resultFalse(){
        //given
        Integer treadThickness = 1000001;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_treadThicknessNull_throwIllegalArgumentException(){
        //given
        Integer treadThickness = null;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

}
