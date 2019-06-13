package droidmentor.onboardingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText editEmail, editSenha;
    private Button btnLogar, btnNovo;
    private TextView txtResetarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        incializarComponentes();
        eventoClicks();
    }

    private void eventoClicks() {
        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Cadastro.class);
                startActivity(i);
            }
        });


    }

    private void incializarComponentes() {
        editEmail = (EditText) findViewById(R.id.editEmail);
        editSenha = (EditText) findViewById(R.id.editSenha);
        btnLogar = (Button) findViewById(R.id.btnRegistar);
        btnNovo = (Button) findViewById(R.id.btnCadastro);
        txtResetarSenha = (TextView) findViewById(R.id.txtResetarSenha);
    }
}
