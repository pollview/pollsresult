package com.pollsresult.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pollsresult.R;

/**
 * Created by Sajal Jain on 08-02-2018.
 */

public class PollsResultView extends RelativeLayout {

    private boolean displayCancel;
    private String hint;
    private TextView resultText;

    public PollsResultView(Context context) {
        super(context);
    }

    public PollsResultView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);


        setStyle(attrs);
        init();
    }

    public PollsResultView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


        setStyle(attrs);
        init();
    }

    private void setStyle(AttributeSet attrs) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.PollsResultView,
                0, 0);

        try {
            hint = a.getString(R.styleable.PollsResultView_hint);
            displayCancel = a.getBoolean(R.styleable.PollsResultView_displayCancel, false);


        } finally {
            a.recycle();
        }
    }

    private void init() {
        inflate(getContext(), R.layout.polls_result_view, this);

        this.resultText = findViewById(R.id.resultText);
    }

}
