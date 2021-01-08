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
        //por el icno en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_action_name);

    }

         public void NotifiSimple(View v1){
             Toast toast = Toast.makeText(getApplicationContext(),"Este es un Toast Simple con Alineación",Toast.LENGTH_LONG);
             toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,500);
             toast.show();
        }
        public void Notifipersonalizado(View v2){
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.relativeLayout1));
            Toast toast = new Toast(getApplicationContext());
            toast.setView(view);
            toast.show();
            }


}