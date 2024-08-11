package com.project;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        try {
            List<String> dataList = WebUtil.dataList();
            String filePath = "D:\\output.xlsx";
            ExcelUtil.wirteToExcel(dataList, filePath);
            System.out.println("데이터 추출 완료");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}