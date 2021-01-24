/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Professeur extends Personne {
    private String grade;
    private List<String> modules=new ArrayList();

    public Professeur() {
    }

    public Professeur(String grade, String modules, String nomComplet) {
        super(nomComplet);
        this.grade = grade;
    }

    public Professeur(String grade, int id, String nomComplet) {
        super(id, nomComplet);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public List<String> getModules() {
        return modules;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+"Grade :"+grade; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
