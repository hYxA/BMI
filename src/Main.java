public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        float bmi;

        bmi = bmiService.calculate(165, 50);
        bmi = bmiService.calculate(190, 112);
        bmi = bmiService.calculate(165, 60);
        bmi = bmiService.calculate(175, 110);
        bmi = bmiService.calculate(165, 70);
        bmi = bmiService.calculate(155, 50);

    }
}
