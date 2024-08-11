package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class WebUtil {
    public static List<String> dataList(){
        // 1. WebDriver와 ChromeDriver 설정
        // 프로젝트 폴더 기준으로 chromedirver.exe 파일의 위치를 작성
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // 2. 웹 페이지 접속
        String baseUrl = "https://news.naver.com/section/105";

        driver.get(baseUrl);

        List<WebElement> news_list = driver.findElements(By.cssSelector("ul.sa_list > li > div > div > div:nth-child(2) > a > strong"));

        List<String> news_title = new ArrayList<>();
        for(WebElement title: news_list){
            if(!title.getText().isEmpty()){
                news_title.add(title.getText());
            }
        }

        // 4. WebDriver 종료
        driver.quit();

        return news_title;
    }
}
