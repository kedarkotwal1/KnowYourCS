package com.example.knowyourcs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class numcon extends AppCompatActivity implements  AdapterView.OnItemSelectedListener{
    Spinner spinnerfrom,spinnerto;
    EditText e1;
    TextView Result;
    Button b1;
    Long numberselected;
    Long newnew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numcon);

        b1=(Button)findViewById(R.id.btn1);
        e1=(EditText)findViewById(R.id.enternum);
        Result=(TextView)findViewById(R.id.actualresult);
        //numberselected=Integer.parseInt(e1.getText().toString());
        spinnerfrom=(Spinner)findViewById(R.id.spinnerfrom);
        spinnerto=(Spinner)findViewById(R.id.spinnerto);

        ArrayAdapter<CharSequence> arrayAdapter=ArrayAdapter.createFromResource(this,R.array.numsystems,R.layout.spinnercustom);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerfrom.setAdapter(arrayAdapter);
        spinnerfrom.setOnItemSelectedListener(this);
        spinnerto.setAdapter(arrayAdapter);
        spinnerto.setOnItemSelectedListener(this);

//Cannot convert hex to octal
        //only accepts decimal
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                long from=spinnerfrom.getSelectedItemId();
                long to=spinnerto.getSelectedItemId();
                numberselected=Long.parseLong(e1.getText().toString());

                if (from==0 && to==1)
                {
                //PLEASE MAKE CHANGES HERE
                    //numberselected=Long.toBinaryString(numberselected.);
                    Result.setText(Long.toOctalString((numberselected)));
                    Toast.makeText(numcon.this, "Binary to Octal", Toast.LENGTH_SHORT).show();
                }
                if (from==0 && to==2)
                {
                    Result.setText(Long.toString(numberselected));
                    Toast.makeText(numcon.this, "Binary to Decimal", Toast.LENGTH_SHORT).show();
                }
                if (from==0 && to==3)
                {
                    Result.setText(Long.toHexString(numberselected));
                    Toast.makeText(numcon.this, "Binary to Hexadecimal", Toast.LENGTH_SHORT).show();
                }
                if (from==1 && to==0)
                {
                    Result.setText(Long.toBinaryString(numberselected));
                    Toast.makeText(numcon.this, "Octal to Binary", Toast.LENGTH_SHORT).show();
                }
                if (from==1 && to==2)
                {
                    Result.setText(Long.toString(numberselected));
                    Toast.makeText(numcon.this, "Octal to Decimal", Toast.LENGTH_SHORT).show();
                }
                if (from==1 && to==3)
                {
                    Result.setText(Long.toHexString(numberselected));
                    Toast.makeText(numcon.this, "Octal to Hexadecimal", Toast.LENGTH_SHORT).show();
                }
                if (from==2 && to==0)
                {
                    Result.setText(Long.toBinaryString(numberselected));
                    Toast.makeText(numcon.this, "Decimal to Binary", Toast.LENGTH_SHORT).show();
                }
                if (from==2 && to==1)
                {
                    Result.setText(Long.toOctalString(numberselected));
                    Toast.makeText(numcon.this, "Decimal to Octal", Toast.LENGTH_SHORT).show();
                }
                if (from==2 && to==3)
                {
                    Result.setText(Long.toHexString(numberselected));
                    Toast.makeText(numcon.this, "Decimal to Hexadecimal", Toast.LENGTH_SHORT).show();
                }
                if (from==3 && to==0)
                {
                    Result.setText(Long.toBinaryString(numberselected));
                    Toast.makeText(numcon.this, "Hexadecimal to Binary", Toast.LENGTH_SHORT).show();
                }
                if (from==3 && to==1)
                {
                    Result.setText(Long.toOctalString(numberselected));
                    Toast.makeText(numcon.this, "Hexadecimal to Octal", Toast.LENGTH_SHORT).show();
                }
                if (from==3 && to==2)
                {
                    Result.setText(Long.toString(numberselected));
                    Toast.makeText(numcon.this, "Hexadecimal to Decimal", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(numcon.this, "Please make a valid Selection", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }




    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
