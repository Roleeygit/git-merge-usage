package views;

import javax.swing.JFrame;

public class MainWindow  extends JFrame
{
    InputPanel sidePanel;
    InputPanel alphaPanel;

    public MainWindow()
    {
        this.setComponent();
        this.addComponent();
        this.addComponentToWindow();
        this.setWindow();
    }

    private void setComponent()
    {
        this.sidePanel = new InputPanel();
        this.alphaPanel = new InputPanel();
    }

    private void addComponent()
    {
        this.add(this.sidePanel);
        this.add(this.alphaPanel);
    }

    private void addComponentToWindow()
    {
        this.add(this.sidePanel);
        this.add(this.alphaPanel);

    }

    private void setWindow()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
