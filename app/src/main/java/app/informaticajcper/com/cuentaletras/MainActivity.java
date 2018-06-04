package app.informaticajcper.com.cuentaletras;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText input;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
         input=(EditText)findViewById(R.id.input);
         result =(TextView)findViewById(R.id.result);
    }

    public void onClick(View v){
        //Comprobamos el tamaño del texto del EditText
        int numLetras=input.getText().length();
        //Actualizamos el mensaje del TextView
        result.setText(numLetras+ " letras");

    }
}
