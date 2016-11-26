package traveler.miniguide.eastjava;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        showDialog();

    }


    public void showDialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.message_from_andriawan).setTitle(R.string
                .info_header);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void onBannerClicked(View v){
        showDialog();
    }

    public void onRanuClicked(View v){

        Intent i = new Intent(Home.this,Content.class);
        i.putExtra("title",getString(R.string.Ranukumbolo));
        i.putExtra("content",getString(R.string.Ranu_desc));
        i.putExtra("webSource",getString(R.string.web_source_ranu));
        startActivity(i);
    }

    public void onBromoClicked(View v){

        Intent i = new Intent(Home.this,Content.class);
        i.putExtra("title",getString(R.string.Bromo));
        i.putExtra("content",getString(R.string.Bromo_desc));
        i.putExtra("webSource",getString(R.string.web_source_bromo));
        startActivity(i);
    }

    public void onPasirPutihClicked(View v){

        Intent i = new Intent(Home.this,Content.class);
        i.putExtra("title",getString(R.string.Pasir_Putih));
        i.putExtra("content",getString(R.string.Pasir_Putih_desc));
        i.putExtra("webSource",getString(R.string.web_source_pasput));
        startActivity(i);
    }

    public void onLoveClicked(View v){

        Intent i = new Intent(Home.this,Content.class);
        i.putExtra("title",getString(R.string.Teluk_Love));
        i.putExtra("content",getString(R.string.Teluk_Love_desc));
        i.putExtra("webSource",getString(R.string.web_source_love));
        startActivity(i);
    }

    public void onIjenClicked(View v){

        Intent i = new Intent(Home.this,Content.class);
        i.putExtra("title",getString(R.string.ijen));
        i.putExtra("content",getString(R.string.Ijen_desc));
        i.putExtra("webSource",getString(R.string.web_source_ijen));
        startActivity(i);
    }
}
