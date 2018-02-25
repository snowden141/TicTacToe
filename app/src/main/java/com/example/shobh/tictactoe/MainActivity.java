package com.example.shobh.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    int turn;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1= findViewById(R.id.b1);
        bt2= findViewById(R.id.b2);
        bt3= findViewById(R.id.b3);
        bt4= findViewById(R.id.b4);
        bt5= findViewById(R.id.b5);
        bt6= findViewById(R.id.b6);
        bt7= findViewById(R.id.b7);
        bt8= findViewById(R.id.b8);
        bt9= findViewById(R.id.b9);
        res=findViewById(R.id.result);
        turn=1;

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt1.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt1.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt1.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt2.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt2.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt2.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt3.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt3.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt3.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt4.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt4.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt4.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt5.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt5.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt5.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt6.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt6.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt6.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt7.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt7.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt7.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt8.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt8.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt8.setText("O");
                    }
                }
                lookgame();
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bt9.getText().toString().equals("")){

                    if(turn==1)
                    {
                        turn=2;
                        bt9.setText("X");
                    }
                    else if(turn==2)
                    {
                        turn=1;
                        bt9.setText("O");
                    }
                }
                lookgame();
            }
        });
    }



    public void lookgame() {
        String a, b, c, d, e, f, g, h, i;
        a = bt1.getText().toString();
        b = bt2.getText().toString();
        c = bt3.getText().toString();
        d = bt4.getText().toString();
        e = bt5.getText().toString();
        f = bt6.getText().toString();
        g = bt7.getText().toString();
        h = bt8.getText().toString();
        i = bt9.getText().toString();

        if (a.equals(b) && a.equals(c) && a.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (a.equals(e) && a.equals(i) && a.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (a.equals(d) && a.equals(g) && a.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (b.equals(e) && b.equals(h) && b.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (c.equals(f) && c.equals(i) && c.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (d.equals(e) && d.equals(f) && d.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (g.equals(h) && g.equals(i) && g.equals("X")) {
            res.setText("X wins !");
            disable();
        }

        if (c.equals(e) && c.equals(g) && c.equals("X")) {
            res.setText("X wins !");
            disable();
        }


        if (a.equals(b) && a.equals(c) && a.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (a.equals(e) && a.equals(i) && a.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (a.equals(d) && a.equals(g) && a.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (b.equals(e) && b.equals(h) && b.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (c.equals(f) && c.equals(i) && c.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (d.equals(e) && d.equals(f) && d.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (g.equals(h) && g.equals(i) && g.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (c.equals(e) && c.equals(g) && c.equals("O")) {
            res.setText("O wins !");
            disable();
        }

        if (!a.equals("")&&!b.equals("")&&!c.equals("")&&!d.equals("")&&!e.equals("")&&!f.equals("")&&!g.equals("")&&!h.equals("")&&
        !i.equals(""))
        {
            res.setText("its a draw !!");
        }

    }

    public void disable()
    {
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt3.setEnabled(false);
        bt4.setEnabled(false);
        bt5.setEnabled(false);
        bt6.setEnabled(false);
        bt7.setEnabled(false);
        bt8.setEnabled(false);
        bt9.setEnabled(false);


    }

    public void reset(View view)
    {
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");

        res.setText("");

        bt1.setEnabled(true);
        bt2.setEnabled(true);
        bt3.setEnabled(true);
        bt4.setEnabled(true);
        bt5.setEnabled(true);
        bt6.setEnabled(true);
        bt7.setEnabled(true);
        bt8.setEnabled(true);
        bt9.setEnabled(true);
    }
}
