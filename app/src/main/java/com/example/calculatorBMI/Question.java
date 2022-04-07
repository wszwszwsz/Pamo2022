package com.example.calculatorBMI;

public class Question {
    public String questions[]={
            "Czy pączki sa zdrowe?",
            "Co powinno byc podstawowym żródłem energii na co dzień?",
            "Ile posiłkow dziennie powinno sie jesc?",
            "Który z posiłków jest najważniejszy?",
            "Co ile godzin powinno się spożywać posiłki?",
            "Ile godzin snu potrzebuje przecietny człowiek?"
    };
    public String[][] choices={
            {"Tak, jeszcze jak!","Nieeee, to samo zlo","wszystko zalezy od ilosci paczkow", "Lubie placki"},
            {"Zboża","Podatki ","mieso","ryby"},
            {"Jeden", "Dwa", "Cztery","Pięć"},
            {"Śniadanie", "Drugie śniadanie", "Obiad","Kolacja"},
            {"1","10","2","3-4"},
            {"4", "5-6", "7-8","12"}
    };
    public String correctAnswer[]={
            "wszystko zalezy od ilosci paczkow","Zboża","Pięć","Śniadanie","3-4","7-8"
    };
    public String getQuestion(int x){
        String question=questions[x];
        return question;
    }
    public String getchoice1(int x){
        String choice=choices[x][0];
        return choice;
    }
    public String getchoice2(int x){
        String choice=choices[x][1];
        return choice;
    }
    public String getchoice3(int x){
        String choice=choices[x][2];
        return choice;
    }
    public String getchoice4(int x){
        String choice=choices[x][3];
        return choice;
    }
    public String getCorrectAnswer(int x){
        String answer=correctAnswer[x];
        return answer;
    }

}
