package com.vaani.factory;

import com.vaani.bean.Female;
import com.vaani.bean.Male;
import com.vaani.bean.Person;

public class SalutationFactory {
    public Person getPerson(String name, String gender) {
       if (gender.equals("M"))
           return new Male(name);
       else if(gender.equals("F"))
           return new Female(name);
       else return null;
    }
}// End of class