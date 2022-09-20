package com.example.toolbarexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      Toolbar toolbar = findViewById(R.id.tool_bar);
      setSupportActionBar(toolbar);

      // Get a support ActionBar corresponding to this toolbar
      ActionBar ab = getSupportActionBar();

      // Enable the Up button
      ab.setDisplayHomeAsUpEnabled(true);
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.example_menu, menu);
      return super.onCreateOptionsMenu(menu);
   }

   @Override
   public boolean onOptionsItemSelected(@NonNull MenuItem item) {
      switch (item.getItemId()) {
         case R.id.item1:

            break;
         case R.id.item2:

            break;
         case R.id.subItem1:

            break;
         case R.id.subItem2:

            break;
         case R.id.subItem3:

            break;
      }
      return super.onOptionsItemSelected(item);
   }
}