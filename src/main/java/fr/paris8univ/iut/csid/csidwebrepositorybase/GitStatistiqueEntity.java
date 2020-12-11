package fr.paris8univ.iut.csid.csidwebrepositorybase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "static")
public class GitStatistiqueEntity {

    @Id
    @Column(name = "entry_type")
    private String entry_type;

    @Column(name = "datetime")
    private Date datetime;

    @Column(name = "value")
    private int value;

    public GitStatistiqueEntity() { }

    public GitStatistiqueEntity(String entry_type, Date datetime, int value)
    {
        this.entry_type=entry_type;
        this.datetime=datetime;
        this.value=value;
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
