package com.example.dell.easyanatomy;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void skull(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://playcanv.as/p/Sk66pcfQ/"));
        startActivity(browserIntent);
    }

    public void muscle(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://playcanv.as/p/4ys092Z0/"));
        startActivity(browserIntent);
    }

    public void nurve(View view)
    {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://playcanvas.as/p/Sk66pcfQ/"));
        startActivity(browserIntent);
    }
}
