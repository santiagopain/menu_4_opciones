package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {



        switch (item.getItemId()){


            case R.id.option1:


                Intent siguiente= new Intent(this,vista_prueba_uno.class);

                startActivity(siguiente);

                Toast.makeText(this,"esta es la opcion uno ",Toast.LENGTH_SHORT).show();


                break;





            case R.id.action_option2:


                Intent NEXT= new Intent(this,vista_prueba_dos.class);

                startActivity(NEXT);
                Toast.makeText(this,"esta es la opcion dos ",Toast.LENGTH_SHORT).show();


                break;





            case R.id.action_option3:


                Intent option3= new Intent(this,vista_prueba_tres.class);

                startActivity(option3);
                Toast.makeText(this,"esta es la opcion tres ",Toast.LENGTH_SHORT).show();


                break;




            case R.id.action_option4:


                Intent option4= new Intent(this,vista_prueba_4.class);

                startActivity(option4);
                Toast.makeText(this,"esta es la opcion cuatro ",Toast.LENGTH_SHORT).show();


                break;
        }






        return super.onOptionsItemSelected(item);
    }
}