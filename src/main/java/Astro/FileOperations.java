package Astro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations extends UserLogin{
    private String name, lastName, dateOfBirth, grow, login, password;
    File file = new File("pass.txt");
    Scanner in;

    {
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FileOperations(String name, String lastName, String dateOfBirth, String grow, String login, String password) {
        //UserRegistration userRegistration = new UserRegistration();
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grow = grow;
        this.login = login;
        this.password = password;
    }

    public void saveFile() throws IOException {

        String saveFile;
        saveFile = name + "," + lastName + "," + dateOfBirth + "," + grow + "," + login + "," + password;
        FileWriter fileWriter = new FileWriter("pass.txt");
        fileWriter.write(saveFile);
        fileWriter.close();
        System.out.println(saveFile);
    }
    public void odczytFile() throws IOException
    {
        File file = new File("pass.txt");
        Scanner in = new Scanner(file);
        String zdanie = in.nextLine();

        String wynik1[];

        wynik1 = zdanie.split(","); // uzywam metody split ktory pozwaa mi rodzieic stringa wcztanego w calosci jako linia i z rodzielnikiem przecinek ","
        System.out.println(zdanie);


        this.name = String.valueOf(wynik1[0]);
        this.lastName = String.valueOf(wynik1[1]);
        this.dateOfBirth = String.valueOf(wynik1[2]);
        this.grow = String.valueOf(wynik1[3]);
        this.login = String.valueOf(wynik1[4]);
        this.password = String.valueOf(wynik1[5]);

        //wynik1[0] = this.name; // nie czyta z pliku ???????????????????
       /* wynik1[1] = lastName;
        wynik1[2] = dateOfBirth;
        wynik1[3] = grow;
        wynik1[4] = login;
        wynik1[5] = password;*/

        UserLogin userLogin = new UserLogin();
        String temp = userLogin.getTextField1().toString();

if (login.equals(temp))
        {
            System.out.println(" Login ok");;
        }else {
    System.out.println(" Login nie ok");

}

// todo : zrobic tak aby wczytac dane passa i loginu i porownac z wprowdzonymi na poczatku.
        // todo: wczytac passy przy zapisie / rejestracja/  podac je do zmiennej i zapisac razem z nowymi
    }

    private String toString(String textField1) {
        return textField1;
    }

    @Override
    public String toString() {
        return "FileOperations{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", grow='" + grow + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", file=" + file +
                ", in=" + in +
                '}';
    }

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

    public FileOperations() {


    }
}
