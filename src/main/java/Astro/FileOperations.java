package Astro;

import java.io.*;
import java.util.Scanner;

public class FileOperations
{private String name, lastName, dateOfBirth, grow, login, password ;
    File file = new File( "pass.txt" );
    Scanner in;

    {
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FileOperations(String name,String lastName ,String dateOfBirth,String grow,String login,String password) {
       //UserRegistration userRegistration = new UserRegistration();
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grow = grow;
        this.login = login;
        this.password = password;
    }

    public void saveFile () throws IOException {
        //File file = new File( "C:\\Users\\Astro\\IdeaProjects\\Dietav1\\src\\main\\java\\Astro\\pass.txt" );
String saveFile;
saveFile = name+"/"+ lastName+"/"+  dateOfBirth+"/"+  grow+"/"+  login+"/"+password;
        FileWriter fileWriter = new FileWriter("pass.txt");
        fileWriter.write(saveFile);
                fileWriter.close();

        //password = in.nextLine ();
        System.out.println(saveFile);
    }
    /*
    FileWriter fw = new FileWriter("out.txt");
    for (int i = 0; i < 10; i++) {
		fw.write("something");
	}

	fw.close();
    ****************8
    File fout = new File("out.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 for (int i = 0; i < 10; i++) {
		bw.write("something");
		bw.newLine();
	}
 bw.close();
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGrow() {
        return grow;
    }

    public void setGrow(String grow) {
        this.grow = grow;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public FileOperations()
    {


    }
}
