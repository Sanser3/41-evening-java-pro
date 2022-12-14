package lessons.lesson3.interfaces;

public class RockMusicianDemo {

    public static void main(String[] args) {

        RockMusician musician = new RockMusician();
        Singer singer = new RockMusician();
        Dancer dancer = new RockMusician();

        musician.dance();
        musician.sing();

//        singer.sing();

        Singer[] singers = {
                new PopMusician(),
                new RockMusician()
        };

//        singers[0].sing();
//        singers[1].sing();

        Singer[] rockMusiciansSing = {
                new RockMusician(),new PopMusician(),
                new RockMusician(),new PopMusician(),
                new RockMusician(),new PopMusician(),
                new RockMusician()};

        Dancer[] rockMusiciansDance = {
                new RockMusician(),new PopMusician(),
                new RockMusician(),new PopMusician(),
                new RockMusician(),new PopMusician(),
                new RockMusician()};



        RockMucicianService service = new RockMucicianService();
        service.singAll(rockMusiciansSing);
        service.danceAll(rockMusiciansDance);


    }




}
