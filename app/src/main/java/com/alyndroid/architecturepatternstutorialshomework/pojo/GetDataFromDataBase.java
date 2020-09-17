package com.alyndroid.architecturepatternstutorialshomework.pojo;

import com.alyndroid.architecturepatternstutorialshomework.dataBase.DataBase;

public class GetDataFromDataBase {

    DataBase db = new DataBase() ;
    int firstNum ;
    int secondNum;

    public GetDataFromDataBase(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    public GetDataFromDataBase(){

    }

    public int getFirstNum(){
        return firstNum = db.getNumbers().getFirstNum();
    }
    public int getSecondNum(){
        return  secondNum =db.getNumbers().getSecondNum();
    }
}
