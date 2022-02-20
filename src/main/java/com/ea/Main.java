package com.ea;


import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
public static void main(String[] args) {

   //     Selenium 4
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\resha\\gitpul\\SeleniumWithCucucumber\\driver\\chromedriver97469271.exe");
        var chromeDriver = new ChromeDriver();
        chromeDriver.get("https://amazon.in");
    }}