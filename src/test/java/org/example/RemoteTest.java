package org.example;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTest {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("Chrome");
        dc.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:8080/wd/hub"),dc);
        driver.get("http://google.com");

    }
}