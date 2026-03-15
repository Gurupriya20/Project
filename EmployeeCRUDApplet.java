import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EmployeeCRUDApplet extends Applet implements ActionListener {

    TextField idField, nameField, deptField, salaryField;
    Button addBtn, viewBtn, updateBtn, deleteBtn;
    TextArea displayArea;

    ArrayList<String> employees = new ArrayList<>();

    public void init() {

        setLayout(new GridLayout(7,2));

        add(new Label("Employee ID"));
        idField = new TextField();
        add(idField);

        add(new Label("Name"));
        nameField = new TextField();
        add(nameField);

        add(new Label("Department"));
        deptField = new TextField();
        add(deptField);

        add(new Label("Salary"));
        salaryField = new TextField();
        add(salaryField);

        addBtn = new Button("Add");
        viewBtn = new Button("View");
        updateBtn = new Button("Update");
        deleteBtn = new Button("Delete");

        add(addBtn);
        add(viewBtn);
        add(updateBtn);
        add(deleteBtn);

        displayArea = new TextArea();
        add(displayArea);

        addBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String emp = idField.getText()+" "
                   + nameField.getText()+" "
                   + deptField.getText()+" "
                   + salaryField.getText();

        if(e.getSource()==addBtn){
            employees.add(emp);
            displayArea.setText("Employee Added\n");
        }

        if(e.getSource()==viewBtn){
            displayArea.setText("");
            for(String s : employees){
                displayArea.append(s+"\n");
            }
        }

        if(e.getSource()==deleteBtn){
            if(!employees.isEmpty()){
                employees.remove(employees.size()-1);
                displayArea.setText("Last Employee Deleted");
            }
        }

        if(e.getSource()==updateBtn){
            if(!employees.isEmpty()){
                employees.set(0,emp);
                displayArea.setText("First Employee Updated");
            }
        }
    }
}