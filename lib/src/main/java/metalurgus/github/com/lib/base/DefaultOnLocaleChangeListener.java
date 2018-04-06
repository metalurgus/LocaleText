package metalurgus.github.com.lib.base;

import android.content.Context;

import java.util.Locale;

public class DefaultOnLocaleChangeListener implements OnLocaleChangeListener {
    private static DefaultOnLocaleChangeListener instance;

    public static DefaultOnLocaleChangeListener getInstance() {
        if (instance == null) {
            instance = new DefaultOnLocaleChangeListener();
        }
        return instance;
    }

    private DefaultOnLocaleChangeListener() {

    }

    @Override
    public void onLocaleChange(Locale locale, int localeResId, Context context, LocaleChangeListenable listenable) {
        listenable.setText(context.getResources().getText(localeResId));
    }
}

