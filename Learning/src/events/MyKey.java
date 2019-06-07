package events;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JApplet;

public class MyKey extends JApplet {
    private String msg = " ";
    private int x = 0, y = 20; // координаты вывода
    private class AppletKeyListener
            implements KeyListener {
        // реализация всех трех методов интерфейса KeyListener
        public void keyPressed(KeyEvent e) {
            showStatus("Key Down");
        } // отображение в строке состояния
        public void keyReleased(KeyEvent e) {
            showStatus("Key Up");
        } // отображение в строке состояния
        public void keyTyped(KeyEvent e) {
            msg += e.getKeyChar();
            repaint(); // перерисовать
        }
    }
    public void init() {
        /* регистрация блока прослушивания */
        addKeyListener(new AppletKeyListener());
        requestFocus(); // запрос фокуса ввода
    }
    public void paint(Graphics g) {
// значение клавиши в позиции вывода
        g.drawString(msg, x, y);
    }
}

