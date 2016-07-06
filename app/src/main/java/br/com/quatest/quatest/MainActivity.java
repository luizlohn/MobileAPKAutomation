package br.com.quatest.quatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView idade;
    private SeekBar seekidade;
    private Button verificar;
    private EditText nome;
    private EditText endereco;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idade = (TextView) findViewById(R.id.idade);
        seekidade = (SeekBar) findViewById(R.id.seekBar);
        verificar = (Button) findViewById(R.id.verify);
        nome = (EditText) findViewById(R.id.cpName);
        endereco = (EditText) findViewById(R.id.cpEndereco);
        telefone = (EditText) findViewById(R.id.cpPhone);

        seekidade.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                idade.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogVerify dialogshow = DialogVerify.newinstance(nome.getText().toString(),endereco.getText().toString(),idade.getText().toString(),telefone.getText().toString());
                dialogshow.show(getFragmentManager(),"DialogShow");
            }
        });
    }
}
