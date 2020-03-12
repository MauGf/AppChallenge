package com.maugarciaf.employeemeeting.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CTextViewSansBold extends AppCompatTextView {

    public CTextViewSansBold(Context context, AttributeSet attrs, int defStyle) {
        super (context, attrs, defStyle);
        init ();
    }

    public CTextViewSansBold(Context context, AttributeSet attrs) {
        super (context, attrs);
        init ();
    }

    public CTextViewSansBold(Context context) {
        super (context);
        init ();
    }

    private void init() {
        if (!isInEditMode ()) {
            Typeface tf = Typeface.createFromAsset (getContext ().getAssets (), "fonts/pt-sans.bold.ttf");
            setTypeface (tf);
        }
    }

}