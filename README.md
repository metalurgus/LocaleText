# LocaleText
Library to easy change current locale without having to recreate the activity or restart the app

Currently supporting only basic text widgets:

* TextView (LocalTextTextView)
* Button (LocalTextButton)
* EditText (LocalTextEditText)

**Usage**

Add xmlns to your layout root element:

`xmlns:app="http://schemas.android.com/apk/res-auto"`

Declare the view in your layout:

     <metalurgus.github.com.lib.views.LocaleTextTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:locale_text="@string/lang" />
        
Use `app:locale_text` instead of `android:text` to provide string resource ID.

And that's it!. Everything is set up to change locale in runtime without having to recreate activity. You only need to call `LocaleText.setLocale(new Locale("en", "US"), context);` when you want to change the locale.
