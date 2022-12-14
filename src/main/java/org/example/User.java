package org.example;

public class User {
    // name, membership no, age, fav genre, books checked out
    private String name;
    private String favGenre;
    private Double membershipNum;
    private int numOfBooks;
    private String username;

    public User(String name, String favGenre, String username) {
        this.name = name;
        this.favGenre = favGenre;
        this.username = username;
//        this.membershipNum = membershipNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMembershipNum() {
        return membershipNum;
    }

    public void setMembershipNum(Double membershipNum) {
        this.membershipNum = membershipNum;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }
}
