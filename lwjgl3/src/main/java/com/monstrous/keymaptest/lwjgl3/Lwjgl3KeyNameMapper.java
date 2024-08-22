package com.monstrous.keymaptest.lwjgl3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.monstrous.keymaptest.KeyNameMapper;
import org.lwjgl.glfw.GLFW;

import static org.lwjgl.glfw.GLFW.*;

public class Lwjgl3KeyNameMapper extends KeyNameMapper {

    @Override
    public String getKeyName(int keycode){
        if(keycode == 0)            // unsupported key, avoid the backend raising errors
            return "Unknown";
        int glfwCode = getGLFWKeyCode(keycode);
        if(glfwCode != GLFW_KEY_UNKNOWN) {
            String name = GLFW.glfwGetKeyName(glfwCode, 0);
            if (name != null)
                return name.toUpperCase();      // printable keys
        }
        Gdx.app.log("not printable", " key: "+keycode);
        return Input.Keys.toString(keycode);    // non-printable keys
    }


    public static int getGLFWKeyCode (int gdxKeyCode) {
        switch (gdxKeyCode) {
            case Input.Keys.APOSTROPHE:
                return GLFW_KEY_APOSTROPHE;
            case Input.Keys.LEFT_BRACKET:
            case Input.Keys.NUMPAD_LEFT_PAREN:
                return GLFW_KEY_LEFT_BRACKET;
            case Input.Keys.NUMPAD_RIGHT_PAREN:
            case Input.Keys.RIGHT_BRACKET:
                return GLFW_KEY_RIGHT_BRACKET;

            // note we only need to map the printable keys
            // because glfwGetKeyName() only supports those.


//            case Input.Keys.GRAVE:
//                return GLFW_KEY_GRAVE_ACCENT;

//            case Input.Keys.NUM:
//            case Input.Keys.NUM_LOCK:
//                return GLFW_KEY_NUM_LOCK;
//            case Input.Keys.SCROLL_LOCK:
//                return GLFW_KEY_SCROLL_LOCK;
//            case Input.Keys.CAPS_LOCK:
//                return GLFW_KEY_CAPS_LOCK;
//            case Input.Keys.PRINT_SCREEN:
//                return GLFW_KEY_PRINT_SCREEN;
//            case Input.Keys.PAUSE:
//                return GLFW_KEY_PAUSE;
            case Input.Keys.EQUALS:
                return GLFW_KEY_EQUAL;
//            case Input.Keys.SYM:
//                return GLFW.GLFW_KEY_LEFT_SUPER;        // gdx doesn't distinguish left and right
            case Input.Keys.NUM_0:
                return GLFW_KEY_0;
            case Input.Keys.NUM_1:
                return GLFW_KEY_1;
            case Input.Keys.NUM_2:
                return GLFW_KEY_2;
            case Input.Keys.NUM_3:
                return GLFW_KEY_3;
            case Input.Keys.NUM_4:
                return GLFW_KEY_4;
            case Input.Keys.NUM_5:
                return GLFW_KEY_5;
            case Input.Keys.NUM_6:
                return GLFW_KEY_6;
            case Input.Keys.NUM_7:
                return GLFW_KEY_7;
            case Input.Keys.NUM_8:
                return GLFW_KEY_8;
            case Input.Keys.NUM_9:
                return GLFW_KEY_9;
            case Input.Keys.A:
                return GLFW_KEY_A;
            case Input.Keys.B:
                return GLFW_KEY_B;
            case Input.Keys.C:
                return GLFW_KEY_C;
            case Input.Keys.D:
                return GLFW_KEY_D;
            case Input.Keys.E:
                return GLFW_KEY_E;
            case Input.Keys.F:
                return GLFW_KEY_F;
            case Input.Keys.G:
                return GLFW_KEY_G;
            case Input.Keys.H:
                return GLFW_KEY_H;
            case Input.Keys.I:
                return GLFW_KEY_I;
            case Input.Keys.J:
                return GLFW_KEY_J;
            case Input.Keys.K:
                return GLFW_KEY_K;
            case Input.Keys.L:
                return GLFW_KEY_L;
            case Input.Keys.M:
                return GLFW_KEY_M;
            case Input.Keys.N:
                return GLFW_KEY_N;
            case Input.Keys.O:
                return GLFW_KEY_O;
            case Input.Keys.P:
                return GLFW_KEY_P;
            case Input.Keys.Q:
                return GLFW_KEY_Q;
            case Input.Keys.R:
                return GLFW_KEY_R;
            case Input.Keys.S:
                return GLFW_KEY_S;
            case Input.Keys.T:
                return GLFW_KEY_T;
            case Input.Keys.U:
                return GLFW_KEY_U;
            case Input.Keys.V:
                return GLFW_KEY_V;
            case Input.Keys.W:
                return GLFW_KEY_W;
            case Input.Keys.X:
                return GLFW_KEY_X;
            case Input.Keys.Y:
                return GLFW_KEY_Y;
            case Input.Keys.Z:
                return GLFW_KEY_Z;
//            case Input.Keys.ALT_LEFT:
//                return GLFW_KEY_LEFT_ALT;
//            case Input.Keys.ALT_RIGHT:
//                return GLFW_KEY_RIGHT_ALT;
            case Input.Keys.BACKSLASH:
                return GLFW_KEY_BACKSLASH;
            case Input.Keys.COMMA:
                return GLFW_KEY_COMMA;
//            case Input.Keys.FORWARD_DEL:
//                return GLFW_KEY_DELETE;
//            case Input.Keys.DPAD_LEFT:
//                return GLFW_KEY_LEFT;
//            case Input.Keys.DPAD_RIGHT:
//                return GLFW_KEY_RIGHT;
//            case Input.Keys.DPAD_UP:
//                return GLFW_KEY_UP;
//            case Input.Keys.DPAD_DOWN:
//                return GLFW_KEY_DOWN;
//            case Input.Keys.ENTER:
//                return GLFW_KEY_ENTER;
//            case Input.Keys.HOME:
//                return GLFW_KEY_HOME;
//            case Input.Keys.END:
//                return GLFW_KEY_END;
//            case Input.Keys.PAGE_DOWN:
//                return GLFW_KEY_PAGE_DOWN;
//            case Input.Keys.PAGE_UP:
//                return GLFW_KEY_PAGE_UP;
//            case Input.Keys.INSERT:
//                return GLFW_KEY_INSERT;
            case Input.Keys.MINUS:
                return GLFW_KEY_MINUS;
            case Input.Keys.PERIOD:
                return GLFW_KEY_PERIOD;
            case Input.Keys.SEMICOLON:
                return GLFW_KEY_SEMICOLON;
//            case Input.Keys.SHIFT_LEFT:
//                return GLFW_KEY_LEFT_SHIFT;
//            case Input.Keys.SHIFT_RIGHT:
//                return GLFW_KEY_RIGHT_SHIFT;
            case Input.Keys.SLASH:
                return GLFW_KEY_SLASH;
//            case Input.Keys.SPACE:
//                return GLFW_KEY_SPACE;
//            case Input.Keys.TAB:
//                return GLFW_KEY_TAB;
//            case Input.Keys.BACKSPACE:
//                return GLFW_KEY_BACKSPACE;
//            case Input.Keys.CONTROL_LEFT:
//                return GLFW_KEY_LEFT_CONTROL;
//            case Input.Keys.CONTROL_RIGHT:
//                return GLFW_KEY_RIGHT_CONTROL;
//            case Input.Keys.ESCAPE:
//                return GLFW_KEY_ESCAPE;
//            case Input.Keys.F1:
//                return GLFW_KEY_F1;
//            case Input.Keys.F2:
//                return GLFW_KEY_F2;
//            case Input.Keys.F3:
//                return GLFW_KEY_F3;
//            case Input.Keys.F4:
//                return GLFW_KEY_F4;
//            case Input.Keys.F5:
//                return GLFW_KEY_F5;
//            case Input.Keys.F6:
//                return GLFW_KEY_F6;
//            case Input.Keys.F7:
//                return GLFW_KEY_F7;
//            case Input.Keys.F8:
//                return GLFW_KEY_F8;
//            case Input.Keys.F9:
//                return GLFW_KEY_F9;
//            case Input.Keys.F10:
//                return GLFW_KEY_F10;
//            case Input.Keys.F11:
//                return GLFW_KEY_F11;
//            case Input.Keys.F12:
//                return GLFW_KEY_F12;
//            case Input.Keys.F13:
//                return GLFW_KEY_F13;
//            case Input.Keys.F14:
//                return GLFW_KEY_F14;
//            case Input.Keys.F15:
//                return GLFW_KEY_F15;
//            case Input.Keys.F16:
//                return GLFW_KEY_F16;
//            case Input.Keys.F17:
//                return GLFW_KEY_F17;
//            case Input.Keys.F18:
//                return GLFW_KEY_F18;
            case Input.Keys.NUMPAD_0:
                return GLFW_KEY_KP_0;
            case Input.Keys.NUMPAD_1:
                return GLFW_KEY_KP_1;
            case Input.Keys.NUMPAD_2:
                return GLFW_KEY_KP_2;
            case Input.Keys.NUMPAD_3:
                return GLFW_KEY_KP_3;
            case Input.Keys.NUMPAD_4:
                return GLFW_KEY_KP_4;
            case Input.Keys.NUMPAD_5:
                return GLFW_KEY_KP_5;
            case Input.Keys.NUMPAD_6:
                return GLFW_KEY_KP_6;
            case Input.Keys.NUMPAD_7:
                return GLFW_KEY_KP_7;
            case Input.Keys.NUMPAD_8:
                return GLFW_KEY_KP_8;
            case Input.Keys.NUMPAD_9:
                return GLFW_KEY_KP_9;
//            case Input.Keys.NUMPAD_ENTER:
//                return GLFW_KEY_KP_ENTER;
            case Input.Keys.NUMPAD_DOT:
                return GLFW_KEY_KP_DECIMAL;
            case Input.Keys.NUMPAD_ADD:
                return GLFW_KEY_KP_ADD;
            case Input.Keys.NUMPAD_SUBTRACT:
                return GLFW_KEY_KP_SUBTRACT;
            case Input.Keys.NUMPAD_DIVIDE:
                return GLFW_KEY_KP_DIVIDE;
            case Input.Keys.NUMPAD_MULTIPLY:
                return GLFW_KEY_KP_MULTIPLY;
            case Input.Keys.NUMPAD_EQUALS:
                return GLFW_KEY_KP_EQUAL;
            default:
                return GLFW_KEY_UNKNOWN;
        }
    }
}
