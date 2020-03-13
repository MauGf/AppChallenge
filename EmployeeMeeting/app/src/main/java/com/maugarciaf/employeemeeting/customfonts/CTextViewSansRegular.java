package com.maugarciaf.employeemeeting.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CTextViewSansRegular extends AppCompatTextView {

    public CTextViewSansRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CTextViewSansRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CTextViewSansRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/pt-sans.regular.ttf");
            setTypeface(tf);
        }
    }

}