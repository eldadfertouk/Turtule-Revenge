import javax.swing.*;
import java.awt.*;

public class BillboardPanel extends JPanel {
    private JPanel billBoard;
    private JLabel scoreLabel;
    private JLabel ammoLabel;
    private JLabel levelLabel;
    private JLabel livesLabel;
    private JLabel balloonLabel;
    private JTextField scoreText;
    private JTextField ammoText;
    private JTextField levelText;
    private JTextField livesText;
    private JTextField balloonText;
    private Dimension boxdimention;
    private ImageIcon icon;
    private GridBagConstraints c = new GridBagConstraints();

    public BillboardPanel(){

        icon = new ImageIcon("C:\\Users\\Eldad Fertouk\\Downloads\\MyGame\\src\\images\\turtule40x40.gif");
        boxdimention = new Dimension(100,35);
        billBoard=new JPanel(new GridBagLayout());
        billBoard.setBackground(Color.BLUE);
        billBoard.setFont(new Font("Guttman Yad-Light",Font.BOLD,26));
        billBoard.setBounds(0,0,1000,50);
        scoreLabel=new JLabel("SCORE:", (int) CENTER_ALIGNMENT);
        scoreLabel.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 100;
        c.gridy = 5;
        billBoard.add(scoreLabel, c);
        ammoLabel=new JLabel("AMMO:",(int)CENTER_ALIGNMENT);
        ammoLabel.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 2;
        c.gridx = 200;
        c.gridy = 2;
        billBoard.add(ammoLabel, c);
        levelLabel=new JLabel("LEVEL:",(int)CENTER_ALIGNMENT);
        levelLabel.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 3;
        c.gridx = 300;
        c.gridy = 2;
        billBoard.add(levelLabel, c);

        livesLabel=new JLabel("TURTLES LEFT:",(int)CENTER_ALIGNMENT);
        livesLabel.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 4;
        c.gridx = 400;
        c.gridy = 2;
        billBoard.add(livesLabel, c);

        balloonLabel=new JLabel("Balloons",(int)CENTER_ALIGNMENT);
        balloonLabel.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 5;
        c.gridx=500;
        c.gridy = 2;
        billBoard.add(balloonLabel,c);

      //  scoreText=new JTextField("00000",6);
      //  scoreText.setPreferredSize(boxdimention);
      //  c.fill = GridBagConstraints.HORIZONTAL;
      //  c.weightx = 1;
      //  c.gridx = 0;
      //  c.gridy = 2;
      //  billBoard.add(scoreText, c);


        levelText=new JTextField("Level 1",6);
        levelText.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 3;
        c.gridx = 200;
        c.gridy = 2;
        billBoard.add(levelText, c);
     //   this.balloonText = new JTextField("",6);
     //   this.balloonText.setPreferredSize(boxdimention);
     //   c.fill = GridBagConstraints.HORIZONTAL;
     //   c.weightx = 5;
     //   c.gridx = 400;
     //   c.gridy = 2;
     //   billBoard.add(this.balloonText,c);
        livesText=new JTextField("turtle lives",6);
        livesText.setPreferredSize(boxdimention);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 4;
        c.gridx = 300;
        c.gridy = 2;
        billBoard.add(livesText, c);
       // this.ammoText = new JTextField("",6);
       // this.ammoText.setPreferredSize(boxdimention);
       // c.fill = GridBagConstraints.HORIZONTAL;
       // c.weightx = 2;
       // c.gridx = 100;
       // c.gridy = 2;
       // billBoard.add(this.ammoText, c);
    }

public void PaintBillboardPanel(Graphics datapage){
        super.paintComponent(datapage);
        billBoard.setBounds(0,0,1000,80);
        billBoard.add(ammoLabel);
        billBoard.add(ammoText);
        billBoard.add(scoreLabel);
        billBoard.add(scoreText);
        billBoard.add(livesLabel);
        billBoard.add(livesText);
        billBoard.add(levelLabel);
        billBoard.add(levelText);
        billBoard.add(balloonLabel);
        billBoard.add(balloonText);
        billBoard.setVisible(true);
        this.add(billBoard);
}

    public JLabel getBalloonLabel() {
        return balloonLabel;
    }

    public void setBalloonLabel(JLabel balloonLabel) {
        this.balloonLabel = balloonLabel;
    }

    public JTextField getBalloonText() {
        return balloonText;
    }

    public void setBalloonText(JTextField balloonText) {
        this.balloonText=balloonText;

    }

    public Dimension getBoxdimention() {
        return boxdimention;
    }

    public void setBoxdimention(Dimension boxdimention) {
        this.boxdimention = boxdimention;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public JPanel getBillBoard() {
        return billBoard;
    }

    public void setBillBoard(JPanel billBoard) {
        this.billBoard = billBoard;
    }

    public JLabel getScoreLabel() {
        return scoreLabel;
    }

    public void setScoreLabel(JLabel scoreLabel) {
        this.scoreLabel = scoreLabel;
    }

    public JLabel getAmmoLabel() {
        return ammoLabel;
    }

    public void setAmmoLabel(JLabel ammoLabel) {

        this.ammoLabel = ammoLabel;

    }

    public JLabel getLevelLabel() {
        return levelLabel;
    }

    public void setLevelLabel(JLabel levelLabel) {
        this.levelLabel = levelLabel;
    }

    public JLabel getLivesLabel() {
        return livesLabel;
    }

    public void setLivesLabel(JLabel livesLabel) {
        this.livesLabel = livesLabel;
    }

    public JTextField getScoreText() {
        return scoreText;
    }

    public void setScoreText(JTextField scoreText) {
        this.scoreText = scoreText;
    }

    public JTextField getAmmoText() {
        return ammoText;
    }

    public void setAmmoText(JTextField ammoText)
    {
      this.ammoText = ammoText;

    }

    public JTextField getLevelText() {
        return levelText;
    }

    public void setLevelText(JTextField levelText) {
        this.levelText = levelText;
    }

    public JTextField getLivesText() {
        return livesText;
    }

    public void setLivesText(JTextField livesText) {
        this.livesText = livesText;
    }
}
