# gdx-freetype-gwt

You ever wanted to use freetype on the web version of your game but couldn't? Now you can!

# Versions
You have to use a matching libGDX and gdx-freetype-gwt version.
See this table for compatibility.
| libGDX   | gdx-freetype-gwt |  Note  |
|:--------:|:----------------:|:------:|
| 1.14.0 | 1.14.0   |    |
| 1.9.10 | 1.9.10.1 |  Fixes https://github.com/intrigus/gdx-freetype-gwt/issues/9 |
| 1.9.10 | 1.9.10 |  Don't use. Use 1.9.10.1 instead |

# How-To
1. Go to your `GdxDefinition.gwt.xml` in your `html` subproject

Add 

`<inherits name="com.badlogic.gdx.graphics.g2d.freetype.freetype-gwt" />`

after 

`<inherits name='com.badlogic.gdx.backends.gdx_backends_gwt' />`

2. Change your `build.gradle` of the `html` subproject

Add 
````
implementation "com.github.tommyettinger:gdx-freetype-gwt:1.14.0"
implementation "com.github.tommyettinger:gdx-freetype-gwt:1.14.0:sources"
````

3. Modify your `HtmlLauncher.java` (or if it's not named so, modify the class in your `html` project that extends `GwtApplication`)

Add
````java
@Override
public void onModuleLoad() {
    com.badlogic.gdx.graphics.g2d.freetype.gwt.FreetypeInjector.inject(super::onModuleLoad);
}
````

4. Profit and Enjoy

# Note
If gradle fails to resolve the dependency this most likely means that there no matching gdx-freetype-gwt version has been published.

You should try previous versions since freetype is generally updated rarely.

In any case open an issue.
