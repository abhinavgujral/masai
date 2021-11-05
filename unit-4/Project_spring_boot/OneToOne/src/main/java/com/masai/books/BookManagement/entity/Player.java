package com.masai.books.BookManagement.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    private Long id;
    private String player_name;
    private String player_details;
    private String player_code;
    private String player_info;

    public Player(){

    }

    public Player(Long id, String player_name, String player_details, String player_code, String player_info) {
        this.id = id;
        this.player_name = player_name;
        this.player_details = player_details;
        this.player_code = player_code;
        this.player_info = player_info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_details() {
        return player_details;
    }

    public void setPlayer_details(String player_details) {
        this.player_details = player_details;
    }

    public String getPlayer_code() {
        return player_code;
    }

    public void setPlayer_code(String player_code) {
        this.player_code = player_code;
    }

    public String getPlayer_info() {
        return player_info;
    }

    public void setPlayer_info(String player_info) {
        this.player_info = player_info;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", player_name='" + player_name + '\'' +
                ", player_details='" + player_details + '\'' +
                ", player_code='" + player_code + '\'' +
                ", player_info='" + player_info + '\'' +
                '}';
    }
}

