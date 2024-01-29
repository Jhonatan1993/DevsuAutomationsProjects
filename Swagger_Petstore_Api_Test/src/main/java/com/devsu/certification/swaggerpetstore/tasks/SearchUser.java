package com.devsu.certification.swaggerpetstore.tasks;

import com.devsu.certification.swaggerpetstore.interactions.GetSearchUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SearchUser implements Task {


    private final String username;

    public SearchUser(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GetSearchUser.withData(username)
        );
    }

    public static SearchUser withData(String username) {
        return Tasks.instrumented(SearchUser.class, username);
    }
}
