package model;

public class SiteEVLogic {
	public void like(SiteEV site) {
		int count = site.getGood();
		site.setGood(count+1);
	}

	public void dislike(SiteEV site) {
		int count = site.getBad();
		site.setBad(count+1);
	}
}
