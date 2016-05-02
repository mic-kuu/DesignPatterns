package StrategyDP;

public interface Attacks {

    String attack();

}

class UseGun implements Attacks {

    @Override
    public String attack() {
        return "BANG BANG!";
    }
}

class UseSword implements Attacks {

    @Override
    public String attack() {
        return "CLING CLANG!";
    }
}


