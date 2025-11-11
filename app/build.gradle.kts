plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "ma.projet.soapclient"
    compileSdk = 36

    defaultConfig {
        applicationId = "ma.projet.soapclient"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.google.android.material:material:1.4.0")
   // implementation("com.google.code.ksoap2-android:ksoap2-android:3.6.4")
    //implementation(files("D:/EMSI-S9/Architecture/SOAPCompteApp/app/libs/ksoap2-android-3.6.4.jar"))
    //implementation(files("app/libs/ksoap2-android-3.6.4.jar"))
    //implementation(files("libs/ksoap2-android-3.6.4.jar"))
    //implementation(":ksoap2-android-3.6.4@jar")
    implementation(libs.ksoap2Android)
}