# DialogBoxLibrary
Dialog Box Using Library. it's very simple


>Step 1. Add the JitPack repository to your build file

```
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  >Step 2. Add the dependency
  
  
 ```
    	dependencies {
	        implementation 'com.github.SarfarazAliToori:DialogBoxLibrary:1.0'
	}
  
 ```
 
 ```
 [![](https://jitpack.io/v/SarfarazAliToori/DialogBoxLibrary.svg)](https://jitpack.io/#SarfarazAliToori/DialogBoxLibrary)
 ```
 
 >Call to library.
 
 ```
    MyDialogBox.toast(contex, 'Your message')
 ```
 > Requremnts:
  >> targetSdk 31 and minSdk 29
    
