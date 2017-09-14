package com.example.admin.calendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvRs;
    private Button btnReseach;
    private EditText txtYear;
    String getCan(int can){
        switch (can)
        {
            case 0: return "Canh";
            case 1: return "Tân";
            case 2: return "Nhâm";
            case 3: return "Quý";
            case 4: return "Giáp";
            case 5: return "Ất";
            case 6: return "Bính";
            case 7: return "Đinh";
            case 8: return "Mậu";
            case 9: return "Kỷ";
            default:return "";
        }
    }
    String getChi(int chi){
        switch (chi)
        {
            case 0: return "Thân";
            case 1: return "Dậu";
            case 2: return "Tuất";
            case 3: return "Hợi";
            case 4: return "Tý";
            case 5: return "Sửu";
            case 6: return "Dần";
            case 7: return "Mẹo";
            case 8: return "Thìn";
            case 9: return "Tị";
            case 10: return "Ngọ";
            case 11: return "Mùi";
            default:return "";
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRs =(TextView) findViewById(R.id.tvRs);
        btnReseach = (Button) findViewById(R.id.btnReseach);
        txtYear = (EditText) findViewById(R.id.txtYear);

        btnReseach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int can = Integer.parseInt(txtYear.getText().toString()) % 10;
                    int chi = Integer.parseInt(txtYear.getText().toString()) % 12;
                    tvRs.setText("Năm âm lịch là: " + getCan(can) + " " + getChi(chi));
                }
                catch (Exception er) {
                    tvRs.setText("Bạn nhập sai dữ liệu");
                }
            }
        });
    }
}
