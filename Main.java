import java.util.Scanner; // import the scanner class

////// CHANGE THE CODE BELOW TO SOLVE THE PROBLEM ///////

class Group {

  String name;
  int member_count;
  int year;
  int group_id;

  static int group_counter = 0;

  public Group(String n, int m, int y){

    name = n;
    member_count = m;
    year = y;
    
    group_counter++;
    group_id = group_counter;
    
  }


  public void show_info(){

    System.out.println("Group " + group_id);
    System.out.println("Name: " + name);
    System.out.println("Members: " + member_count);
    System.out.println("Year of Debut: " + year);

    System.out.println("");

  }


  public static void compare_years(Group g1, Group g2){

    System.out.println(g1.name + " has existed longer: "  + (g1.year < g2.year));  

  }


  public static void compare_member_count(Group g1, Group g2){

    System.out.println(g1.name + " has more members: "  + (g1.member_count > g2.member_count));

  }


  public static void get_total_members(Group g1, Group g2){

    System.out.println("Total number of members: "  + (g1.member_count + g2.member_count));

  }

}



////// CHANGE THE CODE ABOVE TO SOLVE THE PROBLEM ///////

class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Group[] g = new Group[2];

    for (int i=0; i<2; i++){

      System.out.println("");
      System.out.print("Enter groupname: ");
      String name = input.nextLine();

      System.out.print("Enter number of members: ");
      int member_count = input.nextInt();

      input.nextLine();
      
      System.out.print("Enter year of debut: ");
      int year = input.nextInt();

      input.nextLine();

      g[i] = new Group(name, member_count, year);

      System.out.println("");

    }

    input.close();

    g[0].show_info();

    g[1].show_info();

    Group.get_total_members(g[1], g[0]);

    Group.compare_years(g[1], g[0]);

    Group.compare_member_count(g[0], g[1]);

  }

}
