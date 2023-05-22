import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void shouldMatchesReturnTrueForSimpleTask() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("Позвонить");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchesReturnFalseForSimpleTask() {
        SimpleTask task = new SimpleTask(5, "Позвонить родителям");
        boolean actual = task.matches("Написать");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldMatchesReturnTrueForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Хлеб");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchesReturnFalseForForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean actual = epic.matches("Картошка");
        Assertions.assertFalse(actual);
    }

    @Test
    public void shouldMatchesReturnTrueForMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Приложение");
        Assertions.assertTrue(actual);
    }

    @Test
    public void shouldMatchesReturnFalseForForMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("Игра");
        Assertions.assertFalse(actual);
    }
}
