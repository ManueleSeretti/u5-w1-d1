package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public class Pizze {
    private String nome;
    private List<String> ingredienti;
    private int calorie;
    private double prezzo;
}
