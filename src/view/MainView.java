package view;

import javax.swing.*;

/**
 * Created by Budsayamas_Rua on 6/27/2016.
 */
public class MainView extends JFrame{
    private JButton openBtn;
    private JPanel mPanel;
    public MainView (){
        initOpenButton();
        initPanel();
        frameInit();

    }

    private void initPanel() {
        mPanel = new JPanel();
    }

    private void initOpenButton() {
        openBtn = new JButton();
        openBtn.setBounds(0,0,50,20);
        openBtn.setVisible(true);
        mPanel.add(openBtn);
    }

    @Override
    protected void frameInit() {
        super.frameInit();
        setBounds(0,0,500,500);
        add(mPanel);
    }
}
