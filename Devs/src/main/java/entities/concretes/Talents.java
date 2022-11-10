package entities.concretes;

public class Talents {

    private int id;
    private String name;
    private String programinglanguages;

    public Talents(int id, String name, String programinglanguages) {
        this.id = id;
        this.name = name;
        this.programinglanguages = programinglanguages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrograminglanguages() {
        return programinglanguages;
    }

    public void setPrograminglanguages(String programinglanguages) {
        if (programinglanguages!=null){
        this.programinglanguages = programinglanguages;}
    }
}
