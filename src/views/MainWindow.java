package views;

import javax.swing.JFrame;

public class MainWindow  extends JFrame
{
    public MainWindow()
    {
        this.setComponent();
        this.addComponent();
        this.addComponentToWindow();
        this.setWindow();
    }

    private void setComponent()
    {

    }

    private void addComponent()
    {

    }

    private void addComponentToWindow()
    {

    }

    private void setWindow()
    {
        this.setTitle("Tombsug - Juhász Roland");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
