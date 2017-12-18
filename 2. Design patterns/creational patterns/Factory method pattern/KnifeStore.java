package javaTest2;

public abstract class KnifeStore {
	
	public Knife orderKnife(String knifeType) {
		Knife knife;
		
		knife = createKnife(knifeType);
		
		knife.sharpen();
		knife.polish();
		knife.packageKnife();
		
		return knife;
		
		
	}
	
	abstract Knife createKnife(String type);

}
