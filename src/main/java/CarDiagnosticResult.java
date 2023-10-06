public class CarDiagnosticResult {

    private String carId;
    private boolean diagnosticResult;

    public CarDiagnosticResult(String carId, boolean diagnosticResult){
        this.carId = carId;
        this.diagnosticResult = diagnosticResult;
    }

    public String getCarId(){
        return  carId;
    }
    public void setCarId(String carId){
        this.carId = carId;
    }

    public boolean isDiagnosticResult(){
        return diagnosticResult;
    }

    public void setDiagnosticResult(boolean diagnosticResult){
        this.diagnosticResult = diagnosticResult;
    }
}
