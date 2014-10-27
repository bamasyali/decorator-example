/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.decorator;

import tr.edu.marun.decorator.decorator.impl.KnowsJava;
import tr.edu.marun.decorator.decorator.impl.Male;
import tr.edu.marun.decorator.model.Person;
import tr.edu.marun.decorator.model.impl.PersonImpl;

/**
 *
 * @author bamasyali
 */
public class Main {

    public static void main(String[] args) {
        Person person = new PersonImpl("Ali");
        System.out.println(person.getKnowledge());

        Male male = new Male(person);
        System.out.println(male.getKnowledge());

        KnowsJava java = new KnowsJava(male);
        System.out.println(java.getKnowledge());

    }
}
