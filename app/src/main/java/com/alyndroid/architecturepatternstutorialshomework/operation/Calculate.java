package com.alyndroid.architecturepatternstutorialshomework.operation;

import com.alyndroid.architecturepatternstutorialshomework.pojo.GetDataFromDataBase;

public class Calculate {

    GetDataFromDataBase getDataFromDataBase = new GetDataFromDataBase() ;

    public Calculate() {

    }

    public int GetResult(String operation){
        int firstNum = getDataFromDataBase.getFirstNum();
        int secondNum = getDataFromDataBase.getSecondNum();
        int result = 0 ;
        switch (operation){
            case "add" :
                result = firstNum + secondNum ;
                break;
            case "div" :
                result =firstNum / secondNum;
                break;
            case "mul" :
                result =firstNum * secondNum ;
                break;
        }
        return result;
    }
}
