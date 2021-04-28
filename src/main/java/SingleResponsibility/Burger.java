package SingleResponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Burger {

    private String name;
    private Double price;
    private List<String> composition;
    private boolean isCooked=false;

    public Burger(String name, Double price, List<String> composition) {
        this.name = name;
        this.price = price;
        this.composition = composition;
    }

    public Double setPriceWithVat(Double price){
        return price*0.21;
    }

    public String addToNameBurger(String name){
        return name+" "+"Burger";
    }

    //dont write the method for cooking here, create separate class for that
}
