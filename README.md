# 李健玮的Android应用开发作业
## 一、目录
### 第一章
* [HelloWorld](https://github.com/jianwei-lee/2017118122_Android/tree/master/HelloWorld)（作业1：HelloWorld程序）
* [chapter1/HelloWorld](https://github.com/jianwei-lee/2017118122_Android/tree/master/chapter1/HelloWorld)（导入郭霖课本源代码，遇到的问题readme）
### 第二章
* [chapter2/ActivityTest](https://github.com/jianwei-lee/2017118122_Android/tree/master/chapter2/ActivityTest)（作业2：两个活动的切换，作业3：隐式intent召唤浏览器，地图和拨号，作业4：活动的4个启动模式）
### 第三章
* [chapter3/RecyclerViewTest](https://github.com/jianwei-lee/2017118122_Android/tree/master/chapter3/RecyclerViewTest)
* [chapter3/RecyclerViewTest2](https://github.com/jianwei-lee/2017118122_Android/tree/master/chapter3/RecyclerViewTest2)（作业5：增删改程序）
## 二、注意事项
### 1、导入项目时路径中不能包含中文名
### 2、导入项目时加载时间过长解决方法
* 找到导入项目文件夹目录下的gradl/wrapper/egradle-wrapper.properties文件，  
找到代码`distributionUrl=https\://services.gradle.org/distributions/gradle-5.4.1-all.zip`
将自己创建过的可执行项目的相同文件的此代码替换掉此代码。
### 3、导入项目无法运行
* 找到导入项目文件夹目录下的build.gradle文件，  
找到以下代码，将自己创建过的可执行项目的相同文件的此代码替换下方代码。
```
dependencies {
    classpath 'com.android.tools.build:gradle:3.5.0'
}
```
* 找到导入项目文件夹目录下的app/build.gradle文件，找到以下代码，将自己创建过的可执行项目的相同文件的此代码替换下方代码。
```
android {
compileSdkVersion 29
buildToolsVersion '29.0.2'
defaultConfig {
    applicationId "com.example.helloworld"
    minSdkVersion 15
    targetSdkVersion 29
    versionCode 1
    versionName "1.0"
}
```
