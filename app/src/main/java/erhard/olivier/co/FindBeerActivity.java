package erhard.olivier.co;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindBeerActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
        private BeerExpert expert = new BeerExpert();
        //chamado quando o botao é clicado
    public void onClickFindBeer(View view){
        //Obtem referencia para o TextView
        TextView sabores = (TextView) findViewById(R.id.sabores);
        //obtem referencia para spinner
        Spinner cor = (Spinner) findViewById(R.id.tipo);
        //Obtem item selecionado do spinner
        String tipoCerveja = String.valueOf(cor.getSelectedItem());
        //Exibe item selecinado
        List<String> listaSabores = expert.escolheSabores(tipoCerveja);
        StringBuilder saboresFormatado = new StringBuilder();
        for (String sabor: listaSabores){
            saboresFormatado.append(sabor).append("\n");

        };
        sabores.setText(saboresFormatado);




    }

}