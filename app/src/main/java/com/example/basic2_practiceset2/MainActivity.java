package com.example.basic2_practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3rd lesson
        int raspberryPrice = 5;
        display1("1 box: $" + raspberryPrice);
        display2("2 boxes: $" + (raspberryPrice * 2));
        display3("3 boxes: $" + (raspberryPrice * 3));

        display1("This is box 1.");
        display2("And this is Box 2.");
        display3("And look! Box 3!");



     // 1st lesson
        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;

        int actualHours = weekday*5 + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);
     // 2nd lesson
        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        display((day1 + day2 + day3) / 3);

    // 5th lesson
        int dollars = 40;
        int dollarsToYen = 119;
        int yen = dollarsToYen * dollars;
        display(yen);

        // 6th lesson
        String firstName = "Lyla";
        String lastName = "Fujiwara";
        String contactInfo = firstName + " " + lastName;
        contactInfo = "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);


    }
    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }


}