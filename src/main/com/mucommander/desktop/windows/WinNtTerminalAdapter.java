package com.mucommander.desktop.windows;

import com.mucommander.desktop.TerminalAdapter;

/**
 * User: angelg
 * Date: 11/12/13
 */
public class WinNtTerminalAdapter implements TerminalAdapter {

    @Override
    public String getOpenTerminalCommand(String absolutePath) {
        return "start cmd.exe";
    }
}
