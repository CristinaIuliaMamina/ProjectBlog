package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by cristina on 9/11/2015.
 */
@Entity
@Table(name="article")
public class Article {

    @Id
    @GeneratedValue(generator ="idIncrementor")
    @GenericGenerator(name="idIncrementor",strategy="increment")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="content")
    private String content;
    @Column(name="description")
    private String description;


    public Article(){};

    public Article(int id, String name, String content, String description) {

        this.id = id;
        this.name = name;
        this.content = content;
        this.description = description;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
