package com.example.ruan.cadastrodeclientes;

import android.opengl.EGLExt;
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

    private ArrayAdapter<String> adpTipoEmail, adpTipoTelefone, adpTipoEndereco, adpTipoData;

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

        // O primeiro parâmetro do construtor é passado a Activity que estará com os componentes
        // que receberá os dados, e o segundo parâmetro é passado o tipo de lista que será
        // utilizado no componente. Neste segundo parâmetro, está sendo definido que cada linha
        // será um item do menu.
        // A classe android.R.layout contém algumas tipos padrões
        adpTipoEmail = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        // o método abaixo permite configurar como os items serão exibidos. Neste caso, está
        // sendo configurado como menu dropdown
        adpTipoEmail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoData = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoData.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoEndereco = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoEndereco.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoTelefone = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


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
