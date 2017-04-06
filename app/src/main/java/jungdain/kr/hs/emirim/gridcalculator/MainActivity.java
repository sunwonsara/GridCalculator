package jungdain.kr.hs.emirim.gridcalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button[] butNums = new Button[10];
    Button[] butOps=new Button[4];//사칙연산 배열
//    int[] ids={R.id.but_num1,R.id.but_num2,R.id.but_num3,R.id.but_num4,R.id.but_num5,
//               R.id.but_num6,R.id.but_num7,R.id.but_num8,R.id.but_num9,R.id.but_num10}

    /*  [노가다로 푸는 방법]
        EditText edit1;
        EditText edit2;
        TextView text_result;
        Button butPlus;
        Button butMinus;
        Button butMultiply;
        Button butDivision;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            butPlus=(Button)findViewById(R.id.but_plus);
            butPlus.setOnClickListener(butHandler);

            butMinus=(Button)findViewById(R.id.but_minus);
            butMinus.setOnClickListener(butHandler);

            butMultiply=(Button)findViewById(R.id.but_multiply);
            butMultiply.setOnClickListener(butHandler);

            butDivision=(Button)findViewById(R.id.but_division);
            butDivision.setOnClickListener(butHandler);


        }

        View.OnClickListener butHandler=new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int a = Integer.parseInt(edit1.getText().toString());
                int b = Integer.parseInt(edit1.getText().toString());
                int result=0;

                switch(v.getId()){

                }
            }

        };
    }
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < butNums.length; i++) {
            butNums[i] = (Button) findViewById(R.id.but_num1 + i);
            butNums[i].setOnClickListener(butNumHandler);
        }

        for (int i = 0; i < butOps.length; i++) {
            butNums[i] = (Button) findViewById(R.id.but_op1 + i);
            butNums[i].setOnClickListener(butOpHandler);
        }
    }
    View.OnClickListener butNumHandler=new View.OnClickListener(){
      @Override
      public void onClick(View v) {

      }
    };

        View.OnClickListener butOpHandler=new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        };

}
