/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triathlon.com;

/**
 *
 * @author subek
 */
public class EliteParticipant extends participant {
    private String sponsorName;

    public EliteParticipant(String name, String id, int swimmingTime, int cyclingTime, int runningTime, String sponsorName) {
        super(name, id, swimmingTime, cyclingTime, runningTime);
        this.sponsorName = sponsorName;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sponsor: " + sponsorName);
    }
}


    


