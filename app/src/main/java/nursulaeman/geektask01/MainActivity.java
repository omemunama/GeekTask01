package nursulaeman.geektask01;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnC, btnB;
    EditText editText1, editText2, editTextn;
    TextView textView;

    String result;

    int mValueOne, mValueTwo, mBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        btnC = (Button) findViewById(R.id.buttonC);
        btnB = (Button) findViewById(R.id.buttonBack);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView1);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnB.setOnClickListener(this);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(getCurrentFocus()==editText1){
            editTextn = editText1;
        } else if (getCurrentFocus()==editText2){
            editTextn = editText2;
        }

        int strat = editTextn.getSelectionStart();

        switch (v.getId()) {
            case R.id.button1:
                btn(strat,"1");
                break;
            case R.id.button2:
                btn(strat,"2");
                break;
            case R.id.button3:
                btn(strat,"3");
                break;
            case R.id.button4:
                btn(strat,"4");
                break;
            case R.id.button5:
                btn(strat,"5");
                break;
            case R.id.button6:
                btn(strat,"6");
                break;
            case R.id.button7:
                btn(strat,"7");
                break;
            case R.id.button8:
                btn(strat,"8");
                break;
            case R.id.button9:
                btn(strat,"9");
                break;
            case R.id.button0:
                btn(strat,"0");
                break;
            case R.id.buttonC:
                editTextn.setText("");
                break;
            case R.id.buttonBack:
                if (strat > 0) {
                    editTextn.setText(editTextn.getText().delete(strat - 1, strat));
                    editTextn.setSelection(strat - 1);
                }
                break;
            case R.id.fab:
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();
                if (text1.isEmpty() && text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "text1 & text2 is empty!", Toast.LENGTH_LONG).show();
                } else if (text1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "text1 is empty!", Toast.LENGTH_LONG).show();
                } else if (text2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "text2 is empty!", Toast.LENGTH_LONG).show();
                } else {
                    mValueOne = Integer.parseInt(editText1.getText().toString());
                    mValueTwo = Integer.parseInt(editText2.getText().toString());
                    mBalance = mValueOne - mValueTwo;
                    result = Integer.toString(mBalance);
                    textView.setText(result);
                }
                break;
        }
    }

    public void btn(int start,String s){
        editTextn.setText(editTextn.getText().insert(start, s));
        editTextn.setSelection(start + 1);
    }

}
