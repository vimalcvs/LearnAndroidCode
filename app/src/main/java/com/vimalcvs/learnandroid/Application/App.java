package com.vimalcvs.learnandroid.Application;

import android.app.Application;
        import com.vimalcvs.learnandroid.BuildConfig;
        import net.gotev.uploadservice.UploadService;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UploadService.NAMESPACE = BuildConfig.APPLICATION_ID;

    }
}
