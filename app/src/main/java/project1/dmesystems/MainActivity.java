 package project1.dmesystems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //Declaramos nuestras variables de tipo vistas para que sea mas facil el manejo de nuestros recursos
    RatingBar barra_calificar;
    Button boton_calificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //Mandamos llamar al metodo de boton
        eventoBoton();

    }

    //Usamos el metodo de eventoBoton para calificar nuestro negocio
    public void eventoBoton() {
     //Buscamos nuestros recursos con el metodo findview para las estrellas y para el boton de calificar
        barra_calificar = (RatingBar) findViewById(R.id.barra_estrellas);
        boton_calificar = (Button) findViewById(R.id.boton_calificar);
        boton_calificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //Al momento de calificar con el evento del boton ejecuta el metodo onClick, donde mandamos un mensaje
             //dando las gracias por calificar la aplicación y la mostramos
                String no_strellas = "gracias por calificar con "
                        + String.valueOf(barra_calificar.getRating())
                        + " estrellas a esta aplicacion.";
                Toast.makeText(getApplicationContext(), no_strellas, Toast.LENGTH_LONG).show();
            }
        });
    }
}


