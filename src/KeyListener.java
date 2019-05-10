import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            TalkScreen.SendButton.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
