package metalurgus.github.com.lib.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import java.util.Locale;

import metalurgus.github.com.lib.R;
import metalurgus.github.com.lib.base.DefaultOnLocaleChangeListener;
import metalurgus.github.com.lib.base.LocaleChangeListenable;
import metalurgus.github.com.lib.base.LocaleText;
import metalurgus.github.com.lib.base.OnLocaleChangeListener;

public class LocaleTextTextView extends android.support.v7.widget.AppCompatTextView implements LocaleChangeListenable {

    private int localTextId;
    private OnLocaleChangeListener onLocaleChangeListener;

    public LocaleTextTextView(Context context) {
        super(context);
    }

    public LocaleTextTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        storeResId(attrs, 0);
        if (localTextId != 0) {
            setText(localTextId);
        }
    }

    public LocaleTextTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        storeResId(attrs, defStyleAttr);
        if (localTextId != 0) {
            setText(localTextId);
        }
    }

    private void storeResId(AttributeSet attrs, int defStyleAttr) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.LocaleText, defStyleAttr, 0);
        localTextId = a.getResourceId(R.styleable.LocaleText_locale_text, 0);
        a.recycle();
    }

    @Override
    public int getLocaleResId() {
        return localTextId;
    }

    @Override
    public void localeChanged(Locale locale) {
        if (onLocaleChangeListener != null) {
            onLocaleChangeListener.onLocaleChange(locale, getLocaleResId(), getContext(), this);
        } else {
            DefaultOnLocaleChangeListener.getInstance().onLocaleChange(locale, getLocaleResId(), getContext(), this);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LocaleText.add(this);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LocaleText.remove(this);
    }

    @Override
    public void setOnLocaleChangeListener(OnLocaleChangeListener listener) {
        onLocaleChangeListener = listener;
    }

    @Override
    public OnLocaleChangeListener getOnLocaleChangeListener() {
        return onLocaleChangeListener;
    }
}
