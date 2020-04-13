public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();


        float bmi = bmiService.calculate(165, 50);
        float bmi = bmiService.calculate(190, 112);
        float bmi = bmiService.calculate(165, 60);
        float bmi = bmiService.calculate(175, 110);
        float bmi = bmiService.calculate(165, 70);
        float bmi = bmiService.calculate(155, 50);

    }
}
