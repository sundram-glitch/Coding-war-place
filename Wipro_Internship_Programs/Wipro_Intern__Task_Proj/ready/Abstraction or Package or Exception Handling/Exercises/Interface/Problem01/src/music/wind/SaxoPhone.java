package music.wind;

import com.wipro.org.interfaces.Playable;

public class SaxoPhone implements Playable {

	public void play() {
    System.out.println(this.getClass().getName()+" playing");
	}

}
