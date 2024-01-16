plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.ensoft.tvshow"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ensoft.tvshow"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // ViewModel and LiveData
    // https://developer.android.com/jetpack/androidx/releases/lifecycle
    implementation ("androidx.lifecycle:lifecycle-extensions:2.1.0")

    // Retrofit
    // https://github.com/square/retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.6.1")
    implementation ("com.squareup.retrofit2:converter-gson:2.6.1")

    // Gson
    // https://github.com/google/gson
    implementation ("com.google.code.gson:gson:2.8.5")

    // Glide
    // https://github.com/bumptech/glide
    implementation ("com.github.bumptech.glide:glide:4.10.0")
    annotationProcessor  ("com.github.bumptech.glide:compiler:4.10.0")

    // Testing
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.test:runner:1.2.0")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.2.0")
}