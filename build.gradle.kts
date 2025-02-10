

plugins {
    alias(libs.plugins.android.application) apply false
                                                        // gradle/libs.versions.toml 파일에서 선언한 플러그인을 불러오는 방식
                                                        // apply false는 프로젝트 수준에서 등록만 하고, 실제 적용은 각 모듈에서 하도록 설정하는 역할
    alias(libs.plugins.kotlin.android) apply false      // kotlin 언어로 안드로이드 앱 개발할 수 있도록 Gradle에 설정해 주는 플러그인
    id("androidx.navigation.safeargs.kotlin") version "2.7.4" apply false   
                                                // Navigation Component에서 Safe Args 기능을 사용할 수 있게 해주는 플러그인,  
                                                // Safe Args는 Fragment간 안전한 데이터 전달을 도와주는 도구
                                                // Safe Args를 사용하면 Bundle을 직접 사용하지 않아도 타입 안전한 방식으로 데이터 전달이 가능
    id("com.google.dagger.hilt.android") version "2.48" apply false
}

/*
프로젝트 수준의 build.gradle

프로젝트 전체에 적용되는 설정의 적용
주로 플러그인 관리, 전역적인 Gradle 설정, 모든 서브모듈에 영향을 미치는 종속성을 포함
프로젝트 내 모든 모듈이 공통으로 사용할 수 있는 라이브러리의 버전을 정의할 수도 있다

Gradle이란?
    앱을 만들고 실행하는 과정을 자동으로 처리해주는 도구

    왜 Gradle을 사용해야 하나?
        안드로이드 앱을 만들려면 코드를 컴파일하고, 라이브러리를 추가하고, APK를 만들어야 한다
        이것들을 매번 손으로 하기에 너무 귀찮고, 실수를 유발한다
    예시
        Kotlin 코드를 앱이 실행될 수 있는 형태로 변환(컴파일)
        필요한 라이브러리(Jetpack Compose, Retrofit 등) 다운로드 & 추가
        APK(앱 설치 파일) 생성
        디버그/릴리스 빌드 자동화

build.gradle이란?
    Adnroid 프로젝트를 빌드(컴파일)히고 실행하는 방법을 Gradle에게 알려주는 설정 파일
    쉽게 말해서, 앱을 만들기 위해 필요한 모든 설정, 라이브러리, 버전 정보 등을 정리하는 곳

플러그인이란?
    Gradle이 할 수 있는 일을 늘려주는 확장팩
        Gradle은 기본적으로 아무 기능도 없는 빌드 도구,
        그래서 만약 안드로이드 앱을 만들고 싶으면, 안드로이드 앱을 빌드를 도와주는 플러그인을 추가해야한다


프로젝트 수준 build.gradle에서 설정하는 주요 내용
    1. 플러그인
    2.

*/
