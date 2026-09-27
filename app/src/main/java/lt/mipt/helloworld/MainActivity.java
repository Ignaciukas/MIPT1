package lt.mipt.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

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

        Button textColorButton = findViewById(R.id.textColorButton);
        textColorButton.setOnClickListener(view ->
                messageTextView.setTextColor(Color.rgb(21, 101, 192)));

        Button backgroundButton = findViewById(R.id.backgroundButton);
        backgroundButton.setOnClickListener(view ->
                messageTextView.setBackgroundColor(Color.rgb(255, 224, 130)));
    }
}
