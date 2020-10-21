class Tree
{
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree()
  {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor)
  {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  //setter
  void setTreeName (String aTreeName)
  {
    treeName = aTreeName;
  }
  
  void setTreeType (String aTreeType)
  {
    treeType = aTreeType;
  }

  void setLeavesFall (boolean doLeavesFall)
  {
    leavesFall = doLeavesFall;
  }

  void setLeafColor(String aLeafColor)
  {
    leafColor = aLeafColor;
  }

  //getter
  String getTreeName()
  {
    return treeName;
  }

  String getTreeType()
  {
    return treeType;
  }

  boolean getLeavesFall()
  {
    return leavesFall;
  }

  String getLeafColor()
  {
    return leafColor;
  }

  void printTree()
  {
    System.out.print("This is a " + treeName + " tree. ");
    System.out.print("It is a " + treeType + " ");
    System.out.print("and its leaves are currently " + leafColor + ". ");
    if (leavesFall == true)
    {
      System.out.println("It will lose its leaves for the winter.");
    }
    else
    {
      System.out.println("It will not lose its leaves for the winter.");
    }
  }
}