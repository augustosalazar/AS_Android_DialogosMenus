package com.augustosalazar.dialogosmenus;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void BotonOnClickMenuClickable(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        //inflater.inflate(R.menu.menu_checkablemenu, popup.getMenu());
        popup.show();
    }

    public void BotonOnClickNotificacionOkNok(View view) {

        Log.d(TAG, "BotonOnClickNotificacionOkNok");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        // Add the buttons
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });

        builder = builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });


        // Set other dialog properties
        builder.setTitle(R.string.tituloDialogBox);
        builder.setMessage(R.string.textoDialogBox);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setCancelable(false);

        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }


    public void BotonOnClickNotificacionOkNokItems(View view) {

        Log.d(TAG, "BotonOnClickNotificacionOkNok");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Set other dialog properties
        builder.setTitle(R.string.tituloDialogBox);
        builder.setItems(R.array.dias, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Item "+which,Toast.LENGTH_SHORT).show();
                    }
            });
                builder.setIcon(R.drawable.ic_launcher);
        builder.setCancelable(false);
        // Add the buttons
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });

        builder = builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });




        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void BotonOnClickNotificacionSimple(View view) {


        Log.d(TAG, "Boton On Click NotificacionSimple");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Add the buttons
        builder = builder.setNeutralButton(R.string.aceptar, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });

        // Set other dialog properties
        builder.setTitle(R.string.tituloDialogBox);
        builder.setMessage(R.string.textoDialogBox);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setCancelable(false);

        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void BotonOnClickNotificacionOkNokMultiItems(View view) {


        Log.d(TAG, "BotonOnClickNotificacionOkNok");

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // Set other dialog properties
        builder.setTitle(R.string.tituloDialogBox);
        builder.setMultiChoiceItems(R.array.dias,null,new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                Toast.makeText(getApplicationContext(),"Item "+which + " is "+isChecked,Toast.LENGTH_SHORT).show();
            }
        });
        builder.setIcon(R.drawable.ic_launcher);
        builder.setCancelable(false);
        // Add the buttons
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });

        builder = builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });




        // Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    public void BotonOnClickNotificacionOkNokCustom(View view) {
        AlertFragment alertFrag = new AlertFragment();
        alertFrag.show(getSupportFragmentManager(),"alertFrag");
    }
}
