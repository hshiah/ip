public class Todo extends Task{
    public Todo(String description) throws DukeException{
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String toFile() {
        return "T | " + super.toFile();
    }
}
