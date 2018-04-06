package metalurgus.github.com.lib.base;

import java.util.Locale;

public interface LocaleChangeListenable {
    int getLocaleResId();

    void localeChanged(Locale locale);

    void setOnLocaleChangeListener(OnLocaleChangeListener listener);

    OnLocaleChangeListener getOnLocaleChangeListener();

    void setText(CharSequence text);
}
