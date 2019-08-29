package sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class todoData {

    private String title;
    private String detail;
    private LocalDate deadLine;

    public todoData(String title, String detail, LocalDate deadLine) {
        this.title = title;
        this.detail = detail;
        this.deadLine = deadLine;
    }

    public String getTitle() {
        return title;
    }
    public String getDetail() {
        return detail;
    }
    public String getDeadLine() {
        return deadLine.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    public String toString(){
        return getTitle() +"\n"+ getDetail() +"\n"+ getDeadLine();
    }
}
