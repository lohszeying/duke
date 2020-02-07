import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Event extends Task {

    protected String by;
    String dateAsString = "";
    LocalDate date;
    String statement = "";

    public Event(String description, String by) throws DateTimeParseException {
        super(description);
        this.by = by;
        String[] tmp = this.by.split(" ");
        statement = tmp[0];
        dateAsString = dateAsString + tmp[1];

        try {
            date = LocalDate.parse(dateAsString);
        } catch (DateTimeParseException e) {

        }
    }

    @Override
    public String format() {
        return "E " + super.getStatusInNumber() + " " + super.description + " /" + by;
    }

    @Override
    public String toString() throws NullPointerException {
        String str = "[E]" + super.toString() + " (" + statement + " ";
        try {
            str = str + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
        } catch (NullPointerException e) {
            str = "[E]" + super.toString() + " (" + by + ")";
        }
        return str;
    }
}