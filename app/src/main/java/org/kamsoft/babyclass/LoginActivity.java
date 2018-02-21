package org.kamsoft.babyclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView lostpassword_link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        lostpassword_link = (TextView)findViewById(R.id.lostpassword_link);
        String htmlString="<u>نسيت كلمة السر ؟</u>";
        lostpassword_link.setText(Html.fromHtml(htmlString));
        lostpassword_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpass = new Intent(LoginActivity.this  , ActivityLostPassword.class);
                startActivity(newpass);
            }
        });
    }
}
