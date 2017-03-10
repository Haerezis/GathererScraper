package com.gelakinetic.GathererScraper.JsonTypes;

import java.util.ArrayList;

public class LegalityData {
	
	public Format mFormats[];
	public String mDate;
	
	public class Format {
		public String mName;
		public ArrayList<String> mSets = new ArrayList<String>();
		public ArrayList<String> mRestrictedlist = new ArrayList<String>();
		public ArrayList<String> mBanlist = new ArrayList<String>();
	}
}

