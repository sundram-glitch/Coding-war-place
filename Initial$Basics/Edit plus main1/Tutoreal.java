class Tutoreal 
{
	  int x = 10;
	  
	  void m1(int q){
		  q=50;
	  }

	  void m2(Tutoreal t){
		  t =new Tutoreal();
	  }
	  void m3(Tutoreal t){
		  t.x=15;
      }
	  void m4(Tutoreal t){
		 t =new Tutoreal();
		  t.x=16;
	  }
	  void m5(Tutoreal t){
		  t.x =19;
		  t=new Tutoreal();
		  t.x=20;
	  }

}/*Tutorial end*/