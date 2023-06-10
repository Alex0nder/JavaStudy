package Year2023.Task33_OOP_OverloadMonster;

public class Monster {
    // Create class Monster, have 3 type int (eyes, legs, hands)
    // Create 4 Constructors: 1 Clear, 2 One Parameterized, 3 Two, 4 three
    // If Constructors don't have parameterized = 2

    // Create methods
    // void voice() = and show in display "voice"
    // void voice(int i) show 1 times voice i times
    // void voice(int i, String word), show word i times.

    int eyes;
    int hands;
    int legs;

    //we can "this" not show, so that it is immediately clear that I am accessing instance variables
    Monster() {
        this.eyes = 2;
        this.hands = 2;
        this.legs = 2;
    }
    Monster(int eyes) {
        this.eyes = eyes;
        this.hands = 2;
        this.legs = 2;
    }
    Monster(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = 2;
    }

    Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    //Voice monster
    void voice() {
        System.out.println("Voice");
    }
    //Conditions voice
    void voice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Voice");
        }
    }
    //Conditions Word Monster
    void voice(int n, String word) {
        for (int i = 0; i < n; i++){
            System.out.println(word);
        }
    }
}
