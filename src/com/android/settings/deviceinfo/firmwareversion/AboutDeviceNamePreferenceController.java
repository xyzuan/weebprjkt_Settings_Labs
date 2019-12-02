package com.android.settings.deviceinfo.firmwareversion;

import android.content.Context;
import android.os.SystemProperties;

import com.android.settings.R;
import com.android.settings.core.BasePreferenceController;

public class AboutDeviceNamePreferenceController extends BasePreferenceController {

    private static final String TAG = "AboutDeviceNameCtrl";

    private static final String KEY_DEVICE_NAME_PROP = "ro.weeb.device";

    public AboutDeviceNamePreferenceController(Context context, String key) {
        super(context, key);
    }

    @Override
    public int getAvailabilityStatus() {
        return AVAILABLE;
    }

    @Override
    public CharSequence getSummary() {
        return SystemProperties.get(KEY_DEVICE_NAME_PROP,
                mContext.getString(R.string.unknown));
    }
}
