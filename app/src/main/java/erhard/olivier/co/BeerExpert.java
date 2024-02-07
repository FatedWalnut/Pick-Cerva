package erhard.olivier.co;
import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    List<String> escolheSabores(String tipo){
        List<String> sabores = new ArrayList<>();
        if(tipo.equals("Cerveja Brasileira")){
            sabores.add("Itaipava pra cagar");
            sabores.add("Skol pra mijar");
            sabores.add("Cristal pra morrer");
        }
        if(tipo.equals("Cerveja Leve")){
            sabores.add("Stella Artois, nem boa nem ruim");
            sabores.add("Becks? Que caralhos é Becks haha");
            sabores.add("Budweiser, Ta rico pra kct em");
        }
        if (tipo.equals("Cerveja Escura")){
            sabores.add("Caracu, carai nome feio mas ok");
            sabores.add("Schornstein Bock, Dahora a marca nunca tomei mas parece top");
            sabores.add("Chimay Blue Dark Strong Ale, CARALHO TEM NOME MAIS LONGO QUE CARTA DE YU-GI-HO");

        }
        if(tipo.equals("Cerveja Alemã")){
            sabores.add("Eisenbahn, ok nada contra");
            sabores.add("SCHNEIDER tem nome de gente parece dahora");
            sabores.add("PAULANER, dahora mt bom");
        }
        return  sabores;
    }
}
