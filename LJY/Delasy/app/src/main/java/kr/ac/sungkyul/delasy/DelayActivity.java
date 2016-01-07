package kr.ac.sungkyul.delasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DelayActivity extends AppCompatActivity {
    Button btnWrite;
    Button btnDelete;
    EditText edtText;
    TextView textView;
    Button btnRun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delay);

        btnWrite = (Button)findViewById(R.id.btn1);
        btnDelete = (Button)findViewById(R.id.btn2);
        edtText = (EditText)findViewById(R.id.edTxt);
        textView = (TextView)findViewById(R.id.txtV);
        btnRun=(Button)findViewById(R.id.btnRun);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edtText.getText().toString();
                textView.setText(a);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b=" ";
                textView.setText(b);
            }
        });
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(DelayActivity.this,test1.class);
                startActivity(it);
            }
        });
    }
}
