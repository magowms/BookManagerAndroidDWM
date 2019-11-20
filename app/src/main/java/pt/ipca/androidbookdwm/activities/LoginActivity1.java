package pt.ipca.androidbookdwm.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.net.Credentials;
import android.net.wifi.hotspot2.pps.Credential;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import pt.ipca.androidbookdwm.R;
import pt.ipca.androidbookdwm.dialogs.AlertConfig;
import pt.ipca.androidbookdwm.dialogs.Dialogs;
import pt.ipca.androidbookdwm.interfaces.DialogsResult;

public class LoginActivity1 extends AppCompatActivity {

    private static final String DUMMY_EMAIL = "user@user.pt";
    private static final String DUMMY_PASSWORD = "12345";
    private EditText etEmail;
    private EditText etPassword;
    private CheckBox cbRemember;
    private ConstraintLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        etEmail = findViewById(R.id.Email);
        etPassword = findViewById(R.id.Password);
        cbRemember = findViewById(R.id.Remember);
        mainLayout = findViewById(R.id.mainLayout);
    }

    public void onLoginClick(View view) {
        if(!etEmail.getText().toString().equals(DUMMY_EMAIL)) {
            etEmail.setError(getString(R.string.invalid_email));
            etEmail.requestFocus();
            return;
        }
        if(!etPassword.getText().toString().equals(DUMMY_PASSWORD)) {
            etPassword.setError(getString(R.string.invalid_password));
            etPassword.requestFocus();
            return;
        }
        //Toast.makeText(getApplicationContext(), "sucesso", Toast.LENGTH_SHORT).show();
        Snackbar.make(mainLayout,"sucess", Snackbar.LENGTH_SHORT).show();
    }

    public void onForgotPassword(View view) {
        AlertConfig alertConfig = new AlertConfig(
                getString(R.string.forgot_password),
                getString(R.string.forgot_password_message),
                getString(R.string.ok));
        Dialogs.showAlertDialog(this, alertConfig, new DialogsResult() {
            @Override
            public void onResult(boolean ok) {
                String ola = "Estou aqui";
            }
        });
    }
}
