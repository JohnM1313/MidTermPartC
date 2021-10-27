/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Lego1
 */
public class TestUserprofile {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = input.next();
        
        System.out.println("Pick your favourite genre");
        for(int i=0;i<UserProfile.genres.length;i++){
            System.out.println(UserProfile.genres.length);
        }
        String genre =input.next();
        
        UserProfile newProfile = new UserProfile(name,genre);
        
        System.out.println("Your profile is created.");
    }
}
