package com.xxx.demo;

public class Student {
public String playGame(Teacher teacher) {
    int num = teacher.getNextNumber();
    String ret = "";
    if(this.matchFizz(num)) {
        if(this.matchBuzz(num)) {
            ret = "FizzBuzz";
        } else {
            ret = "Fizz";
        }
    } else if (this.matchBuzz(num)) {
        ret = "Buzz";
    } else {
        ret = String.valueOf(num);
    }


    return ret;
}

// hard level:
public String playGameHard(Teacher teacher) {
    int num = teacher.getNextNumber();
    String ret;
    if(this.matchFizzHard(num)) {
        if(this.matchBuzzHard(num)) {
            ret = "FizzBuzz";
        } else {
            ret = "Fizz";
        }
    } else if(this.matchBuzzHard(num)) {
        ret = "Buzz";
    } else {
        ret = String.valueOf(num);
    }
    return ret;
}

public boolean matchFizz(int n) {
    return (n%3 ==0);
}

public boolean matchBuzz(int n) {
    return (n%5 ==0);
}

public boolean matchFizzHard(int n) {
    return this.matchFizz(n) || (String.valueOf(n).indexOf("3") >= 0);
}

public boolean matchBuzzHard(int n) {
    return this.matchBuzz(n) || (String.valueOf(n).indexOf("5") >= 0);
}
}
