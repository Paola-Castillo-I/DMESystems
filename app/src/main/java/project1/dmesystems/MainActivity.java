 package project1.dmesystems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar barra_calificar;
    Button boton_calificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventoBoton();

    }

    public void eventoBoton() {
        barra_calificar = (RatingBar) findViewById(R.id.barra_estrellas);
        boton_calificar = (Button) findViewById(R.id.boton_calificar);
        boton_calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no_strellas = "gracias por calificar con "
                        + String.valueOf(barra_calificar.getRating())
                        + " estrellas a esta aplicacion.";
                Toast.makeText(getApplicationContext(), no_strellas, Toast.LENGTH_LONG).show();
            }
        });
    }
}


