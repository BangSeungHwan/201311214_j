class Subway {
  int line;
  void run() {
    System.out.println(line + " line runs");
  }
  void setLine(int l){
    line=3;
  }
}

Subway mySub=new Subway();
mySub.setLine(3);
mySub.run();