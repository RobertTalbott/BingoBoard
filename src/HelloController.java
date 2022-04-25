import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.Random;

public class HelloController {
//    @FXML private Button button;

    @FXML
    public void initialize() {
        BingoBoard1[] myBingo = new BingoBoard1[4];
        myBingo[0] = new BingoBoard1("Alex");
        myBingo[1] = new BingoBoard1("Steven");
        myBingo[2] = new BingoBoard1("john");
        myBingo[3] = new BingoBoard1("adam");

        BingoNumber main = new BingoNumber();
        for(int count = 0; count < 30; count++) {
            int rnd = main.NewNumber();
            for (int i = 0; i < myBingo.length; i++) {
                myBingo[i].AddMarker(rnd);
            }
        }

        myBingo[0].AddMarker(2);
        myBingo[0].showBoard();
        System.out.println(myBingo[0].WinCheck());
        for (int i = 0; i < myBingo.length; i++) {
            System.out.println(myBingo[i].WinCheck());
        }

        box1.setText(String.valueOf(myBingo[0].numbs[0]));
        box2.setText(String.valueOf(myBingo[0].numbs[1]));
        box3.setText(String.valueOf(myBingo[0].numbs[2]));

    } // END: Initialize

    @FXML
    public Label bingoButton;
    @FXML
    private Label box1;
    @FXML
    private Label box2;
    @FXML
    private Label box3;
    @FXML
    private Label box4;
    @FXML
    private Label box5;
    @FXML
    private Label box6;
    @FXML
    private Label box7;
    @FXML
    private Label box8;
    @FXML
    private Label box9;
    @FXML
    private Label box10;
    @FXML
    private Label box11;
    @FXML
    private Label box12;
    @FXML
    private Label box13;
    @FXML
    private Label box14;
    @FXML
    private Label box15;
    @FXML
    private Label box16;
    @FXML
    private Label box17;
    @FXML
    private Label box18;
    @FXML
    private Label box19;
    @FXML
    private Label box20;
    @FXML
    private Label box21;
    @FXML
    private Label box22;
    @FXML
    private Label box23;
    @FXML
    private Label box24;

    //Random rand = new Random();
    @FXML
    protected void onHelloButtonClick() {
        //bingoButton.setText("Nope");
        box1.setText("1234343");
    }

}