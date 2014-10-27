/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.edu.marun.decorator.decorator;

import tr.edu.marun.decorator.model.Person;

/**
 *
 * @author bamasyali
 */
public abstract class PersonDecorator implements Person {

    protected Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public String getKnowledge() {
        return person.getKnowledge();
    }

}
