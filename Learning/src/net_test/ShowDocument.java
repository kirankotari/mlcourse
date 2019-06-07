package net_test;

import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JApplet;
public class ShowDocument extends JApplet {
    private URL bsu = null;
    public String getBaseURL() {
        return "http://www.bsu.by";
    }
    public void paint(Graphics g) {
        int timer = 0;
        g.drawString("Загрузка страницы", 10, 10);
        try {
            for (; timer < 30; timer++) {
                g.drawString(".", 10 + timer * 5, 25);
                Thread.sleep(100);
            }
            bsu = new URL(getBaseURL());
            this.getAppletContext().showDocument(bsu, "_blank");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
// некорректно задан протокол, доменное имя или путь к файлу
            e.printStackTrace();
        }
    }
}