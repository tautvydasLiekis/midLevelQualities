package InterfaceSegregation;

import InterfaceSegregation.parties.BabyShowerParties;
import InterfaceSegregation.parties.DrinkingParties;

public class Church implements DrinkingParties, BabyShowerParties {
    @Override
    public void babyShowerParties() {
        System.out.println("Should we be doing this here?");
    }

    @Override
    public void drinkingParties() {
        System.out.println("There is some wine in the back");
    }
}
