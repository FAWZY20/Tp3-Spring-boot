package fr.paris8univ.iut.csid.csidwebrepositorybase;

import java.util.Date;

public class GitStatistiqueRepository {

    private int id;
    private String entry_type;
    private Date datetime;
    private int value;

    public  GitStatistiqueRepository() {}

    public GitStatistiqueRepository(int id, String entry_type, Date datetime, int value)
    {
        this.id =id;
        this.entry_type=entry_type;
        this.datetime=datetime;
        this.value=value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntry_type()
    {
        return entry_type;
    }

    public void setEntry_type(String entry_type)
    {
        this.entry_type = entry_type;
    }

    public Date getDatetime()
    {
        return datetime;
    }

    public void setDatetime(Date datetime)
    {
        this.datetime = datetime;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }


}
