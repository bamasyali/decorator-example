/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.decorator.decorator.impl;

import tr.edu.marun.decorator.decorator.PersonDecorator;
import tr.edu.marun.decorator.model.Person;

/**
 *
 * @author bamasyali
 */
public class Male extends PersonDecorator {

    public Male(Person person) {
        super(person);
    }

    @Override
    public String getKnowledge() {
        return super.getKnowledge().concat(", ").concat("I play Football");
    }

}
