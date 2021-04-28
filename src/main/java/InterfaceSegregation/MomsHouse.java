package InterfaceSegregation;

import InterfaceSegregation.parties.SoberParties;

public class MomsHouse implements SoberParties {
    @Override
    public void soberParties() {
        System.out.println("Sounds about right");
    }
}
