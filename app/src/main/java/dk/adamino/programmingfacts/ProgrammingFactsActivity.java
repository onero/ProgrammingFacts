package dk.adamino.programmingfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ProgrammingFactsActivity extends AppCompatActivity {
    public static final String TAG = ProgrammingFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private FactColors mFactColors = new FactColors();

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming_facts);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_programming_facts);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color = mFactColors.getColor();
                //The button was clicked, do update the fact TextView with a new fact
                mFactTextView.setText(mFactBook.getFact());
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);

        Toast.makeText(this, "Welcome to my Programming Facts App!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}
