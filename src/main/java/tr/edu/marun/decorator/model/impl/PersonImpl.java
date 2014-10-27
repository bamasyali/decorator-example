/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.decorator.model.impl;

import tr.edu.marun.decorator.model.Person;

/**
 *
 * @author bamasyali
 */
public class PersonImpl implements Person {

    private final String name;

    public PersonImpl(String name) {
        this.name = name;
    }

    @Override
    public String getKnowledge() {
        return "My Name is ".concat(name);
    }

}
