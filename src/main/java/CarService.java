public class CarService {
    public CarService() {
    }

    public boolean analyzeCarByParams(Integer treadThickness, Integer fuelUsage, Integer carMillage) {
        boolean millageNull = null == carMillage;
        boolean fuelUsageNull = null == fuelUsage;
        boolean treadThicknessNull = null == treadThickness;
        if (!millageNull && !fuelUsageNull && !treadThicknessNull) {
            boolean isMillageCorrect = this.isCorrect(carMillage, ParamValues.CAR_MILLAGE);
            boolean isFuelUsageCorrect = this.isCorrect(fuelUsage, ParamValues.FUEL_USAGE);
            boolean isTreadThicknessCorrect = this.isCorrect(treadThickness, ParamValues.TREAD_THICKNESS);
            return isMillageCorrect && isFuelUsageCorrect && isTreadThicknessCorrect;
        } else {
            throw new IllegalArgumentException("Car details can not be null");
        }
    }

    private boolean isCorrect(Integer value, ParamValues validValues) {
        if (value < 0) {
            throw new IllegalArgumentException("Incorrect value");
        } else {
            Integer maxValue = validValues.getMaxValue();
            Integer minValue = validValues.getMinValue();
            return value > minValue && value < maxValue;
        }
    }
}
