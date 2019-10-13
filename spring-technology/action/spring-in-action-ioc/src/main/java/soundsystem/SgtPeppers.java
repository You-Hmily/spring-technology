package soundsystem;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{

    private String title="Sgt.Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";

    public void play() {
        System.out.printf("Playing %s by %s \n",title,artist);
    }
}
