public class BonusMilesService {
    public int calculate(int price) {
        int rublePerMiles = 20; //кол-во рублей для 1 бонусной мили
        int result = price / rublePerMiles; //Расчт бонусных миль
        return result;
    }
}
