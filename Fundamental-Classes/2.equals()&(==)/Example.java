//Test class of Test01
 class Example{
	  int x; int y;
	 public Example(int x,int y){
     this.x=x; this.y=y;
	 }
	 public boolean equals(Object obj){
     if(obj instanceof Example){
     Example e=(Example)obj;
	 return this.x==e.x && this.y==y;
	 }
	 else{
     return false;
	 }
	 }
 }