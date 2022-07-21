package serviceClasses;

import settings.Banks;
import java.util.HashMap;

public class CurrencyDataBase {
    public static HashMap<Banks, Bank> currentInfo = new HashMap<>();

    public Bank getCurrentInfo(Banks bankName) {
        return currentInfo.get(bankName);
    }

    public void setCurrentInfo(Banks bankName, Bank bank) {
        currentInfo.put(bankName, bank);
    }

    /*
        1) Витягує з мапи значення по ключу для конкретного банку
        2) Зчитує поле Time і:
        2.1) якщо значення <5 хвилин, то вертає користувачеві актуальне значення отримане з мапи
        2.2) якщо значення >5 хвилин, то
             - робить новий запит до конкретного банку
             - записує результат цього запиту в мапу (перезапис даних, викликає метод запису в мапу hashmap Info)
             - вертає користувачеві актуальне значення
    */
}
