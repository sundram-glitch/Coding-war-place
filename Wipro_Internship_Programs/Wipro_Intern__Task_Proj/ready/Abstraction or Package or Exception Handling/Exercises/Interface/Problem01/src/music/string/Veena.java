package music.string;
import com.wipro.org.interfaces.Playable;
public class Veena implements Playable {

	@Override
	public void play() {
	    System.out.println(this.getClass().getName()+" playing");
	}

}
