public class ElevatorFitter {
    public static void main(String args[]){
        //Weigt of a person
        int wieghtofap;
        //Elevator weight limit 
        int elevatorWeightLmt;
        //Number of people
        int nmbofppl;

        wieghtofap = 150;

        elevatorWeightLmt = 1500;

        nmbofppl = elevatorWeightLmt/wieghtofap;

        boolean cyf = nmbofppl >= 10;
        System.out.print("The elevator can lift ");
        System.out.print(nmbofppl);
        System.out.println(" number of people");
        System.out.print(cyf);

    }
}
