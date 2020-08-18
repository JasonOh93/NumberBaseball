package com.jasonoh.day0514numberbaseballex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    Button btn;
    EditText et1;
    EditText et2;
    EditText et3;
    int com1, com2, com3;
    int num1 = 0, num2 = 0, num3 = 0;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        btn = findViewById(R.id.btn);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);



        //랜덤한 숫자 가져오기
        Random rnd = new Random();

        while(true) {
            num1 = rnd.nextInt(10); // 0~9
            num2 = rnd.nextInt(10); // 0~9
            num3 = rnd.nextInt(10); // 0~9

            if( (num1 != num2) && (num2 != num3) && (num1 != num3) ) break;
        }

        // 랜덤한 숫자 같은지 비교
        tv2.setText( num1 + " 와 " + num2 + " 와 " + num3  + "\n"  );


        //버튼을 클릭하면 작동
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                    if( et1.getText().equals("") || et2.getText().equals("") || et3.getText().equals("")) tv2.append("0~9까지의 수를 작성하세요" + "\n" );
////                    if( (et1.getText() == null) || (et2.getText() == null) || (et3.getText() ==null)) tv2.append("0~9까지의 수를 작성하세요" + "\n" );
//                    else{
//                        //입력 받은 값과 같은지 비교
//                        Editable ea = et1.getText();
//                        String s = ea.toString();
//                        com1 = Integer.parseInt( s );
//
//                        ea = et2.getText();
//                        s = ea.toString();
//                        com2 = Integer.parseInt( s );
//
//                        ea = et3.getText();
//                        s = ea.toString();
//                        com3 = Integer.parseInt( s );
//                        if( ((com1 > 0) && (com1 <10)) && ((com2 > 0) && (com2 <10)) && ((com3 > 0) && (com3 <10)) ) {
//                            int strike = 0, ball = 0;
//
//                            if( (com1 == num1) ) strike++;
//                            else if( (com1 == num2) || (com1 == num3) ) ball++;
//                            if( (com2 == num2) ) strike++;
//                            else if( (com2 == num1) || (com2 == num3) ) ball++;
//                            if( (com3 == num3) ) strike++;
//                            else if( (com3 == num1) || (com3 == num2) ) ball++;
//
//                            if( (com1 == num1) && (com2 == num2) && (com3 == num3) ) {
//                                tv2.append( (count + 1) + "회 : " + strike + " strike" + ball + " ball" + "\n" );
//                                tv2.append( "축하합니다." + "\n" );
//                            }
//                            else tv2.append( (count + 1) + "회 : " + strike + " strike" + ball + " ball" + "\n");
//
//
//                            count++;
//
//
//                        }// inner if
//                        else tv2.append("0~9까지의 수를 작성하세요" + "\n" );
//
//
//                    }//else

                //---------------------------------------------------------------------------------------------------------------------------------
                //입력 받은 값과 같은지 비교
                try{
                    Editable ea = et1.getText();
                    String s = ea.toString();
                    com1 = Integer.parseInt( s );

                    ea = et2.getText();
                    s = ea.toString();
                    com2 = Integer.parseInt( s );

                    ea = et3.getText();
                    s = ea.toString();
                    com3 = Integer.parseInt( s );
                    if( ((com1 > 0) && (com1 <10)) && ((com2 > 0) && (com2 <10)) && ((com3 > 0) && (com3 <10)) ) {
                        int strike = 0, ball = 0;

                        if( (com1 == num1) ) strike++;
                        else if( (com1 == num2) || (com1 == num3) ) ball++;
                        if( (com2 == num2) ) strike++;
                        else if( (com2 == num1) || (com2 == num3) ) ball++;
                        if( (com3 == num3) ) strike++;
                        else if( (com3 == num1) || (com3 == num2) ) ball++;

                        if( (com1 == num1) && (com2 == num2) && (com3 == num3) ) {
                            tv2.append( (count + 1) + "회 : " + strike + " strike" + ball + " ball" + "\n" );
                            tv2.append( "축하합니다." + "\n" );
                        }
                        else tv2.append( (count + 1) + "회 : " + strike + " strike" + ball + " ball" + "\n");


                        count++; //몇 회인지 알려주기 위한 정보


                    }// inner if
                    else tv2.append("0~9까지의 수를 작성하세요" + "\n" );

                } catch(Exception e) {
                    tv2.append("0~9까지의 수를 작성하세요" + "\n" );
                } //catch문

                //--------------------------------------------------------------------------------------------------------------------------------=

                et1.setText(""); //빈 문자열로 글씨를 변경
                et2.setText(""); //빈 문자열로 글씨를 변경
                et3.setText(""); //빈 문자열로 글씨를 변경

            }//onClick

        };//onclicklistener

        btn.setOnClickListener(listener);

        tv2.setMovementMethod(new ScrollingMovementMethod());

    }
}
