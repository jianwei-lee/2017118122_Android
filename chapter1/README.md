# 导入课本源代码至电脑上遇到的问题与解决

## 1、遇到的问题
导入时需要加载很久且最后加载失败，无法运行
## 2、解决方法
### 2.1、修改gradle-wrapper.properties文件
找到导入项目文件夹目录下的gradl/wrapper/egradle-wrapper.properties文件，将自己创建过的可运行项目的此文件代替该文件
### 2.2、修改项目目录下build.gradle文件
找到导入项目文件夹目录下的build.gradle文件，将自己创建过的可运行项目的此文件代替该文件
### 2.3、修改app目录下build.gradle文件
找到导入项目文件夹目录下的app/build.gradle文件，将自己创建过的可运行项目的此文件代替该文件