public class BmiService {
    public float calculate (float height, float weight) {
        float heightmeter = height / 100;                   // перевод роста в метры
        float bmi = weight / (height_m * height_m);

        System.out.println("At height " + height + " and weight " + weight + " BMI = " + bmi);

        return bmi;
    }
}
