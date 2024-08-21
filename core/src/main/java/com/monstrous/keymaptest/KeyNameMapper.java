package com.monstrous.keymaptest;

import com.badlogic.gdx.Input;

public class KeyNameMapper {

    public String getKeyName(int keycode){
        return Input.Keys.toString(keycode);
    }
}
