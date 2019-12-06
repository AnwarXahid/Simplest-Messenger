package Offline2;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by MiNNiE on 11/19/2015.
 */
public class Person {
    private final SimpleStringProperty name;

    Person(String Name) {
        this.name = new SimpleStringProperty(Name);
    }

    public String getName() {
        return name.get();
    }
}
