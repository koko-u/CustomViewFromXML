package com.sample.kokou;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class BoardView extends TableLayout {
    public enum WHERE {
        TL, TC, TR,
        CL, CC, CR,
        BL, BC, BR
    };
    private LayoutInflater inf;
    private OnClickedListener listener;
    private TextView TLView, TCView, TRView, 
                     CLView, CCView, CRView, 
                     BLView, BCView, BRView;
    
    public BoardView(Context context) {
        this(context, null);
    }

    public BoardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inf.inflate(R.layout.nine_board, this);
        TLView = (TextView)layout.findViewById(R.id.tlView);
        TLView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.TL);
            }
        });
        TCView = (TextView)layout.findViewById(R.id.tcView);
        TCView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.TC);
            }
        });
        TRView = (TextView)layout.findViewById(R.id.trView);
        TRView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.TR);
            }
        });
        CLView = (TextView)layout.findViewById(R.id.clView);
        CLView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.CL);
            }
        });
        CCView = (TextView)layout.findViewById(R.id.ccView);
        CCView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.CC);
            }
        });
        CRView = (TextView)layout.findViewById(R.id.crView);
        CRView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.CR);
            }
        });
        BLView = (TextView)layout.findViewById(R.id.blView);
        BLView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.BL);
            }
        });
        BCView = (TextView)layout.findViewById(R.id.bcView);
        BCView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.BC);
            }
        });
        BRView = (TextView)layout.findViewById(R.id.brView);
        BRView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(WHERE.BR);
            }
        });
    }
    
    public void setOnClickListener(OnClickedListener l) {
        this.listener = l;
    }
    
    interface OnClickedListener {
        public void onClick(WHERE where);
    }
}
