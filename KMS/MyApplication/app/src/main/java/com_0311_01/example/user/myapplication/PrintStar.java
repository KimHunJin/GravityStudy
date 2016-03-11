package com_0311_01.example.user.myapplication;

import android.content.SyncStatusObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStar extends AppCompatActivity {
    Button btnOk;
    EditText edtNum;
    TextView txtPrint;
    int Num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);

        btnOk=(Button)findViewById(R.id.btnOk);
        edtNum=(EditText)findViewById(R.id.edtNum);
        txtPrint=(TextView)findViewById(R.id.txtPrint);


        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPrint.setText("");
                Num =Integer.parseInt(edtNum.getText().toString());

                for(int j=0;j<Num;j++){
                    txtPrint.setText(txtPrint.getText().toString()+"\n");
                    for(int i=0;i<=j;i++){
                        txtPrint.setText(txtPrint.getText().toString()+"*");
                    }
                }
            }
        });

    }
}
