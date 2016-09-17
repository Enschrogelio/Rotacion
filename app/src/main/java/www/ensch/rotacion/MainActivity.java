package www.ensch.rotacion;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1= (TextView) findViewById(R.id.texto1);
        tv1.setText("Animaciones: Gira");

        TextView tv= (TextView) findViewById(R.id.texto);
        tv.setText("GIRA");
        tv.setTextColor(getColor(R.color.colorAccent));

        Animation td =
                AnimationUtils.loadAnimation(this,R.anim.rotacion);

        td.setRepeatMode(Animation.RESTART);
        td.setRepeatCount(20);
       td.setFillAfter(true);

//        tv1.startAnimation(td);
        tv.startAnimation(td);

    }
}