package informatico.to.App;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Activamos el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //indicamos el drawable del action bar
        getSupportActionBar().setIcon(R.drawable.ic_action_name);

    }
    /*Notificacion toast simple*/
         public void NotifiSimple(View v1){
             Toast toast = Toast.makeText(getApplicationContext(),"Este es un Toast Simple con Alineación",Toast.LENGTH_LONG);
             toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,500);
             toast.show();
        }
    /*Notificacion toast personalizado con imagen*/
        public void Notifipersonalizado(View v2){
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.relativeLayout1));
            Toast toast = new Toast(getApplicationContext());
            toast.setView(view);
            toast.show();
            }

        public void NotificacionToasImgPerson(View v){
            /*Notificacion toast personalizado con imagen y alineacion */
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_toast_fron_end, (ViewGroup) findViewById(R.id.constrain));
            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,500);
            toast.setView(view);
            toast.show();
        }

}