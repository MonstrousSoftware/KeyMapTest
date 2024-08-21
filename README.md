# KeyMapTest
21/08/2024

Testing regional settings for keyboard input via a Key Binding screen.

Context:

The web backend uses key codes that correspond to the OS regional settings. However, the desktop backend, since LWJGL3, always uses key codes following the 
US keyboard layout (QWERTY), regardless what is printed on the key. In other words, Input.Keys.Z indicated a specific key position, but the key may have another
letter printed on it.  It does in fact not matter so much what coding scheme your game uses internally as long as its consistent.  However, it becomes problematic
when you want to tell your user which key to press (for example in a tutorial) or in a key binding menu. E.g. when you want to explain it is WASD to move, but
your user's keyboard has ZQSD printed on the keys that you mean.

In this demo, the internal LibGDX key codes are translated back to the names following the regional keyboard setting before they are shown.
While libGDX issue #6962 is still open this application will ensure that regional keyboard settings are respected.

To try out:
    Use a non-US keyboard layout, e.g. German or French.
    Use the menu to bind actions to keys. You should see the key names in the menu following the regional layout.

E.g. using a German keyboard, the key that known as Z on a US keyboard (left most on the bottom row), will be shown as Y.

To experiment with regional keyboards in Windows, go to Region Settings, add a language (e.g. German or French). 
Make sure the Language bar is docked in the task bar to quickly toggle between keyboard layouts for testing.

Notes:
- On an ISO keyboard there is a key between shift and Z which is labelled "\".  GLFW returns it as KEY_WORLD_2 (i.e. a non-US key). 
LibGDX translates it to zero (unknown key). Should maybe be translated to Input.Keys.BACKSLASH so that we can do something useful with it.

- To fully internationalize your game, you might also want to translate some of the key names, e.g. "Espace" instead of "Space".

- The key bindings are persistent (stored via Preferences). They are stored as key codes (position codes) and will be displayed following the active keyboard region.
 


A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3.
- `teavm`: Experimental web platform using TeaVM and WebGL.


