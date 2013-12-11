package com.mucommander.ui.action.impl;

import com.mucommander.commons.file.AbstractFile;
import com.mucommander.process.ProcessRunner;
import com.mucommander.shell.Shell;
import com.mucommander.ui.action.*;
import com.mucommander.ui.main.MainFrame;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Map;

/**
 * User: angelg
 * Date: 05/12/13
 */
public class OpenTerminalAction extends MuAction {


    public OpenTerminalAction(MainFrame mainFrame, Map<String, Object> properties) {
        super(mainFrame, properties);
    }

    @Override
    public void performAction() {
        try {
            AbstractFile currentFolder = mainFrame.getActivePanel().getCurrentFolder();
            String command = com.mucommander.desktop.DesktopManager.getTerminalAdapter().getOpenTerminalCommand(currentFolder.getAbsolutePath());
            Shell.execute(command, mainFrame.getActivePanel().getCurrentFolder());
        } catch (IOException e) {
        }
    }

    @Override
    public ActionDescriptor getDescriptor() {
        return new Descriptor();
    }

    public static class Factory implements ActionFactory {

        public MuAction createAction(MainFrame mainFrame, Map<String,Object> properties) {
            return new OpenTerminalAction(mainFrame, properties);
        }
    }



    public static class Descriptor extends AbstractActionDescriptor {
        public static final String ACTION_ID = "OpenTerminal";

        public String getId() { return ACTION_ID; }

        public ActionCategory getCategory() { return ActionCategories.FILES; }

        public KeyStroke getDefaultAltKeyStroke() { return null; }

        public KeyStroke getDefaultKeyStroke() { return KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0); }
    }
}
