package com.example.ruan.cadastrodeclientes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ActCadClientes extends AppCompatActivity {

    private EditText edtNome, edtEmail, edtTelefone, edtEndereco, edtObservacoes, edtDataCadastro;
    private Spinner spnTelefone, spnEmail, spnEndereco, spnDataCadastro;

    private ArrayAdapter<String> adpTipoEmail;
    private ArrayAdapter<String> adpTipoTelefone;
    private ArrayAdapter<String> adpTipoEndereco;
    private ArrayAdapter<String> adpTipoData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_clientes);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtEmail = (EditText)findViewById(R.id.edt_email);
        edtNome = (EditText)findViewById(R.id.edt_nome);
        edtTelefone = (EditText)findViewById(R.id.edt_telefone);
        edtEndereco = (EditText)findViewById(R.id.edt_endereco);
        edtDataCadastro = (EditText)findViewById(R.id.edt_data);
        edtObservacoes = (EditText)findViewById(R.id.edt_observacoes);

        spnEmail = (Spinner)findViewById(R.id.spn_email);
        spnEndereco = (Spinner)findViewById(R.id.spn_endereco);
        spnTelefone = (Spinner)findViewById(R.id.spn_telefone);
        spnDataCadastro = (Spinner)findViewById(R.id.spn_data);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
