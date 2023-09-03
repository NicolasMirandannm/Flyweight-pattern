package Flyweight.Jframe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EditorDeTextoJframe {

    private JFrame frame;
    private JPanel panel;

    private ArrayList<JLabel> labels = new ArrayList<>();

    public EditorDeTextoJframe() {
        this.frame = new JFrame("Exemplo de Texto com Fonte Diferente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);

        panel = new JPanel();
        frame.add(panel);


        frame.setVisible(true);
    }
    public void write(String fonte, Integer tamanho, Integer estilo, char caractere) {

        JLabel label = new JLabel(String.valueOf(caractere));
        label.setFont(new Font(fonte, estilo, tamanho));
        this.panel.add(label);
        labels.add(label);

        panel.revalidate();
        panel.repaint();

    }

}
