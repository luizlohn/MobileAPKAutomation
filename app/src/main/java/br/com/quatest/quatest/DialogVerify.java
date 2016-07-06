package br.com.quatest.quatest;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by luizlohn on 7/6/16.
 */
public class DialogVerify extends DialogFragment{

    private TextView idade;
    private TextView nome;
    private TextView endereco;
    private TextView telefone;
    private Button botaoOk;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_verify, container, false);
        idade = (TextView) view.findViewById(R.id.showIdade);
        nome = (TextView) view.findViewById(R.id.showNome);
        endereco = (TextView) view.findViewById(R.id.showEndereco);
        telefone = (TextView) view.findViewById(R.id.showTelefone);
        botaoOk = (Button) view.findViewById(R.id.buttonOk);

        Bundle bundle = getArguments();
        nome.setText(bundle.getString("Nome"));
        endereco.setText(bundle.getString("Endereço"));
        telefone.setText(bundle.getString("Telefone"));
        idade.setText(bundle.getString("Idade"));

        botaoOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


        return view;
    }
    public static DialogVerify newinstance(String nome, String endereco, String idade, String telefone){
        Bundle bundle = new Bundle();
        bundle.putString("Nome",nome);
        bundle.putString("Endereço",endereco);
        bundle.putString("Idade",idade);
        bundle.putString("Telefone",telefone);
        DialogVerify dialog = new DialogVerify();
        dialog.setArguments(bundle);
        return dialog;
    }
}
