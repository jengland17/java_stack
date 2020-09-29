import java.util.*;


public class Project {

    private String name;
    private String description; 
    private Double initialCost;


    public String elevatorPitch() {
        return (this.getName() + " ($" + this.getInitialCost() + ")" + ": " + this.getDescription());
    }



    // contructors
    public Project() {
        this.name = "";
        this.description = "";
        this.initialCost = 0.00;
    }

    public Project(String name) {
        this.name = name;
        this.description = "";
        this.initialCost = 0.00;
    }

    public Project (String name, String description) {
        this.name = name;
        this.description = description;
        this.initialCost = 0.00;
    }

    public Project (String name, String description, Double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getInitialCost() {
        return initialCost;
    }


}