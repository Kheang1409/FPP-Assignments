package assignment08.prog3;

import java.util.Stack;

public class TestBrowserHistory {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory("home.html"); //home
        browser.visit("page1.html"); // Current URL // page1 -> back home
        browser.visit("page2.html"); // Current URL // page2 -> back page1 -> home
        browser.back(); // Goto page1.html // page1 -> forward page2 & back -> home
        browser.back(); // Goto home.html // home -> forward page1 -> page2 & back isEmpty
        browser.forward(); // Goto page1.html // page1 -> forward page2 & back home
        browser.forward(); // Goto page1.html // page2 -> forward is empty & back page1 -> home
        browser.visit("page3.html"); // Current URL page3 -> forward is empty & back page2->page1->home;
    }
}
