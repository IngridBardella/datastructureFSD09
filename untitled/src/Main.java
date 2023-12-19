import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    private static Map<String, List<String>> playersByTeam = new HashMap<>();
    public static void main(String[] args) {
        //have a file that contains the team name and team members
        //team1 : Alex, John, Mary
        //team2 : Kai, Rodolohe, Rose
        //team3 : Betty, Jack, Catherine

        //how we can read the file and specify the teams and the members and then show them in the output.

        //how can I check who plays in which team ?!

        //process team members

        try(Scanner fileInput= new Scanner(new File("teams.txt"))){
            while(fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                //data structure 1 = Array
                String[] data = line.split(":");
                if(data.length != 2){ // using .length to check the size of array
                    System.out.println("invalid data");
                    continue;
                }
                String teamName = data[0];
                String[] teamMembers = data[1].split(",");
                //ArrayList data structure
                List<String> listOfMembers = new ArrayList<>();
                for(String member : teamMembers){
                    listOfMembers.add(member);
                }
                playersByTeam.put(teamName, listOfMembers);
                System.out.println(playersByTeam);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}