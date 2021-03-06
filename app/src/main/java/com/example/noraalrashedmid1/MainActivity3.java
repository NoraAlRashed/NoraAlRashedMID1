package com.example.noraalrashedmid1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity3 extends AppCompatActivity {
    {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main3);
        setTitle("You are in Activity3");

        String[] array = {
                "First Item",
                "Second Item",
                "Third Item",
                "Fourth Item",
                "GO TO ACT 1",
                "GO TO ACT 2"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main3, R.id.i1, array));

    }

        protected void onListItemClick(
            ListView l, View v, int position,long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                break;

            case 1:
                startActivity(new Intent(MainActivity3.this, BigItem.class));
                break;

            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://amazon.com")));
                break;

            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://apple.com")));
                break;

            case 4:
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
                break;

            case 5:
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
                break;
        }

    }
    }

}
