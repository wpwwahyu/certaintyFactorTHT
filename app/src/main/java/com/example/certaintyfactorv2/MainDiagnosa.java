package com.example.certaintyfactorv2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainDiagnosa extends AppCompatActivity {

    CheckBox diagnosa1,diagnosa2,diagnosa3,diagnosa4,diagnosa5,diagnosa6,diagnosa7,
             diagnosa8,diagnosa9,diagnosa10,diagnosa11,diagnosa12,diagnosa13,diagnosa14,diagnosa15;

    AutoCompleteTextView txtdiagnosa1,txtdiagnosa2,txtdiagnosa3,txtdiagnosa4,txtdiagnosa5,txtdiagnosa6,txtdiagnosa7,
            txtdiagnosa8,txtdiagnosa9,txtdiagnosa10,txtdiagnosa11,txtdiagnosa12,txtdiagnosa13,txtdiagnosa14,
            txtdiagnosa15;

    Button buttondeteksi;

    TextView txthasil;

    String[] nilaiCF = {"0", "0.2", "0.4", "0.6", "0.8", "1.0"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diagnosa);

        buttondeteksi = (Button)findViewById(R.id.buttondeteksi);
        txthasil = (TextView)findViewById(R.id.textHasil);

        diagnosa1 = (CheckBox)findViewById(R.id.checkBox);
        diagnosa2 = (CheckBox)findViewById(R.id.checkBox2);
        diagnosa3 = (CheckBox)findViewById(R.id.checkBox3);
        diagnosa4 = (CheckBox)findViewById(R.id.checkBox4);
        diagnosa5 = (CheckBox)findViewById(R.id.checkBox5);
        diagnosa6 = (CheckBox)findViewById(R.id.checkBox6);
        diagnosa7 = (CheckBox)findViewById(R.id.checkBox7);
        diagnosa8 = (CheckBox)findViewById(R.id.checkBox8);
        diagnosa9 = (CheckBox)findViewById(R.id.checkBox9);
        diagnosa10 = (CheckBox)findViewById(R.id.checkBox10);
        diagnosa11 = (CheckBox)findViewById(R.id.checkBox11);
        diagnosa12 = (CheckBox)findViewById(R.id.checkBox12);
        diagnosa13 = (CheckBox)findViewById(R.id.checkBox13);
        diagnosa14 = (CheckBox)findViewById(R.id.checkBox14);
        diagnosa15 = (CheckBox)findViewById(R.id.checkBox15);

        txtdiagnosa1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        txtdiagnosa2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        txtdiagnosa3 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
        txtdiagnosa4 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4);
        txtdiagnosa5 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView5);
        txtdiagnosa6 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView6);
        txtdiagnosa7 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView7);
        txtdiagnosa8 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView8);
        txtdiagnosa9 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView9);
        txtdiagnosa10 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView10);
        txtdiagnosa11 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView11);
        txtdiagnosa12 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView12);
        txtdiagnosa13 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView13);
        txtdiagnosa14 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView14);
        txtdiagnosa15 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView15);

        final ArrayAdapter<String> gejala1 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa1.setThreshold(1);
        txtdiagnosa1.setAdapter(gejala1);

        final ArrayAdapter<String> gejala2 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa2.setThreshold(1);
        txtdiagnosa2.setAdapter(gejala2);

        final ArrayAdapter<String> gejala3 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa3.setThreshold(1);
        txtdiagnosa3.setAdapter(gejala3);

        final ArrayAdapter<String> gejala4 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa4.setThreshold(1);
        txtdiagnosa4.setAdapter(gejala4);

        final ArrayAdapter<String> gejala5 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa5.setThreshold(1);
        txtdiagnosa5.setAdapter(gejala5);

        final ArrayAdapter<String> gejala6 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa6.setThreshold(1);
        txtdiagnosa6.setAdapter(gejala6);


        final ArrayAdapter<String> gejala7 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa8.setThreshold(1);
        txtdiagnosa8.setAdapter(gejala7);

        final ArrayAdapter<String> gejala8 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa9.setThreshold(1);
        txtdiagnosa9.setAdapter(gejala8);

        final ArrayAdapter<String> gejala9 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa10.setThreshold(1);
        txtdiagnosa10.setAdapter(gejala9);

        final ArrayAdapter<String> gejala10 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa11.setThreshold(1);
        txtdiagnosa11.setAdapter(gejala10);

        final ArrayAdapter<String> gejala11 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa12.setThreshold(1);
        txtdiagnosa12.setAdapter(gejala11);

        final ArrayAdapter<String> gejala12 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa13.setThreshold(1);
        txtdiagnosa13.setAdapter(gejala12);

        final ArrayAdapter<String> gejala13 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa14.setThreshold(1);
        txtdiagnosa14.setAdapter(gejala13);

        final ArrayAdapter<String> gejala14 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa15.setThreshold(1);
        txtdiagnosa15.setAdapter(gejala14);

        final ArrayAdapter<String> gejala15 = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,nilaiCF);
        txtdiagnosa7.setThreshold(1);
        txtdiagnosa7.setAdapter(gejala15);

        txtdiagnosa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala1, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa1.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala2, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa2.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala3, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa3.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala4, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa4.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala5, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa5.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala6, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa6.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala7, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa7.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala8, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa8.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala9, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa9.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala10, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa10.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala11, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa11.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala12, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa12.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala13, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa13.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala14, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa14.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        txtdiagnosa15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainDiagnosa.this).setTitle("Pilih nilai gejala").
                        setAdapter(gejala15, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                txtdiagnosa15.setText(nilaiCF[which].toString());
                                dialog.dismiss();
                            }
                        }).create().show();
            }
        });

        buttondeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaPenyakit = "Anda menderita penyakit : ";
                String presentase = "Presentasi keyakinan : ";

                if(diagnosa1.isChecked() && diagnosa4.isChecked() && diagnosa9.isChecked() &&
                        diagnosa11.isChecked() && diagnosa12.isChecked() && diagnosa13.isChecked() &&
                        diagnosa14.isChecked() && diagnosa15.isChecked()){

                    //nilai pakar
                    double nilaiGejala1 = 0.8;
                    double nilaiGejala4 = 0.8;
                    double nilaiGejala9 = 0.6;
                    double nilaiGejala11 = 0.8;
                    double nilaiGejala12 = 0.4;
                    double nilaiGejala13 = 0.8;
                    double nilaiGejala14 = 1.0;
                    double nilaiGejala15 = 0.6;

                    double dblGejala1 = Double.parseDouble(txtdiagnosa1.getText().toString());
                    double dblGejala4 = Double.parseDouble(txtdiagnosa4.getText().toString());
                    double dblGejala9 = Double.parseDouble(txtdiagnosa9.getText().toString());
                    double dblGejala11 = Double.parseDouble(txtdiagnosa11.getText().toString());
                    double dblGejala12 = Double.parseDouble(txtdiagnosa12.getText().toString());
                    double dblGejala13 = Double.parseDouble(txtdiagnosa13.getText().toString());
                    double dblGejala14 = Double.parseDouble(txtdiagnosa14.getText().toString());
                    double dblGejala15 = Double.parseDouble(txtdiagnosa15.getText().toString());

                    double hasilHitingGejala1 = nilaiGejala1 * dblGejala1;
                    double hasilHitingGejala4 = nilaiGejala4 * dblGejala4;
                    double hasilHitingGejala9 = nilaiGejala9 * dblGejala9;
                    double hasilHitingGejala11 = nilaiGejala11 * dblGejala11;
                    double hasilHitingGejala12 = nilaiGejala12 * dblGejala12;
                    double hasilHitingGejala13 = nilaiGejala13* dblGejala13;
                    double hasilHitingGejala14 = nilaiGejala14 * dblGejala14;
                    double hasilHitingGejala15 = nilaiGejala15 * dblGejala15;

                    double cf1_cf4 = hasilHitingGejala1 + hasilHitingGejala4 * (1 - hasilHitingGejala1);
                    double cfold_cf9 = cf1_cf4 + hasilHitingGejala9 * (1 - cf1_cf4);
                    double cfold_cf11 = cfold_cf9 + hasilHitingGejala11 * (1 - cfold_cf9);
                    double cfold_cf12 = cfold_cf11 + hasilHitingGejala12 * (1 - cfold_cf11);
                    double cfold_cf13 = cfold_cf12 + hasilHitingGejala13 * (1 - cfold_cf12);
                    double cfold_cf14 = cfold_cf13 + hasilHitingGejala14 * (1 - cfold_cf13);
                    double cfold_cf15 = cfold_cf14 + hasilHitingGejala15 * (1 - cfold_cf14);

                    String hasilHitungPenyakit = String.valueOf((cfold_cf15 * 100));

                    namaPenyakit += "\nPenyakit Oritis Media Akut";
                    presentase += "\n"+hasilHitungPenyakit;
                }

                if(diagnosa2.isChecked() && diagnosa5.isChecked() && diagnosa7.isChecked() &&
                        diagnosa8.isChecked() && diagnosa10.isChecked() && diagnosa11.isChecked() &&
                        diagnosa12.isChecked()){

                    //nilai pakar
                    double nilaiGejala2 = 0.8;
                    double nilaiGejala5 = 0.8;
                    double nilaiGejala7 = 0.8;
                    double nilaiGejala8 = 0.6;
                    double nilaiGejala10 = 1.0;
                    double nilaiGejala11 = 1.0;
                    double nilaiGejala12 = 0.4;

                    double dblGejala2 = Double.parseDouble(txtdiagnosa2.getText().toString());
                    double dblGejala5 = Double.parseDouble(txtdiagnosa5.getText().toString());
                    double dblGejala7 = Double.parseDouble(txtdiagnosa7.getText().toString());
                    double dblGejala8 = Double.parseDouble(txtdiagnosa8.getText().toString());
                    double dblGejala10 = Double.parseDouble(txtdiagnosa10.getText().toString());
                    double dblGejala11 = Double.parseDouble(txtdiagnosa11.getText().toString());
                    double dblGejala12 = Double.parseDouble(txtdiagnosa12.getText().toString());

                    double hasilHitingGejala2 = nilaiGejala2 * dblGejala2;
                    double hasilHitingGejala5 = nilaiGejala5 * dblGejala5;
                    double hasilHitingGejala7 = nilaiGejala7 * dblGejala7;
                    double hasilHitingGejala8 = nilaiGejala8 * dblGejala8;
                    double hasilHitingGejala10 = nilaiGejala10 * dblGejala10;
                    double hasilHitingGejala11 = nilaiGejala11 * dblGejala11;
                    double hasilHitingGejala12 = nilaiGejala12 * dblGejala12;

                    double cf2_cf5 = hasilHitingGejala2 + hasilHitingGejala5 * (1 - hasilHitingGejala2);
                    double cfold_cf7 = cf2_cf5 + hasilHitingGejala7 * (1 - cf2_cf5);
                    double cfold_cf8 = cfold_cf7 + hasilHitingGejala8 * (1 - cfold_cf7);
                    double cfold_cf10 = cfold_cf8 + hasilHitingGejala10 * (1 - cfold_cf8);
                    double cfold_cf11 = cfold_cf10 + hasilHitingGejala11 * (1 - cfold_cf10);
                    double cfold_cf12 = cfold_cf11 + hasilHitingGejala12 * (1 - cfold_cf11);

                    String hasilHitungPenyakit = String.valueOf((cfold_cf12 * 100));

                    namaPenyakit += "\nPenyakit Rhinitis Kronis";
                    presentase += "\n"+hasilHitungPenyakit;
                }

                if(diagnosa1.isChecked() && diagnosa3.isChecked() && diagnosa4.isChecked() &&
                        diagnosa5.isChecked() && diagnosa6.isChecked() && diagnosa8.isChecked() &&
                        diagnosa10.isChecked() && diagnosa12.isChecked()){

                    //nilai pakar
                    double nilaiGejala1 = 0.4;
                    double nilaiGejala3 = 0.8;
                    double nilaiGejala4 = 0.4;
                    double nilaiGejala5 = 0.4;
                    double nilaiGejala6 = 0.6;
                    double nilaiGejala8 = 0.6;
                    double nilaiGejala10 = 0.6;
                    double nilaiGejala12 = 1.0;

                    double dblGejala1 = Double.parseDouble(txtdiagnosa1.getText().toString());
                    double dblGejala3 = Double.parseDouble(txtdiagnosa3.getText().toString());
                    double dblGejala4 = Double.parseDouble(txtdiagnosa4.getText().toString());
                    double dblGejala5 = Double.parseDouble(txtdiagnosa5.getText().toString());
                    double dblGejala6 = Double.parseDouble(txtdiagnosa6.getText().toString());
                    double dblGejala8 = Double.parseDouble(txtdiagnosa8.getText().toString());
                    double dblGejala10 = Double.parseDouble(txtdiagnosa10.getText().toString());
                    double dblGejala12 = Double.parseDouble(txtdiagnosa12.getText().toString());

                    double hasilHitingGejala1 = nilaiGejala1 * dblGejala1;
                    double hasilHitingGejala3 = nilaiGejala3 * dblGejala3;
                    double hasilHitingGejala4 = nilaiGejala4 * dblGejala4;
                    double hasilHitingGejala5 = nilaiGejala5 * dblGejala5;
                    double hasilHitingGejala6 = nilaiGejala6 * dblGejala6;
                    double hasilHitingGejala8 = nilaiGejala8 * dblGejala8;
                    double hasilHitingGejala10 = nilaiGejala10 * dblGejala10;
                    double hasilHitingGejala12 = nilaiGejala12 * dblGejala12;

                    double cf1_cf3 = hasilHitingGejala1 + hasilHitingGejala3 * (1 - hasilHitingGejala1);
                    double cfold_cf4 = cf1_cf3 + hasilHitingGejala4 * (1 - cf1_cf3);
                    double cfold_cf5 = cfold_cf4 + hasilHitingGejala5 * (1 - cfold_cf4);
                    double cfold_cf6 = cfold_cf5 + hasilHitingGejala6 * (1 - cfold_cf5);
                    double cfold_cf8 = cfold_cf6 + hasilHitingGejala8 * (1 - cfold_cf6);
                    double cfold_cf10 = cfold_cf8 + hasilHitingGejala10 * (1 - cfold_cf8);
                    double cfold_cf12 = cfold_cf10 + hasilHitingGejala12 * (1 - cfold_cf10);


                    String hasilHitungPenyakit = String.valueOf((cfold_cf12 * 100));

                    namaPenyakit += "\nPenyakit Sinusitis";
                    presentase += "\n"+hasilHitungPenyakit;
                }

                txthasil.setText(""+namaPenyakit+"\n"+presentase+" %\n\n");
            }
        });
    }
}
