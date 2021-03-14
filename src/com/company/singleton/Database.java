package com.company.singleton;

public class Database {

    private Database() { }

    private static Database instance;

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String query) {
        System.out.println(query);
    }

}
