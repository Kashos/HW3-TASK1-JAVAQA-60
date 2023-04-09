public class BonusMilesService {
    public int calculate (int a) {
        int rublePerMiles = 20; //кол-во рублей для 1 бонусной мили
        int result = a /rublePerMiles ; //Расчт бонусных миль
        return result;
    }
}
