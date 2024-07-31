package com.example.tictactoy;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WinDialog extends Dialog {

    private final String message;
    private final MainActivity mainActivity;

    public WinDialog(@NonNull Context context, String message, MainActivity mainActivity) {
        super(context);
        this.message = message;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.win_dialog);

        final TextView mesgtxt = findViewById(R.id.mesgtxt);
        final Button startbtn = findViewById(R.id.startagaainbtn);

      mesgtxt.setText(message);



        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.restartMatch();
                dismiss();

            }
        });
    }
}
