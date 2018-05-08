package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.base.BaseModel;

@Entity
@Table(name = "users")
public class User extends BaseModel {
	
	private static final long serialVersionUID = -6294981775286222491L;

	@Id
    @GeneratedValue
	private Integer id;

	@Column(name = "info", nullable = true, length = 20)
    private String info;

	@Column(name = "name", nullable = true, length = 20)
    private String name;

	@Column(name = "number", nullable = true, length = 20)
    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}