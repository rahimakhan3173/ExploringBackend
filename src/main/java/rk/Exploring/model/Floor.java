package rk.Exploring.model;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

public class Floor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="Floor_Id")
    private Integer id;

    @Column(name = "Floor_Key")
    private String fkey;

    @Column(name = "Name")
    private String fname;

//    @ManyToOne
//    @JoinColumn(name="Status_key",referencedColumnName="Status_Key")
//    private String fstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFkey() {
        return fkey;
    }

    public void setFkey(String fkey) {
        this.fkey = fkey;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

//    public String getFstatus() {
//        return fstatus;
//    }
//
//    public void setFstatus(String fstatus) {
//        this.fstatus = fstatus;
//    }
}
