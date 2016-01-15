package escolaarcadia.blogspot.com.br.log;

/*
prof. Martin Morães
    http://lattes.cnpq.br/2746554350570335
    http://escolaarcadia.blogspot.com.br/
    https://github.com/martinmoraes
    https://www.youtube.com/channel/UCLih7IZ3jwhfkLg-Q0vb9Lg

Este código está disponível em: https://github.com/martinmoraes/Android-Log

 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MEU_APP", "Passou pelo onCreate");
        Log.i("MEU_APP", "Outra mensagem");
    }

    public void executa(View view){
        Log.d("MEU_APP", "Passou pelo método executa");
        Log.e("MEU_APP","um erro qualquer.");
    }
}
