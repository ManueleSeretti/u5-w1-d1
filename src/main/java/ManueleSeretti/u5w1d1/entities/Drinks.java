package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Drinks {
    private String nome;
    private int calorie;
    private double prezzo;
    private double quantità;

}
