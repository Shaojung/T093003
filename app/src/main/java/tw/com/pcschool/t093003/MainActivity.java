package tw.com.pcschool.t093003;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void clickRead(View v)
    {
        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        TextView tv = (TextView)findViewById(R.id.textView);
        String str = sp.getString("name", "");
        tv.setText(str);
    }
    public void clickWrite(View v)
    {
        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        EditText editText = (EditText) findViewById(R.id.editText);
        ed.putString("name", editText.getText().toString());
        ed.commit();
    }
}
