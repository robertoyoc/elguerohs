package mx.talentics.elguerohs;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);



        Button loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               IntentToLogin(v);
            }
        });
        Button registerButton = (Button) findViewById(R.id.register);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentToRegister(v);
            }
        });
        sendNotification();
    }
    private void IntentToLogin(View v){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    private void IntentToRegister(View v){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    private void sendNotification(){
        Intent intent = new Intent(this, Login.class);
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent,0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "El Guero HS");

        builder.setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(getString(R.string.title_notify))
                .setContentText(getString(R.string.text_notify))
                .setDefaults(NotificationCompat.DEFAULT_SOUND | NotificationCompat.DEFAULT_VIBRATE)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentIntent(pi)
                .setAutoCancel(true);

                //.setStyle(new NotificationCompat.BigTextStyle()
                        //.bigText(getString(R.string.text_big_notify)));



        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("El Guero HS", "Notification", NotificationManager.IMPORTANCE_HIGH);

            channel.setDescription("Alv prro");
            NotificationManager nm = getSystemService(NotificationManager.class);

            nm.createNotificationChannel(channel);
        }

        NotificationManagerCompat nmc = NotificationManagerCompat.from(this);

        nmc.notify(123, builder.build());


    }
}
