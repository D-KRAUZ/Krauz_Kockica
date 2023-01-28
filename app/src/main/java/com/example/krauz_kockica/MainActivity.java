package com.example.krauz_kockica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {


    int rand1;
    int rand2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1=(TextView)findViewById(R.id.textView);
        TextView tv2=(TextView)findViewById(R.id.textView2);
        final ConstraintLayout l1= (ConstraintLayout)findViewById(R.id.layout1);
        Button btn1 = (Button)findViewById(R.id.btn1);
        ImageView d6_1_1= (ImageView)findViewById(R.id.imageView2);
        ImageView d6_1_2= (ImageView)findViewById(R.id.imageView3);
        ImageView d6_1_3= (ImageView)findViewById(R.id.imageView4);
        ImageView d6_1_4= (ImageView)findViewById(R.id.imageView5);
        ImageView d6_1_5= (ImageView)findViewById(R.id.imageView6);
        ImageView d6_1_6= (ImageView)findViewById(R.id.imageView7);

        ImageView d6_2_1= (ImageView)findViewById(R.id.imageView13);
        ImageView d6_2_2= (ImageView)findViewById(R.id.imageView14);
        ImageView d6_2_3= (ImageView)findViewById(R.id.imageView15);
        ImageView d6_2_4= (ImageView)findViewById(R.id.imageView16);
        ImageView d6_2_5= (ImageView)findViewById(R.id.imageView17);
        ImageView d6_2_6= (ImageView)findViewById(R.id.imageView18);

        ImageView[] d6_1 = new ImageView[6];
        d6_1[0]=d6_1_1;
        d6_1[1]=d6_1_2;
        d6_1[2]=d6_1_3;
        d6_1[3]=d6_1_4;
        d6_1[4]=d6_1_5;
        d6_1[5]=d6_1_6;


        ImageView[] d6_2 = new ImageView[6];
        d6_2[0]=d6_2_1;
        d6_2[1]=d6_2_2;
        d6_2[2]=d6_2_3;
        d6_2[3]=d6_2_4;
        d6_2[4]=d6_2_5;
        d6_2[5]=d6_2_6;




        btn1.setOnClickListener(new OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v)
            {
                l1.setBackgroundColor(R.color.teal_200);
              for (int p=0;p<6;p++)
              {
                  d6_1[p].setVisibility(View.INVISIBLE);
                  d6_2[p].setVisibility(View.INVISIBLE);
              }



                rand1 = (int)(Math.random() * 6)+1;
                rand2 = (int)(Math.random() * 6)+1;

                tv1.setText(String.valueOf(rand1));
                tv2.setText(String.valueOf(rand2));

                for (int p=1;p<7;p++)
                {
                    for(int o=1;o<7;o++)
                    {
                        if (rand1 == p)
                        {
                                if (rand2 == o)
                                {
                                    d6_1[p-1].setVisibility(View.VISIBLE);
                                    d6_2[o-1].setVisibility(View.VISIBLE);
                                }
                        }
                    }
                }


            }

        });
    }

}