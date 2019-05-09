import java.awt.Graphics;
import java.util.Calendar;

public class FirstApplet extends javax.swing.JApplet {
    private Calendar calendar;

    public void init() {
        calendar = Calendar.getInstance();
        setSize(250,80);
    }
    public void paint(Graphics g) {
        g.drawString("Applet is running:", 20, 15);
        g.drawString(calendar.getTime().toString(),20,35);
    }
}
