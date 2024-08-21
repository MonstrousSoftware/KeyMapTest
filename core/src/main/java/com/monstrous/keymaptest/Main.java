package com.monstrous.keymaptest;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    @Override
    public void create() {
        KeyBinding.load();
        setScreen(new KeysScreen(this));
    }
}
