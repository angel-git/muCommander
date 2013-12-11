package com.mucommander.desktop.osx;

import com.mucommander.desktop.TerminalAdapter;

/**
 * User: angelg
 * Date: 10/12/13
 */
public class OSXTerminalAdapter implements TerminalAdapter {

    @Override
    public String getOpenTerminalCommand(String absolutePath) {
        return "open -a /Applications/Utilities/Terminal.app \"`" + absolutePath + "`\"";
    }
}
