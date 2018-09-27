package com.example.apple.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView grades_A;
    private TextView grades_B;

    private Button addpoint3_A;
    private Button addpoint2_A;
    private Button free_throw_A;

    private Button addpoint3_B;
    private Button addpoint2_B;
    private Button free_throw_B;

    private Button resert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grades_A = (TextView) findViewById(R.id.gradeA);
        grades_B = (TextView) findViewById(R.id.gradeB);

        addpoint3_A = (Button) findViewById(R.id.point3_A);
        addpoint2_A = (Button) findViewById(R.id.point2_A);
        free_throw_A = (Button) findViewById(R.id.freethrow_A);

        addpoint3_B = (Button) findViewById(R.id.point3_B);
        addpoint2_B = (Button) findViewById(R.id.point2_B);
        free_throw_B = (Button) findViewById(R.id.freethrow_B);

        resert = (Button) findViewById(R.id.resert);

        addpoint3_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("team A", "onClick: team A add 3 points");
                Integer gA = Integer.valueOf(grades_A.getText().toString()).intValue();
                gA = gA + 3;
                grades_A.setText(gA+"");
            }
        });

        addpoint2_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("teamA", "onClick: team A add 2 points");
                Integer gA = Integer.valueOf(grades_A.getText().toString()).intValue();
                gA = gA + 2;
                grades_A.setText(gA+"");
            }
        });

        free_throw_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("team A", "onClick: team A free throw");
                Integer gA = Integer.valueOf(grades_A.getText().toString()).intValue();
                gA = gA + 1;
                grades_A.setText(gA+"");
            }
        });

        addpoint3_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("team B", "onClick: team B add 3 points");
                Integer gB = Integer.valueOf(grades_B.getText().toString()).intValue();
                gB = gB + 3;
                grades_B.setText(gB+"");
            }
        });

        addpoint2_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("team B", "onClick: team B add 2 points");
                Integer gB = Integer.valueOf(grades_B.getText().toString()).intValue();
                gB = gB + 2;
                grades_B.setText(gB+"");
            }
        });

        free_throw_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("team B", "onClick: team B free throw");
                Integer gB = Integer.valueOf(grades_B.getText().toString()).intValue();
                gB = gB + 1;
                grades_B.setText(gB+"");
            }
        });

        resert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("RESERT", "onClick: RESERT");
                grades_A.setText("0");
                grades_B.setText("0");

            }
        });






    }
}
