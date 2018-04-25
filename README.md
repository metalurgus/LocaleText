# LocaleText
[![](https://jitpack.io/v/metalurgus/LocaleText.svg)](https://jitpack.io/#metalurgus/LocaleText)[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-LocaleText-green.svg?style=flat )]( https://android-arsenal.com/details/1/6921 ) [![License](http://img.shields.io/:license-gpl3-blue.svg?style=flat-square)](http://www.gnu.org/licenses/gpl-3.0.html)

Library to easy change current locale without having to recreate the activity or restart the app

Currently supporting only basic text widgets:

* TextView (LocalTextTextView)
* Button (LocalTextButton)
* EditText (LocalTextEditText)

**Usage**

Add jitpack.io repository in your root build.gradle at the end of repositories:

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
     
Add the dependency:

	dependencies {
	        compile 'com.github.metalurgus:LocaleText:0.0.1.1'
	}

Add xmlns to your layout root element:

`xmlns:app="http://schemas.android.com/apk/res-auto"`

Declare the view in your layout:

     <metalurgus.github.com.lib.views.LocaleTextTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:locale_text="@string/lang" />
        
Use `app:locale_text` instead of `android:text` to provide string resource ID.

And that's it!. Everything is set up to change locale in runtime without having to recreate activity. You only need to call `LocaleText.setLocale(new Locale("en", "US"), context);` when you want to change the locale.
