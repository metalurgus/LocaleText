package metalurgus.github.com.lib.base;

import android.content.Context;

import java.util.Locale;

public interface OnLocaleChangeListener {
    void onLocaleChange(Locale locale, int localeResId, Context context, LocaleChangeListenable listenable);
}
