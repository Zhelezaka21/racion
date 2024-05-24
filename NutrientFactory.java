package KBGY.Nutrient;

import KBGY.Nutrient.BGY.Carbohydrate;
import KBGY.Nutrient.BGY.Fat;
import KBGY.Nutrient.BGY.Protein;
import KBGY.People;

public class NutrientFactory {
    public static INutrient createProteins(People pep) {
        return new Protein();
    }

    public static INutrient createFats(People pep) {
        return new Fat();
    }

    public static INutrient createCarbohydrates(People pep) {
        return new Carbohydrate();
    }
}
