public class Calculator {
    private float number = 0;
    private float finalNumber = 0;

    public float playCalculator(){
        return number;
    }

    public float addNumber(float number){
        this.finalNumber += number;
        return finalNumber;
    }

    public float subNumber(float number){
        this.finalNumber -= number;
        return finalNumber;
    }

    public float multNumber(float number){
        this.finalNumber *= number;
        return finalNumber;
    }

    public float divNumber(float number){
        this.finalNumber /= number;
        return finalNumber;
    }

    public float getFinalNumber() {
        return finalNumber;
    }

    public void setFinalNumber(float finalNumber) {
        this.finalNumber = finalNumber;
    }
}
