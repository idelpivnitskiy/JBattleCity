package ua.pp.condor.jbattlecity;

import javax.swing.JApplet;
import javax.swing.SwingUtilities;

import ua.pp.condor.jbattlecity.area.Area;
import ua.pp.condor.jbattlecity.area.maps.Stage1;
import ua.pp.condor.jbattlecity.utils.Sound;

import java.io.IOException;
import java.net.Socket;

public class JBattleCity extends JApplet {

    private static final long serialVersionUID = -6680546851758395165L;
    
    public static final int WIDTH = 520;
    public static final int HEIGHT = 520;

    private Socket socket;

    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {

                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    private void makeGUI() {
        setSize(WIDTH, HEIGHT);
        Sound.load(this);
        String host = getParameter("host");
        String port = getParameter("port");
        int portNumber = Integer.parseInt(port);
        try {
            socket = new Socket(host, portNumber);
            add(new Area(socket, new Stage1()));
        } catch (IOException e) {
            destroy();
        }
    }

    @Override
    public void destroy() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        super.destroy();
    }
}
