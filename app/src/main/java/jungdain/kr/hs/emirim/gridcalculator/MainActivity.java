package jungdain.kr.hs.emirim.gridcalculator;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button[] butNums = new Button[10];
    Button[] butOps=new Button[4];//사칙연산 배열
    public static final int SELECT_EDIT1=0;
    public static final int SELECT_EDIT2=1;
    int SelectEdit=SELECT_EDIT1;
    String numStr="";
    int result=0;
    TextView text_result;

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
        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        edit1.setOnTouchListener(editHandler);
        edit2.setOnTouchListener(editHandler);
        text_result=(TextView)findViewById(R.id.text_result);

        for (int i = 0; i < butNums.length; i++) {
            butNums[i] = (Button) findViewById(R.id.but_num1 + i);
            butNums[i].setOnClickListener(butNumHandler);
        }

        for (int i = 0; i < butOps.length; i++) {
            butOps[i] = (Button) findViewById(R.id.but_op1 + i);
            butOps[i].setOnClickListener(butOpHandler);
        }
    }
    View.OnClickListener butNumHandler=new View.OnClickListener(){
      @Override
      public void onClick(View v) {
        Button but=(Button)v;
          numStr+=but.getText();
        switch(SelectEdit){
            case SELECT_EDIT1:
                edit1.setText(numStr);
                break;
            case SELECT_EDIT2:
                edit2.setText(numStr);
                break;
        }
      }
    };

        View.OnClickListener butOpHandler=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Button but=(Button)v;
                int int_edit1=Integer.parseInt(edit1.getText().toString());
                int int_edit2=Integer.parseInt(edit2.getText().toString());
                switch(v.getId()){
                    case R.id.but_op1:
                        result=int_edit1+int_edit2;
                        break;
                    case R.id.but_op2:
                        result=int_edit1-int_edit2;
                        break;
                    case R.id.but_op3:
                        result=int_edit1/int_edit2;
                        break;
                    case R.id.but_op4:
                        result=int_edit1*int_edit2;
                        break;

                }
                text_result.setText(result+"");
            }
        };
    View.OnTouchListener editHandler=new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            numStr="";
            switch(v.getId()){
                case R.id.edit1:
                    SelectEdit=SELECT_EDIT1;
                    break;
                case R.id.edit2:
                    SelectEdit=SELECT_EDIT2;
                    break;
            }
            return true;
        }
    };
}
