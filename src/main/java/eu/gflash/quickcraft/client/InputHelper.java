package eu.gflash.quickcraft.client;

import com.mojang.blaze3d.platform.InputConstants;
import java.util.Arrays;

public abstract class InputHelper {
    private InputHelper() {}

    public static boolean isKeyPressed(int ...keyCodes){
        return Arrays.stream(keyCodes).anyMatch(InputConstants::isKeyDown);
    }

    public static boolean isAltPressed(){
        return isKeyPressed(InputConstants.KEY_LALT, InputConstants.KEY_RALT);
    }

    public static boolean isCtrlPressed(){
        return isKeyPressed(InputConstants.KEY_LCONTROL, InputConstants.KEY_RCONTROL);
    }
}
