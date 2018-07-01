package Composition;

public class HikingBagpack {
	
	private FirstAidKit firstaid;
	private FlashLight light;
	private Food trailmix;
	private Sunscreen sunscreen;
	private Water water;
	
	public HikingBagpack() {
		firstaid = new FirstAidKit();
		light = new FlashLight();
		trailmix = new Food();
		sunscreen = new Sunscreen();
		water = new Water();
		
		System.out.println("Created a new Hiking bag pack");
		
	}

}
