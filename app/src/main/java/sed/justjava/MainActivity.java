package sed.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.attr.order;
import static sed.justjava.R.id.score1;


public class MainActivity extends AppCompatActivity {

    int score1 = 0;
    int score2 = 0;
    int t1 = 0;
    int t2=0;
    int d1=0;
    int d2=0;
    int c1=0;
    int c2=0;
    int p1=0;
    int p2=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // Method resets score
    public void resetScore(View view) {
        display1(score1=0);
        display2(score2=0);
        displayc1(c1=0);
        displayt1(t1=0);
        displayd1(d1=0);
        displayp1(p1=0);
        displayc2(c2=0);
        displayt2(t2=0);
        displayd2(d2=0);
        displayp2(p2=0);
    }

    // Method updates team 1 score
    public void score10(View view) {
        display1(score1+=3);
        displayp1(p1+=3);
    }
    public void score11(View view) {
        display1(score1+=2);
        displayc1(c1+=2);
    }
    public void score12(View view) { display1(score1+=3);
        displayd1(d1+=3);}
    public void score13(View view) { display1(score1+=5);
        displayt1(t1+=5);}

    // Method updates team 2 score
    public void score20(View view) {
        display2(score2+=3);
        displayp2(p2+=3);
    }
    public void score21(View view) {
        display2(score2+=2);
        displayc2(c2+=2);
    }
    public void score22(View view) { display2(score2+=3);
        displayd2(d2+=3);}
    public void score23(View view) { display2(score2+=5);
        displayt2(t2+=5);}

    //This method displays the given quantity value on the screen.

    private void display1(int number1) {
        TextView quantityTextView = (TextView) findViewById(R.id.score1);
        quantityTextView.setText(String.valueOf( number1));
    }
    private void display2(int number2) {
        TextView quantityTextView = (TextView) findViewById(R.id.score2);
        quantityTextView.setText(String.valueOf( number2));
    }

    private void displayt1(int numtry1) {
        TextView quantityTextView = (TextView) findViewById(R.id.try1);
        quantityTextView.setText(String.valueOf( numtry1));
    }
    private void displayd1(int numdrop1) {
        TextView quantityTextView = (TextView) findViewById(R.id.drop1);
        quantityTextView.setText(String.valueOf( numdrop1));
    }

    private void displayc1(int numconv1) {
        TextView quantityTextView = (TextView) findViewById(R.id.conv1);
        quantityTextView.setText(String.valueOf( numconv1));
    }
    private void displayp1(int numpen1) {
        TextView quantityTextView = (TextView) findViewById(R.id.pen1);
        quantityTextView.setText(String.valueOf( numpen1));
    }

    private void displayt2(int numtry2) {
        TextView quantityTextView = (TextView) findViewById(R.id.try2);
        quantityTextView.setText(String.valueOf( numtry2));
    }
    private void displayd2(int numdrop2) {
        TextView quantityTextView = (TextView) findViewById(R.id.drop2);
        quantityTextView.setText(String.valueOf( numdrop2));
    }

    private void displayc2(int numconv2) {
        TextView quantityTextView = (TextView) findViewById(R.id.conv2);
        quantityTextView.setText(String.valueOf( numconv2));
    }
    private void displayp2(int numpen2) {
        TextView quantityTextView = (TextView) findViewById(R.id.pen2);
        quantityTextView.setText(String.valueOf( numpen2));
    }

}