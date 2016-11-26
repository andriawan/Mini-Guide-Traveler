package traveler.miniguide.eastjava;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Content extends AppCompatActivity {

    String Header;
    String Desc;
    String webSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Bundle grabber = getIntent().getExtras();

        if (grabber != null){
            Header = grabber.getString("title");
            Desc = grabber.getString("content");
            webSource = grabber.getString("webSource");
        }

        getSupportActionBar().setTitle(Header);

        TextView header = (TextView) findViewById(R.id.header);
        header.setText(Header);
        TextView content = (TextView) findViewById(R.id.contentArea);
        content.setText(Desc);
        TextView wbsrc = (TextView) findViewById(R.id.sourceWeb);
        wbsrc.setText(webSource);
        wbsrc.setTypeface(Typeface.DEFAULT_BOLD);

        if(Header.equals("Ranukumbolo")){
            ImageView banner = (ImageView) findViewById(R.id.imageContent);
            banner.setImageResource(R.drawable.ranu);
        } else if(Header.equals("Gunung Bromo")){
            ImageView banner = (ImageView) findViewById(R.id.imageContent);
            banner.setImageResource(R.drawable.bromo2);
        } else if(Header.equals("Pantai Pasir Putih")){
            ImageView banner = (ImageView) findViewById(R.id.imageContent);
            banner.setImageResource(R.drawable.pasput);
        } else if(Header.equals("Teluk Love")){
            ImageView banner = (ImageView) findViewById(R.id.imageContent);
            banner.setImageResource(R.drawable.love);
        } else if(Header.equals("Kawah Ijen")){
            ImageView banner = (ImageView) findViewById(R.id.imageContent);
            banner.setImageResource(R.drawable.ijen);
        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
