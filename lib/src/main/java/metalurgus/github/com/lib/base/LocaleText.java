package metalurgus.github.com.lib.base;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaleText {
    private static List<LocaleChangeListenable> listenables = new ArrayList<>();

    public static void add(LocaleChangeListenable listenable) {
        listenables.add(listenable);
    }

    public static void remove(LocaleChangeListenable listenable) {
        listenables.remove(listenable);
    }

    public static void setLocale(Locale locale, Context context) {
        Resources res = context.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        Locale.setDefault(locale);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            conf.setLocale(locale); // API 17+ only.
        }
        res.updateConfiguration(conf, dm);

        for (LocaleChangeListenable listenable : listenables) {
            listenable.localeChanged(locale);
        }
    }
}
