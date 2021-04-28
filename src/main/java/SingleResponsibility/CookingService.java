package SingleResponsibility;

import java.util.List;

public class CookingService {

    public List<String> assembleBurger(String bun, String meat, String lettuce, String extra){
        return List.of(bun, meat, lettuce, extra);
    }

    public void cookBurger(Burger burger){
       burger.setCooked(true);
    }
}
