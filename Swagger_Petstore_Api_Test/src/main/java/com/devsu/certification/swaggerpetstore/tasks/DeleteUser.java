package com.devsu.certification.swaggerpetstore.tasks;

import com.devsu.certification.swaggerpetstore.interactions.DelUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DeleteUser implements Task {

    private final String username;

    public DeleteUser(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            DelUser.delete(username)
        );
    }
    public static DeleteUser withData(String username) {
        return Tasks.instrumented(DeleteUser.class, username);
    }
}
