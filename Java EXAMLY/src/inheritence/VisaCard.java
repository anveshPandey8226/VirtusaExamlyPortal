package inheritence;

import java.util.Scanner;

class VISA{
    private String holdername;
    private String ccv; 
    
    public Double computeRewardPoints(String purchaseType, Double amount){
        double reward = (1.0*amount)/100.0;
        System.out.println(reward);
		return reward;
    }
}

class HPVISACard extends VISA{
    
    @Override
    public Double computeRewardPoints(String purchaseType, Double amount){
       
        double reward = super.computeRewardPoints(purchaseType, amount);
        if(purchaseType.equals("fuel")) {
            reward += 10.0;
        }
        
        System.out.println("After"+reward);
        System.out.println(reward);
		return reward;
    }
}

class VisaCard{
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String name = s.next();
        String acc = s.next();
        double amt = s.nextDouble();
        String type = s.next();
        int choice = s.nextInt();
        
        if(choice == 1) {
        	VISA vc = new VISA();
        	vc.computeRewardPoints(type, amt);
        }
        else if(choice ==2) {
        	System.out.println("HP");
        	HPVISACard hp = new HPVISACard();
        	hp.computeRewardPoints(type, amt);
        }
        else {
        	System.out.println("Invalid");
        	
        }
        
    }
}