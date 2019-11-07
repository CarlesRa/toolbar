package com.germangascon.toolbar.acivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.widget.Toolbar;

import com.germangascon.toolbar.R;
import com.germangascon.toolbar.fragments.FragmentDetalle;
import com.germangascon.toolbar.fragments.FragmentListado;
import com.germangascon.toolbar.interficies.IContactosListener;
import com.germangascon.toolbar.model.Contacto;

public class ContactsMainActivity extends AppCompatActivity implements IContactosListener {
    FragmentListado frgListado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_activity_main);
        frgListado = (FragmentListado)getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgListado.setContactosListener(ContactsMainActivity.this);

    }

    @Override
    public void onContactoSeleccionado(int position) {
        boolean hayDetalle = (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);
        Contacto contacto = frgListado.getDatos()[position];
        if(hayDetalle) {
            FragmentDetalle frgDetalle = (FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);
            frgDetalle.mostrarDetalle(contacto);
        } else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO, contacto);
            startActivity(i);
        }
    }
}
