package KBGY.Nutrient;

import KBGY.CalcultKkal.CalorieComponent;
import KBGY.CalcultKkal.Kkal;
import KBGY.People;

public class CalorieToNutrientAdapter implements INutrient {
    private CalorieComponent calorieComponent;
    private Kkal kkal;

    public CalorieToNutrientAdapter(CalorieComponent calorieComponent, Kkal kkal) {
        this.calorieComponent = calorieComponent;
        this.kkal = kkal;
    }

    @Override
    public double calculateAmount(People pep) {
        return calorieComponent.calculateCalories(pep, kkal);
    }
}
