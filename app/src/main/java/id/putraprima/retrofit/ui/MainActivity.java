package id.putraprima.retrofit.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.putraprima.retrofit.R;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_KEY="name";
    public static final String VERSION_KEY="version";
    TextView name, version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.mainTxtAppName);
        version=findViewById(R.id.mainTxtAppVersion);

        Bundle extra=getIntent().getExtras();
        if (extra!=null){
            name.setText(extra.getString(NAME_KEY));
            version.setText(extra.getString(VERSION_KEY));
        }
    }
}
