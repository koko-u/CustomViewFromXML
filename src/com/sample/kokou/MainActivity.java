package com.sample.kokou;

import java.lang.reflect.Field;

import com.sample.kokou.BoardView.WHERE;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    private BoardView boardView;
    private TextView resultView;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        resultView = (TextView)findViewById(R.id.resultView);
        boardView = (BoardView)findViewById(R.id.boardView);
        boardView.setOnClickListener(new BoardView.OnClickedListener() {
            @Override
            public void onClick(WHERE where) {
                switch (where) {
                case TL:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.TL)));
                    break;
                case TC:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.TC)));
                    break;
                case TR:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.TR)));
                    break;
                case CL:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.CL)));
                    break;
                case CC:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.CC)));
                    break;
                case CR:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.CR)));
                    break;
                case BL:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.BL)));
                    break;
                case BC:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.BC)));
                    break;
                case BR:
                    resultView.setText(getString(R.string.you_clicked, getString(R.string.BR)));
                    break;
                default:
                    resultView.setText("");
                    break;
                }
                
            }
        });
    }
}