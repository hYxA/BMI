public class BmiService {
    public float calculate (float weight, int height) {
        float bmi = weight / (height * height);
        return bmi;
    }
}
