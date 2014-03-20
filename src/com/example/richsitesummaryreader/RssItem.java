package com.example.richsitesummaryreader;

public class RssItem {
	
	    private String Title;
	    private String Link;
	    private String Description;
	    

	    public RssItem() {
	        Title = "";
	        Link = "";
	        Description = "";
	    }
	    
	    public RssItem(String title, String link, String description) {
	        Title = title;
	        Link = link;
	        Description = description;
	    }

	    public String getDescription() {
	        return Description;
	    }

	    public void setDescription(String description) {
	        Description = description;
	    }

	    public String getLink() {
	        return Link;
	    }

	    public void setLink(String link) {
	        Link = link;
	    }

	    public String getTitle() {
	        return Title;
	    }

	    public void setTitle(String title) {
	        Title = title;
	    }

}
