package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class menu {
    private List<Pizze> pizze;
    private List<Toppings> toppings;
    private List<Drinks> bevande;
}
