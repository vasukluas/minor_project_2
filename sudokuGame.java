
// imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class sudokuGame extends JFrame implements ActionListener {
    private sudokuBoard board;

    private JPanel gamePanel;

    private JPanel sub3by3Panel1;
    private JPanel sub3by3Panel2;
    private JPanel sub3by3Panel3;
    private JPanel sub3by3Panel4;
    private JPanel sub3by3Panel5;
    private JPanel sub3by3Panel6;
    private JPanel sub3by3Panel7;
    private JPanel sub3by3Panel8;
    private JPanel sub3by3Panel9;

    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;
    private JTextField tf13;
    private JTextField tf14;
    private JTextField tf15;
    private JTextField tf16;
    private JTextField tf17;
    private JTextField tf18;
    private JTextField tf19;
    private JTextField tf20;
    private JTextField tf21;
    private JTextField tf22;
    private JTextField tf23;
    private JTextField tf24;
    private JTextField tf25;
    private JTextField tf26;
    private JTextField tf27;
    private JTextField tf28;
    private JTextField tf29;
    private JTextField tf30;
    private JTextField tf31;
    private JTextField tf32;
    private JTextField tf33;
    private JTextField tf34;
    private JTextField tf35;
    private JTextField tf36;
    private JTextField tf37;
    private JTextField tf38;
    private JTextField tf39;
    private JTextField tf40;
    private JTextField tf41;
    private JTextField tf42;
    private JTextField tf43;
    private JTextField tf44;
    private JTextField tf45;
    private JTextField tf46;
    private JTextField tf47;
    private JTextField tf48;
    private JTextField tf49;
    private JTextField tf50;
    private JTextField tf51;
    private JTextField tf52;
    private JTextField tf53;
    private JTextField tf54;
    private JTextField tf55;
    private JTextField tf56;
    private JTextField tf57;
    private JTextField tf58;
    private JTextField tf59;
    private JTextField tf60;
    private JTextField tf61;
    private JTextField tf62;
    private JTextField tf63;
    private JTextField tf64;
    private JTextField tf65;
    private JTextField tf66;
    private JTextField tf67;
    private JTextField tf68;
    private JTextField tf69;
    private JTextField tf70;
    private JTextField tf71;
    private JTextField tf72;
    private JTextField tf73;
    private JTextField tf74;
    private JTextField tf75;
    private JTextField tf76;
    private JTextField tf77;
    private JTextField tf78;
    private JTextField tf79;
    private JTextField tf80;
    private JTextField tf81;

    private JButton newGame;

    private Font font1;
    // All subpanel text fields are present grouped in a row.
    private JTextField[] subPanelOneJTF;
    private JTextField[] subPanelTwoJTF;
    private JTextField[] subPanelThreeJTF;
    private JTextField[] subPanelFourJTF;
    private JTextField[] subPanelFiveJTF;
    private JTextField[] subPanelSixJTF;
    private JTextField[] subPanelSevenJTF;
    private JTextField[] subPanelEightJTF;
    private JTextField[] subPanelNineJTF;

    private JTextField[][] jtfArray;

    public static void main(String[] args) {
        new sudokuGame();
    }

    public sudokuGame() {
        font1 = new Font(Font.SANS_SERIF, Font.BOLD, 24);

        tf1 = constructJTextFields(tf1);
        tf2 = constructJTextFields(tf2);
        tf3 = constructJTextFields(tf3);
        tf4 = constructJTextFields(tf4);
        tf5 = constructJTextFields(tf5);
        tf6 = constructJTextFields(tf6);
        tf7 = constructJTextFields(tf7);
        tf8 = constructJTextFields(tf8);
        tf9 = constructJTextFields(tf9);
        tf10 = constructJTextFields(tf10);
        tf11 = constructJTextFields(tf11);
        tf12 = constructJTextFields(tf12);
        tf13 = constructJTextFields(tf13);
        tf14 = constructJTextFields(tf14);
        tf15 = constructJTextFields(tf15);
        tf16 = constructJTextFields(tf16);
        tf17 = constructJTextFields(tf17);
        tf18 = constructJTextFields(tf18);
        tf19 = constructJTextFields(tf19);
        tf20 = constructJTextFields(tf20);
        tf21 = constructJTextFields(tf21);
        tf22 = constructJTextFields(tf22);
        tf23 = constructJTextFields(tf23);
        tf24 = constructJTextFields(tf24);
        tf25 = constructJTextFields(tf25);
        tf26 = constructJTextFields(tf26);
        tf27 = constructJTextFields(tf27);
        tf28 = constructJTextFields(tf28);
        tf29 = constructJTextFields(tf29);
        tf30 = constructJTextFields(tf30);
        tf31 = constructJTextFields(tf31);
        tf32 = constructJTextFields(tf32);
        tf33 = constructJTextFields(tf33);
        tf34 = constructJTextFields(tf34);
        tf35 = constructJTextFields(tf35);
        tf36 = constructJTextFields(tf36);
        tf37 = constructJTextFields(tf37);
        tf38 = constructJTextFields(tf38);
        tf39 = constructJTextFields(tf39);
        tf40 = constructJTextFields(tf40);
        tf41 = constructJTextFields(tf41);
        tf42 = constructJTextFields(tf42);
        tf43 = constructJTextFields(tf43);
        tf44 = constructJTextFields(tf44);
        tf45 = constructJTextFields(tf45);
        tf46 = constructJTextFields(tf46);
        tf47 = constructJTextFields(tf47);
        tf48 = constructJTextFields(tf48);
        tf49 = constructJTextFields(tf49);
        tf50 = constructJTextFields(tf50);
        tf51 = constructJTextFields(tf51);
        tf52 = constructJTextFields(tf52);
        tf53 = constructJTextFields(tf53);
        tf54 = constructJTextFields(tf54);
        tf55 = constructJTextFields(tf55);
        tf56 = constructJTextFields(tf56);
        tf57 = constructJTextFields(tf57);
        tf58 = constructJTextFields(tf58);
        tf59 = constructJTextFields(tf59);
        tf60 = constructJTextFields(tf60);
        tf61 = constructJTextFields(tf61);
        tf62 = constructJTextFields(tf62);
        tf63 = constructJTextFields(tf63);
        tf64 = constructJTextFields(tf64);
        tf65 = constructJTextFields(tf65);
        tf66 = constructJTextFields(tf66);
        tf67 = constructJTextFields(tf67);
        tf68 = constructJTextFields(tf68);
        tf69 = constructJTextFields(tf69);
        tf70 = constructJTextFields(tf70);
        tf71 = constructJTextFields(tf71);
        tf72 = constructJTextFields(tf72);
        tf73 = constructJTextFields(tf73);
        tf74 = constructJTextFields(tf74);
        tf75 = constructJTextFields(tf75);
        tf76 = constructJTextFields(tf76);
        tf77 = constructJTextFields(tf77);
        tf78 = constructJTextFields(tf78);
        tf79 = constructJTextFields(tf79);
        tf80 = constructJTextFields(tf80);
        tf81 = constructJTextFields(tf81);

        sub3by3Panel1 = addJtfToPanel(1, sub3by3Panel1, tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9);
        sub3by3Panel2 = addJtfToPanel(2, sub3by3Panel2, tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf17, tf18);
        sub3by3Panel3 = addJtfToPanel(3, sub3by3Panel3, tf19, tf20, tf21, tf22, tf23, tf24, tf25, tf26, tf27);
        sub3by3Panel4 = addJtfToPanel(4, sub3by3Panel4, tf28, tf29, tf30, tf31, tf32, tf33, tf34, tf35, tf36);
        sub3by3Panel5 = addJtfToPanel(5, sub3by3Panel5, tf37, tf38, tf39, tf40, tf41, tf42, tf43, tf44, tf45);
        sub3by3Panel6 = addJtfToPanel(6, sub3by3Panel6, tf46, tf47, tf48, tf49, tf50, tf51, tf52, tf53, tf54);
        sub3by3Panel7 = addJtfToPanel(7, sub3by3Panel7, tf55, tf56, tf57, tf58, tf59, tf60, tf61, tf62, tf63);
        sub3by3Panel8 = addJtfToPanel(8, sub3by3Panel8, tf64, tf65, tf66, tf67, tf68, tf69, tf70, tf71, tf72);
        sub3by3Panel9 = addJtfToPanel(9, sub3by3Panel9, tf73, tf74, tf75, tf76, tf77, tf78, tf79, tf80, tf81);

        jtfArray = new JTextField[][] {
                { tf1, tf2, tf3, tf10, tf11, tf12, tf19, tf20, tf21 },
                { tf4, tf5, tf6, tf13, tf14, tf15, tf22, tf23, tf24 },
                { tf7, tf8, tf9, tf16, tf17, tf18, tf25, tf26, tf27 },
                { tf28, tf29, tf30, tf37, tf38, tf39, tf46, tf47, tf48 },
                { tf31, tf32, tf33, tf40, tf41, tf42, tf49, tf50, tf51 },
                { tf34, tf35, tf36, tf43, tf44, tf45, tf52, tf53, tf54 },
                { tf55, tf56, tf57, tf64, tf65, tf66, tf73, tf74, tf75 },
                { tf58, tf59, tf60, tf67, tf68, tf69, tf76, tf77, tf78 },
                { tf61, tf62, tf63, tf70, tf71, tf72, tf79, tf80, tf81 }
        };

        newGame = new JButton("New Game");
        newGame.addActionListener(this);

        gamePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 2));
        gamePanel.add(sub3by3Panel1);
        gamePanel.add(sub3by3Panel2);
        gamePanel.add(sub3by3Panel3);
        gamePanel.add(sub3by3Panel4);
        gamePanel.add(sub3by3Panel5);
        gamePanel.add(sub3by3Panel6);
        gamePanel.add(sub3by3Panel7);
        gamePanel.add(sub3by3Panel8);
        gamePanel.add(sub3by3Panel9);

        gamePanel.add(newGame);

        getContentPane().add(gamePanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(490, 600);
        setResizable(false);
        setTitle("Sudoku");
        setVisible(true);
    }

    private JTextField constructJTextFields(JTextField jtf) {
        jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(50, 50));
        jtf.setFont(font1);
        jtf.setHorizontalAlignment(JTextField.CENTER);
        jtf.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        KeyListener keyListener = new KeyListener() {
            public void keyPressed(KeyEvent keyEvent) {
                JTextField textField = (JTextField) keyEvent.getSource();

                if (!isValidCharacter(keyEvent) && keyEvent.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
                    textField.setEditable(false);
                    System.out.println("Not Valid Character");
                } else {
                    textField.setText("");
                    textField.setEditable(true);
                }
            }

            private int[] findJtfIn2DArray(JTextField jtf) {
                int[] returnArr = { -1, -1 };

                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (jtf.equals(jtfArray[i][j])) {
                            returnArr[0] = i;
                            returnArr[1] = j;
                            return returnArr;
                        }
                    }
                }
                return returnArr;
            }

            public void keyReleased(KeyEvent keyEvent) {
                JTextField textField = (JTextField) keyEvent.getSource();
                int[] jtfIndexValues = findJtfIn2DArray(textField);

                int jtfRow = jtfIndexValues[0];
                int jtfCol = jtfIndexValues[1];

                String valueInputted = "" + (keyEvent.getKeyChar());
                if (isValidCharacter(keyEvent) && keyEvent.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
                    resetJTFColor();
                    restrictAllJTFAccessButFocused(jtfRow, jtfCol, true);
                    restrictGeneratedJTFAccess(board);

                    boolean areDupesInRow = checkRowForDuplicates(jtfArray[jtfRow], textField, valueInputted);
                    boolean areDupesInCol = checkColForDuplicates(jtfCol, textField, valueInputted);
                    boolean areDupesInBox = checkBoxForDuplicates(jtfRow, jtfCol, textField, valueInputted);

                    if (areDupesInBox || areDupesInCol || areDupesInRow) {
                        setJTFColorRed(valueInputted, areDupesInBox, areDupesInCol, areDupesInRow, jtfRow, jtfCol);
                        restrictAllJTFAccessButFocused(jtfRow, jtfCol, false);
                    } else {
                        if (isValidCharacter(keyEvent)) {
                            jtfArray[jtfRow][jtfCol].setText(valueInputted);
                        } else if (keyEvent.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                            jtfArray[jtfRow][jtfCol].setText("");
                        }
                    }
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }
        };
        jtf.addKeyListener(keyListener);
        return jtf;
    }

    private void restrictAllJTFAccessButFocused(int row, int col, boolean correctValue) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (correctValue) {
                    jtfArray[i][j].setEditable(true);
                } else {
                    if (!(i == row && j == col)) {
                        jtfArray[i][j].setEditable(false);
                    }
                }
            }
        }
    }

    private void setJTFColorRed(String value, boolean areDupesInBox, boolean areDupesInCol, boolean areDupesInRow,
            int row, int col) {
        if (areDupesInBox) {
            for (JTextField element : flattenBoxToRow(row, col)) {
                if (element.getText().equals(value)) {
                    element.setBackground(Color.red);
                }
            }
        }
        if (areDupesInCol) {
            for (int i = 0; i < 9; i++) {
                if (jtfArray[i][col].getText().equals(value)) {
                    jtfArray[i][col].setBackground(Color.red);
                }
            }
        }
        if (areDupesInRow) {
            for (JTextField element : jtfArray[row]) {
                if (element.getText().equals(value)) {
                    element.setBackground(Color.red);
                }
            }
        }
    }

    private boolean checkRowForDuplicates(JTextField[] rowJTFArray, JTextField textField, String value) {
        for (JTextField element : rowJTFArray) {

            if (element != textField) {

                if (element.getText().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkColForDuplicates(int col, JTextField textField, String value) {
        for (int i = 0; i < 9; i++) {
            if (!jtfArray[i][col].equals(textField)) {
                if (jtfArray[i][col].getText().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkBoxForDuplicates(int row, int col, JTextField textField, String value) {
        return checkRowForDuplicates(flattenBoxToRow(row, col), textField, value);
    }

    private JTextField[] flattenBoxToRow(int row, int col) {
        if (row < 3) {
            if (col < 3) {
                return subPanelOneJTF;
            } else if (col < 6) {
                return subPanelTwoJTF;
            } else {
                return subPanelThreeJTF;
            }
        }
        if (row < 6) {
            if (col < 3) {
                return subPanelFourJTF;
            } else if (col < 6) {
                return subPanelFiveJTF;
            } else {
                return subPanelSixJTF;
            }
        }
        if (row < 9) {
            if (col < 3) {
                return subPanelSevenJTF;
            } else if (col < 6) {
                return subPanelEightJTF;
            } else {
                return subPanelNineJTF;
            }
        }
        return null;
    }

    private boolean isValidCharacter(KeyEvent e) {
        int input = Character.getNumericValue(e.getKeyChar());
        if (input > 0 && input < 10) {
            return true;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        board = new sudokuBoard();
        clearJTextFields();
        resetJTFColor();
        restrictGeneratedJTFAccess(board);
    }

    private void clearJTextFields() {
        for (JTextField[] elementArr : jtfArray) {
            for (JTextField element : elementArr) {
                element.setText("");
            }
        }
    }

    private void resetJTFColor() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                jtfArray[i][j].setBackground(Color.white);
            }
        }
    }

    private void restrictGeneratedJTFAccess(sudokuBoard board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board.getFinalBoard()[i][j] == 0) {
                    jtfArray[i][j].setEditable(true);
                } else {
                    jtfArray[i][j].setText("" + board.getFinalBoard()[i][j]);
                    jtfArray[i][j].setEditable(false);
                }

            }
        }
    }

    private JPanel addJtfToPanel(int subPanelNumber, JPanel subPanel, JTextField Tf1, JTextField Tf2, JTextField Tf3,
            JTextField Tf4, JTextField Tf5, JTextField Tf6, JTextField Tf7, JTextField Tf8,
            JTextField Tf9) {
        switch (subPanelNumber) {
            case 1:
                subPanelOneJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 2:
                subPanelTwoJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 3:
                subPanelThreeJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 4:
                subPanelFourJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 5:
                subPanelFiveJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 6:
                subPanelSixJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 7:
                subPanelSevenJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 8:
                subPanelEightJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
            case 9:
                subPanelNineJTF = new JTextField[] { Tf1, Tf2, Tf3, Tf4, Tf5, Tf6, Tf7, Tf8, Tf9 };
                break;
        }
        subPanel = new JPanel(new GridLayout(3, 3, 1, 1));
        subPanel.setBorder(BorderFactory.createLineBorder(Color.black, 1));

        subPanel.add(Tf1);
        subPanel.add(Tf2);
        subPanel.add(Tf3);
        subPanel.add(Tf4);
        subPanel.add(Tf5);
        subPanel.add(Tf6);
        subPanel.add(Tf7);
        subPanel.add(Tf8);
        subPanel.add(Tf9);

        return subPanel;
    }
}
