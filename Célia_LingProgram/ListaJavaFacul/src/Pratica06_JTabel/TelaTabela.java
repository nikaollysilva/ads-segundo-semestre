package Pratica06_JTabel;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TelaTabela {
    private JPanel panel1;
    private JTable table1;

    public TelaTabela() {
        table1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }
}
