package app.controller;

import app.models.Pacient;
import app.models.Persoana;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonController {

    List<Persoana> persoanaList;

    public PersonController(List<Persoana> persoanaList){
        this.persoanaList=persoanaList;
    }

    public PersonController(){
        this.persoanaList=new ArrayList<>();
        this.load();
    }


    public void load(){
        try{

            File file =new File("C:\\mycode\\OOP\\MapExemplu\\src\\app\\data\\persoana.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                Persoana persoana=new Persoana(scanner.nextLine());
                this.persoanaList.add(persoana);
            }
        }catch (Exception e ){
            e.printStackTrace();
        }


    }
}
