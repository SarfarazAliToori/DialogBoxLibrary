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
	        implementation 'com.github.SarfarazAliToori:DialogBoxLibrary:latest-version'
	}
  
 ```
 
 ```
 [![](https://jitpack.io/v/SarfarazAliToori/DialogBoxLibrary.svg)](https://jitpack.io/#SarfarazAliToori/DialogBoxLibrary)
 ```
 
 >How to Use:
 
 ```val myDialogBox = MyDialogBox(this)
    myDialogBox.mDialogBox(this, "Alter Dialog !", "Hi How are You I am Dialog Box From MyDialog Library.", "Ok button", "NO button")
    myDialogBox.mDialogBox(this, "Alter Dialog !", "Hi How are You I am Dialog Box From MyDialog Library.", "Ok button", "NO button", "toast message on ok click")


 ```
 
 > Requremnts:
  >> targetSdk 31 and minSdk 29
    
