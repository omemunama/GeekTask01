package nursulaeman.geektask01;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnC, btnB;
    EditText editText1;
    EditText editText2;
    TextView textView;

    String evalue, result;

    float mValueOne, mValueTwo, mBalance;

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "1");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "2");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "2");
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "3");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "3");
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "4");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "4");
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "5");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "5");
                }

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "6");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "6");
                }

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "7");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "7");
                }

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "8");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "8");
                }

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "9");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "9");
                }

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(editText1.getText() + "0");
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText() + "0");
                }

            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (evalue == "1") {
                    editText1.setText(" ");
                }
                if (evalue == "2") {
                    editText2.setText(" ");
                }


            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText1.getText().toString())
                        || TextUtils.isEmpty(editText2.getText().toString())) {
                    return;
                }
                mValueOne = Float.parseFloat(editText1.getText().toString());
                mValueTwo = Float.parseFloat(editText2.getText().toString());
                if (mValueOne != 0 && mValueTwo != 0) {
                    mBalance = mValueOne - mValueTwo;
                    result = Float.toString(mBalance);
                    textView.setText(result);
                }
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
