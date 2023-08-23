package com.moderneinstein.android.arcade;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.moderneinstein.android.arcade.RootActivityTest \
 * com.moderneinstein.android.arcade.tests/android.test.InstrumentationTestRunner
 */
public class RootActivityTest extends ActivityInstrumentationTestCase2<RootActivity> {

    public RootActivityTest() {
        super("com.moderneinstein.android.arcade", RootActivity.class);
    }

}
