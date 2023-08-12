package live;
import com.wipro.org.interfaces.Playable;
import music.string.Veena;
import music.wind.SaxoPhone;
public class Test {
     /**@author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	public static void main(String[] args) {
      Playable obj;
      obj = new Veena();
      obj.play();
      obj = new SaxoPhone();
      obj.play();
	}

}
