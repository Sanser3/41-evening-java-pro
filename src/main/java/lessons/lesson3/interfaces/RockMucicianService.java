package lessons.lesson3.interfaces;

public class RockMucicianService {

    public void singAll (Singer[] rockMusicians){
        for (int i = 0; i < rockMusicians.length; i++) {

            rockMusicians[i].sing();

        }
    }

    public void danceAll (Dancer[] rockMusicians){
        for (int i = 0; i < rockMusicians.length; i++) {

            rockMusicians[i].dance();

        }
    }
}
