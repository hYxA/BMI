public class BmiService {
    public float calculate (float weight, int height) {
        float bmi = weight / (height * height);

        System.out.println("At height " + height + " and weight" + weight + " BMI = " + bmi);

        return bmi;
    }
}
