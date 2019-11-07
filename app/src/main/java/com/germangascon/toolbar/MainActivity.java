package com.germangascon.toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.germangascon.toolbar.acivities.ContactsMainActivity;
import com.germangascon.toolbar.acivities.CountryMainActivity;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button bOcultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_mostrarContactos:
                Intent i2 = new Intent(this, ContactsMainActivity.class);
                startActivity(i2);
                return true;
            case R.id.action_Paises:
                Intent i = new Intent(this, CountryMainActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
