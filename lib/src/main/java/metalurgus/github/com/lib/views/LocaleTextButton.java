package metalurgus.github.com.lib.views;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Button;

import java.util.Locale;

import metalurgus.github.com.lib.base.LocaleChangeListenable;
import metalurgus.github.com.lib.base.OnLocaleChangeListener;

public class LocaleTextButton extends Button implements OnLocaleChangeListener {

    public LocaleTextButton(Context context) {
        super(context);
    }

    public LocaleTextButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LocaleTextButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LocaleTextButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



    @Override
    public void onLocaleChange(Locale locale, int localeResId, Context context, LocaleChangeListenable listenable) {

    }
}
