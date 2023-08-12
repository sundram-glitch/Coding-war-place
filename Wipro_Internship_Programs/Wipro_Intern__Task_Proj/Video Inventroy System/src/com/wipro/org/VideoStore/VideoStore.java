package com.wipro.org.VideoStore;
import java.util.Scanner;
import com.wipro.org.videoEntry.Video;
public class VideoStore {
  public void selectOpt(int  opt){
	  Scanner sc = new Scanner(System.in);
	  int videosize = sc.nextInt();
	  Video[] arr = new Video[videosize];
	  Video obj = new Video();
	  int i = 0;
	  switch(opt) {
	  case 1: arr[i++] = new Video(sc.nextLine());
	  break;
	  case 2: obj.doCheckOut();
	  break;
	  case 3: obj.returnVideo(sc.nextLine(), arr);
	  break;
	  case 4: System.out.println("Enter the name of the Video you want to rate :"); 
		      String name = sc.nextLine();
	          System.out.println("Enter the name of the Video you want to rate :"); 
		      int rating = sc.nextInt();
	          obj.receiveRating(name , rating, arr);
	  case 5: for (Video video : arr) {
		          System.out.println(video.getName()+" ");
	          }
	  }
  }
}
