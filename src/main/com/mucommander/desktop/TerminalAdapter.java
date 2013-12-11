package com.mucommander.desktop;

/**
 * User: angelg
 * Date: 10/12/13
 */
public interface TerminalAdapter {

    /**
     * returns the open terminal command
     * @param absolutePath
     * @return
     */
    public String getOpenTerminalCommand(String absolutePath);
}
