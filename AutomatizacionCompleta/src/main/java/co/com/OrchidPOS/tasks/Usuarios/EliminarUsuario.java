    package co.com.OrchidPOS.tasks.Usuarios;

    import net.serenitybdd.core.steps.Instrumented;
    import net.serenitybdd.screenplay.Actor;
    import net.serenitybdd.screenplay.Task;
    import net.serenitybdd.screenplay.actions.Click;
    import net.serenitybdd.screenplay.waits.WaitUntil;
    import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

    import static co.com.OrchidPOS.userinterface.Usuarios.eliminacionUsuario.*;

    public class EliminarUsuario implements Task {

        public static EliminarUsuario aute() {
            return Instrumented.instanceOf(EliminarUsuario.class).withProperties();
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(BTN_ELIMINAR),
                    Click.on(ACEPTAR_ELIMINAR),
                    WaitUntil.the(FILAS_TABLA, isVisible()).forNoMoreThan(5).seconds()
            );

        }
    }
