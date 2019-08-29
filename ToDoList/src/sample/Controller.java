package sample;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Controller {
    private ArrayList<todoData> todoDataList = new ArrayList<>();

    @FXML
    private SplitPane mainPane;
    @FXML
    private TextField addDataTitle;
    @FXML
    private TextArea addDetail;
    @FXML
    private DatePicker addDatePicker;
    @FXML
    private Button addButton;
    @FXML
    private ListView viewTitle;
    @FXML
    private TextArea viewDetail;
    @FXML
    private ListView<todoData> listViewShow;
    @FXML
    private Label DueLabel;



    @FXML
    public void addButtonOnAction(Event event) {
        String title = addDataTitle.getText();
        String detail = addDetail.getText();
        LocalDate deadLine = addDatePicker.getValue();
        todoData newData = new todoData(title, detail, deadLine);
        todoDataList.add(newData);
        viewDetail.setText(printt(todoDataList));
    }

    public static String printt(ArrayList<todoData> todoDataList) {
        String str = "";
        for(todoData i : todoDataList){
            str += i.toString() + "\n";
        }return  str;
    }

//    @FXML
//    public void handleListView(Event event) {
//        ListView listView = new ListView();
//        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//        ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();
//        listView.getItems().add("Item 1");
//        for(Object o : selectedIndices){
//            System.out.println("o = " + o + " (" + o.getClass() + ")");
//        }
//    }

}
