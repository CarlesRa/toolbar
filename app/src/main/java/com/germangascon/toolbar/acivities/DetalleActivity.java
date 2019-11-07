package com.germangascon.toolbar.acivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.germangascon.toolbar.R;
import com.germangascon.toolbar.fragments.FragmentDetalle;
import com.germangascon.toolbar.model.Contacto;

public class DetalleActivity extends AppCompatActivity {

    public static final String EXTRA_TEXTO = "com.germangascon.fragments.EXTRA_TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        FragmentDetalle detalle = (FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
        detalle.mostrarDetalle((Contacto)getIntent().getSerializableExtra(EXTRA_TEXTO));
    }
}
