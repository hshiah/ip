public class Event extends Task{
    protected String by;
    protected String from;
    public Event(String description, String from, String by) throws DukeException{
        super(description);
        if(!from.contains("from ")){
            throw new DukeException("☹ OOPS!!! The description of a event must contain \"from\" time.");
        }else if(!by.contains("to ")){
            throw new DukeException("☹ OOPS!!! The description of a event must contain \"to\" time.");
        }else if(from.replace("from ", "").isBlank()){
            throw new DukeException("☹ OOPS!!! The start time of a event cannot be empty.");
        }else if(by.replace("to ", "").isBlank()){
            throw new DukeException("☹ OOPS!!! The end time of a event cannot be empty.");
        }
        this.from = from.replace("from ", "");
        this.by = by.replace("to ", "");
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + this.from + " to: " + this.by + ")";
    }


    @Override
    public String toFile(){
        return "E | " + super.toFile() + " | " + this.from + " | " + this.by;
    }
}
