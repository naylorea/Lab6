class Tree {
    private String treeName;
    private String treeType;
    private boolean leavesFall;
    private String leafColor;

    Tree(){
      treeName = "";
      treeType = "";
      leavesFall = false;
      leafColor = "";
    }

    Tree(String aTreeName, String aTreeType, boolean aLeavesFall,String aLeafColor){
      treeName = aTreeName;
      treeType = aTreeType;
      leavesFall = aLeavesFall;
      leafColor = aLeafColor;
    }

     void setName(String theName){
      treeName = theName;
    }
     void setType(String theType){
      treeType = theType;
    }
     void setFall(boolean theFall){
      leavesFall = theFall;
    }
    void setColor(String theColor){
      leafColor = theColor;
    }
    String getName(){
      return treeName;
    }
    String getType(){
      return treeType;
    }
    boolean getFall(){
      return leavesFall;
    }
    String getColor(){
      return leafColor;
    }
    void print(){
      System.out.print("This is a " + treeName + " tree");
      System.out.print(". It is a " + treeType);
      System.out.print(" and its leaves are currently " + leafColor);
      if (leavesFall == false){
        System.out.print(". It does not lose its leaves for the winter.");
      }
      else{
        System.out.print(" It does lose its leaves for the winter.");
      }
    }

  }