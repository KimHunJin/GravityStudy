package kr.ac.sungkyul.delasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class test1 extends AppCompatActivity {
    EditText edtTxt;
    Button btnRun;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        btnRun = (Button)findViewById(R.id.btn);
        edtTxt = (EditText)findViewById(R.id.edTxt1);
        txtView = (TextView)findViewById(R.id.txtV);

        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText("");

                String a=edtTxt.getText().toString();
                int input = Integer.parseInt(a);
                for (int i=0;i<=input;i++){
                    for (int j=0;j<i;j++){
                       // txtView.setText(txtView.getText());

                        txtView.setText(txtView.getText().toString()+"*");
                    }
                    txtView.setText(txtView.getText().toString()+"\n");
                }
            }
        });
    }
}
