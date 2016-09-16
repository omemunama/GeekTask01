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

        int st1 = editText1.getSelectionStart();
        int st2 = editText2.getSelectionStart();

        switch (v.getId()) {
            case R.id.button1:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "1"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "1"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button2:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "2"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "2"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button3:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "3"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "3"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button4:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "4"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "4"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button5:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "5"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "5"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button6:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "6"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "6"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button7:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "7"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "7"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button8:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "8"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "8"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button9:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "9"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "9"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.button0:
                if (evalue == "1") {
                    editText1.setText(editText1.getText().insert(st1, "0"));
                    if (st1 != 0) {
                        editText1.setSelection(st1 + 1);
                    } else {
                        editText1.setSelection(editText1.getText().length());
                    }
                }
                if (evalue == "2") {
                    editText2.setText(editText2.getText().insert(st2, "0"));
                    if (st1 != 0) {
                        editText2.setSelection(st1 + 1);
                    } else {
                        editText2.setSelection(editText2.getText().length());
                    }
                }
                break;
            case R.id.buttonC:
                if (evalue == "1") {
                    editText1.setText("");
                }
                if (evalue == "2") {
                    editText2.setText("");
                }
                break;
            case R.id.buttonBack:
                if (evalue == "1") {
                    int cursorPosition = editText1.getSelectionStart();
                    if (cursorPosition > 0) {
                        editText1.setText(editText1.getText().delete(cursorPosition - 1, cursorPosition));
                        editText1.setSelection(cursorPosition - 1);
                    }
                }
                if (evalue == "2") {
                    int cursorPosition = editText2.getSelectionStart();
                    if (cursorPosition > 0) {
                        editText2.setText(editText2.getText().delete(cursorPosition - 1, cursorPosition));
                        editText2.setSelection(cursorPosition - 1);
                    }
                }
                break;

            case R.id.fab:
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
