package com.example.perinta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import health.PatientQueue;
import people.Doctor;
import people.Patient;
import people.Person;

public class MainActivity extends AppCompatActivity {
    private TextView tvOutPut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOutPut = findViewById(R.id.tvTest);
        String allText = "** LUOKKIEN TESTAUS \n";

        Person pl = new Person("Matti");

        allText += "\nPerson: " + pl.getInfo();

        Doctor doc = new Doctor ("Lauri", "Yleislääkäri");

        allText += "\nDoctor: " + doc.getInfo();

        Patient pat = new Patient("Make", "leikkaus", 90, 60);

        allText += "\nPatient: " + pat.getInfo();

        Patient pat2 = new Patient("Jake", "selkäjuttuja", 90, 60);
        Patient pat3 = new Patient("Make", "vatsajuttuja", 96, 64);
        Patient pat4 = new Patient("Take", "jalkajuttuja", 99, 70);

        PatientQueue pq = new PatientQueue("Jorvi","jokuosasto", doc);

        pq.lisaaJonoon(pat);
        pq.lisaaJonoon(pat2);
        pq.lisaaJonoon(pat3);
        pq.lisaaJonoon(pat4);
        allText = "*** LOPULLINEN \n" + pq.getInfo();


        tvOutPut.setText((allText));
    }

}
