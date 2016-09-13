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
    EditText editText1, editText2;
    TextView textView;

    String evalue, result;

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

        editText1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue = "1";
                return false;
            }
        });

        editText2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                evalue = "2";
                return false;
            }
        });

    }

    @Override
    public void onClick(View v) {

        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

/*
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        if (text1.isEmpty()) {
            Toast toast = Toast.makeText(MainActivity.this, "The edit text1 is empty!", Toast.LENGTH_LONG);
            toast.show();
        }

        if (text2.isEmpty()) {
            Toast toast = Toast.makeText(MainActivity.this, "The edit text2 is empty!", Toast.LENGTH_LONG);
            toast.show();
        }
*/
        switch (v.getId()) {
            case R.id.button1:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "1");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "1");
                }
                break;
            case R.id.button2:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "2");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "2");
                }
                break;
            case R.id.button3:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "3");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "3");
                }
                break;
            case R.id.button4:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "4");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "4");
                }
                break;
            case R.id.button5:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "5");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "5");
                }
                break;
            case R.id.button6:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "6");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "6");
                }
                break;
            case R.id.button7:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "7");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "7");
                }
                break;
            case R.id.button8:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "8");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "8");
                }
                break;
            case R.id.button9:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "9");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "9");
                }
                break;
            case R.id.button0:
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "0");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "0");
                }
                break;
            case R.id.buttonC:
                if (evalue == "1") {
                    editText1.setText(" ");
                }
                if (evalue == "2") {
                    editText2.setText(" ");
                }
                break;
            case R.id.buttonBack:
                if (evalue == "1") {
                    String str = editText1.getText().toString();
                    if (str.length() >= 1) {
                        str = str.substring(0, str.length() - 1);
                        editText1.setText(str);
                    } else if (str.length() <= 1) {
                        editText1.setText("");
                    }
                }
                if (evalue == "2") {
                    String str = editText2.getText().toString();
                    if (str.length() >= 1) {
                        str = str.substring(0, str.length() - 1);
                        editText2.setText(str);
                    } else if (str.length() <= 1) {
                        editText2.setText("");
                    }
                }
                break;

            case R.id.fab:
                if (TextUtils.isEmpty(editText1.getText().toString())) {
                    mValueOne = 0;
                } else {
                    mValueOne = Integer.parseInt(editText1.getText().toString());
                }
                if (TextUtils.isEmpty(editText2.getText().toString())) {
                    mValueTwo = 0;
                } else {
                    mValueTwo = Integer.parseInt(editText2.getText().toString());
                }

                if (text1.isEmpty()) {
                    Toast toast = Toast.makeText(MainActivity.this, "The edit text1 is empty!", Toast.LENGTH_LONG);
                    toast.show();
                }
                if (text2.isEmpty()) {
                    Toast toast = Toast.makeText(MainActivity.this, "The edit text2 is empty!", Toast.LENGTH_LONG);
                    toast.show();
                }

                mBalance = mValueOne - mValueTwo;
                if (mBalance != 0) {
                    result = Integer.toString(mBalance);
                    textView.setText(result);
                } else {
                    textView.setText("");
                }
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
