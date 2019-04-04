<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.sylivia.herbal"
    android:targetSandboxVersion="2"
    android:versionCode="1"
    android:versionName="1.0" >

    <uses-sdk
        android:minSdkVersion="15"
        android:targetSdkVersion="28" />

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

    <application
        android:allowBackup="true"
        android:appComponentFactory="android.support.v4.app.CoreComponentFactory"
        android:debuggable="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:testOnly="true"
        android:theme="@style/AppTheme" >
        <activity android:name="com.sylivia.herbal.ListActivity" />
        <activity android:name="com.sylivia.herbal.AddActivity" />
        <activity
            android:name="com.sylivia.herbal.ImagesActivity"
            android:parentActivityName="com.sylivia.herbal.ListActivity" />
        <activity android:name="com.sylivia.herbal.MainActivity" >
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name="com.google.firebase.auth.internal.FederatedSignInActivity"
            android:excludeFromRecents="true"
            android:exported="true"
            android:launchMode="singleInstance"
            android:permission="com.google.firebase.auth.api.gms.permission.LAUNCH_FEDERATED_SIGN_IN"
            android:theme="@android:style/Theme.Translucent.NoTitleBar" />

        <service android:name="com.google.firebase.components.ComponentDiscoveryService" >
            <meta-data
                android:name="com.google.firebase.components:com.google.firebase.auth.FirebaseAuthRegistrar"
                android:value="com.google.firebase.components.ComponentRegistrar" />
        </service>
