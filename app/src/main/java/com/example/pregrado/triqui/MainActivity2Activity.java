package com.example.pregrado.triqui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity2Activity extends ActionBarActivity {

    public String tipoJuego;
    public boolean turno, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Intent intent = getIntent();
        tipoJuego = intent.getStringExtra( MainActivity.TIPO_JUEGO );

        turno = true;
        btn1=true;
        btn2=true;
        btn3=true;
        btn4=true;
        btn5=true;
        btn6=true;
        btn7=true;
        btn8=true;
        btn9=true;

        // jugador1 = true;
        // jugador2 = false;
    }

    
    public void eventoB1( View view ){

        if( btn1 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
         btn1 = false;
        }
        verificarGanador();
    }

    public void eventoB2( View view ){
        if( btn2 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn2 = false;
        }
        verificarGanador();
    }

    public void eventoB3( View view ){
        if( btn3 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn3 = false;
        }
        verificarGanador();
    }

    public void eventoB4( View view ){
        if( btn4 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn4 = false;
        }
        verificarGanador();
    }

    public void eventoB5( View view ){
        if( btn5 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn5 = false;
        }
        verificarGanador();
    }

    public void eventoB6( View view ){
        if( btn6 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn6 = false;
        }
        verificarGanador();
    }

    public void eventoB7( View view ){
        if( btn7 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn7 = false;
        }
        verificarGanador();
    }

    public void eventoB8( View view ){
        if( btn8 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn8 = false;
        }
        verificarGanador();
    }

    public void eventoB9( View view ){
        if( btn9 ){
            if( tipoJuego.equals("1")){
                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgandroid );
                    turno = true;
                }
            }
            else{

                if( turno ){
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador1 );
                    turno = false;
                }

                else{
                    ((ImageButton) view).setImageResource( R.drawable.imgjugador2);
                    turno = true;
                }
            }
            btn9 = false;
        }
        verificarGanador();
    }

    public void verificarGanador(){

        if (!btn1 && !btn2 && !btn3){

        }

        else if (!btn4 && !btn5 && !btn6){

        }

        if (!btn7 && !btn8 && !btn9){

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
