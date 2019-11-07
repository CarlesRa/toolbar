package com.germangascon.toolbar.acivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import com.germangascon.toolbar.R;
import com.germangascon.toolbar.adapters.CountryAdapter;
import com.germangascon.toolbar.model.Country;
import com.germangascon.toolbar.parsers.CountryParser;

public class CountryMainActivity extends AppCompatActivity {
    private CountryAdapter adaptadorPaisos;
    private CountryParser parser;
    private ListView lvPrincipal;
    private Country[] paisos;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_activity_main);
        parser = new CountryParser(this);
        parser.parse();
        paisos = parser.getCountries();
        lvPrincipal = findViewById(R.id.lvPrincipal);
        adaptadorPaisos = new CountryAdapter(this,paisos);
        lvPrincipal.setAdapter(adaptadorPaisos);
        toolbar = findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
    }
}
