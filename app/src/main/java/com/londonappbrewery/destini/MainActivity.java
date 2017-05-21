package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static com.londonappbrewery.destini.R.string.*;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView story;
    Button tButton;
    Button bButton;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        story = (TextView) findViewById(R.id.storyTextView);
        tButton = (Button) findViewById(R.id.buttonTop);
        bButton = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 3) {
                    setT3Story();
                    mStoryIndex = 2;

                } else if (mStoryIndex == 2) {
                    setT6End();
                } else {
                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    setT2Story();
                    mStoryIndex = 3;

                } else if (mStoryIndex == 2) {
                    setT5End();
                } else if (mStoryIndex == 3){
                    setT4End();
                }
                else {
                }
            }
        });
    }
    private void setT2Story() {
        story.setText(T2_Story);
        tButton.setText(T2_Ans1);
        bButton.setText(T2_Ans2);
    }
    private void setT3Story() {
        story.setText(T3_Story);
        tButton.setText(T3_Ans1);
        bButton.setText(T3_Ans2);
    }
    private void setT4End() {
        story.setText(T4_End);
        tButton.setVisibility(View.GONE);
        bButton.setVisibility(View.GONE);
    }
    private void setT5End() {
        story.setText(T5_End);
        tButton.setVisibility(View.GONE);
        bButton.setVisibility(View.GONE);
    }
    private void setT6End() {
        story.setText(T6_End);
        tButton.setVisibility(View.GONE);
        bButton.setVisibility(View.GONE);
    }

}
