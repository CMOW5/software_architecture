package proxy;

public interface PersonBean {
	String getName();
	String getGenger();
	String getInterests();
	int getHotOrNotRating();
	
	void setName(String name);
	void setInterests(String interests);
	void setGender(String gender);
	void setHotOrNotRating(int rating);
}
