package com.example.carde.tarea01;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button
        Button limpiar;

        Spinner spinner = (Spinner) findViewById(R.id.activity_main_escolaridad);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.escolaridad_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        AutoCompleteTextView libro= (AutoCompleteTextView) findViewById(R.id.activity_main_libro);
        ArrayAdapter<CharSequence> adapterLibro = ArrayAdapter.createFromResource(this,
                R.array.libros_array, android.R.layout.simple_dropdown_item_1line);
        libro.setAdapter(adapterLibro);

        limpiar= findViewById(R.id.activity_main_limpiar);

        limpiar.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                DialogFragment fragment = new MyDialog();
                fragment.show(getSupportFragmentManager(), "fire");
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_main_save:
                EditText nombre= (EditText)findViewById(R.id.activity_main_nombre);
                EditText tel= (EditText)findViewById(R.id.activity_main_tel);
                Spinner escolaridad= (Spinner) findViewById(R.id.activity_main_escolaridad);
                RadioGroup generos = (RadioGroup) findViewById(R.id.activity_main_genero);
                RadioButton genero = (RadioButton) findViewById(generos.getCheckedRadioButtonId());
                AutoCompleteTextView libro = (AutoCompleteTextView) findViewById(R.id.activity_main_libro);
                CheckBox deporte = (CheckBox) findViewById(R.id.activity_main_deporte);



                Alumno alumno = new Alumno(nombre.getText().toString(),tel.getText().toString(), escolaridad.getSelectedItem().toString(), genero.getText().toString(), libro.getText().toString(), deporte.isChecked());

                Toast.makeText(this, alumno.toString(), Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
