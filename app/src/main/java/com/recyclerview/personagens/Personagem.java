package com.recyclerview.personagens;

public class Personagem {
    private final String name;
    private final String age;
    private final String score;
    private final int pic;

    public Personagem(String name, String age, String score, int pic) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getScore() {
        return score;
    }

    public int getPic() {
        return pic;
    }
}
