package lt.mipt.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView messageTextView = findViewById(R.id.messageTextView);
        Button showTextButton = findViewById(R.id.showTextButton);

        // Pirmas mygtukas parodo pasisveikinimą.
        showTextButton.setOnClickListener(view ->
                messageTextView.setText(R.string.hello_text));
    }
}
