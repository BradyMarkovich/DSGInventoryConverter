import java.util.*;

public class CSVInventoryRecord{
	
	private String handle;
	private String title;
	private String body = "";
	private String vendor;
	private String type;
	private String tags = "";
	private String published = "FALSE";
	private String op1name;
	private String op1val;
	private String op2name = "";
	private String op2val = "";
	private String op3name = "";
	private String op3val = "";
	private String vargrams = "0.0";
	private String varsku = "";
	private String varinvtracker = "shopify";
	private String invqty = "0";
	private String varinvpol = "deny";
	private String varinvserv = "manual";
	private String varprice;
	private String varcompprice = "";
	private String varreqship = "TRUE";
	private String vartax = "TRUE";
	private String varbarcode;
	private String imgsrc = "";
	private String imgpos = "1";
	private String imgalt = "";
	private String giftCard = "FALSE";
	private String seoTitle = "";
	private String seoDesc = "";
	private String googleShopCat = "";
	private String googleShopGender = "";
	private String googleShopAge = "";
	private String googleShopMPN = "";
	private String googleShopAdWords = "";
	private String googleShopCon = "";
	private String googleShopCustom = "";
	private String googleShopLabel1 = "";
	private String googleShopLabel2 = "";
	private String googleShopLabel3 = "";
	private String googleShopLabel4 = "";
	private String weightUnit = "kg";
	private String varImage = "";
	private String taxcode = "";
	private String cost;
	
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		this.handle = handle.replaceAll("\\s+", "-").replaceAll("\"", "");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		if (vendor.equals("JAK'S")) {
			this.vendor = vendor;
		}else {
			vendor = vendor.toLowerCase();
			Scanner lineScan = new Scanner(vendor); 
			String upper_case_line = "";
	        while(lineScan.hasNext()) {
	        	
		            String word = lineScan.next(); 
		            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
	        	
		       }
	        vendor = upper_case_line;
			this.vendor = vendor;
		}
		

	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if (type.contains("BOOT"))
		{
			type = "Boots";
		}
		else if ((type.equals("CASUAL")) || (type.equals("RUNNER")) || (type.contains("SHOE")))
		{
			type = "Shoe";
		}
		else if (type.contains("SANDAL"))
		{
			type = "Sandals";
		}
		else {
			type = "Accessories";
		}
		this.type = type;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getOp1name() {
		return op1name;
	}
	public void setOp1name(String op1name) {
		if (op1name.equals(""))
		{
			op1name = "Title";
		}
		else {
			op1name = "Size";
		}
		this.op1name = op1name;
	}
	public String getOp1val() {
		return op1val;
	}
	public void setOp1val(String op1val) {
		this.op1val = op1val;
	}
	public String getVarinvtracker() {
		return varinvtracker;
	}
	public void setVarinvtracker(String varinvtracker) {
		this.varinvtracker = varinvtracker;
	}
	public String getVargrams() {
		return vargrams;
	}
	public void setVargrams(String vargrams) {
		this.vargrams = vargrams;
	}
	public String getInvqty() {
		return invqty;
	}
	public void setInvqty(String invqty) {
		this.invqty = invqty;
	}
	public String getVarinvpol() {
		return varinvpol;
	}
	public void setVarinvpol(String varinvpol) {
		this.varinvpol = varinvpol;
	}
	public String getVarinvserv() {
		return varinvserv;
	}
	public void setVarinvserv(String varinvserv) {
		this.varinvserv = varinvserv;
	}
	public String getVarprice() {
		return varprice;
	}
	public void setVarprice(String varprice) {
		this.varprice = varprice;
	}
	public String getVarcompprice() {
		return varcompprice;
	}
	public void setVarcompprice(String varcompprice) {
		this.varcompprice = varcompprice;
	}
	public String getVarreqship() {
		return varreqship;
	}
	public void setVarreqship(String varreqship) {
		this.varreqship = varreqship;
	}
	public String getVartax() {
		return vartax;
	}
	public void setVartax(String vartax) {
		this.vartax = vartax;
	}
	public String getVarbarcode() {
		return varbarcode;
	}
	public void setVarbarcode(String varbarcode) {
		
		this.varbarcode = "'" + varbarcode;
	}
	public String getImgpos() {
		return imgpos;
	}
	public void setImgpos(String imgpos) {
		this.imgpos = imgpos;
	}
	public String getGiftCard() {
		return giftCard;
	}
	public void setGiftCard(String giftCard) {
		this.giftCard = giftCard;
	}
	public String getSeoTitle() {
		return seoTitle;
	}
	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}
	public String getSeoDesc() {
		return seoDesc;
	}
	public void setSeoDesc(String seoDesc) {
		this.seoDesc = seoDesc;
	}
	public String getVarImage() {
		return varImage;
	}
	public void setVarImage(String varImage) {
		this.varImage = varImage;
	}
	public String getTaxcode() {
		return taxcode;
	}
	public void setTaxcode(String taxcode) {
		this.taxcode = taxcode;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getOp2name() {
		return op2name;
	}
	public void setOp2name(String op2name) {
		this.op2name = op2name;
	}
	public String getOp2val() {
		return op2val;
	}
	public void setOp2val(String op2val) {
		this.op2val = op2val;
	}
	public String getOp3name() {
		return op3name;
	}
	public void setOp3name(String op3name) {
		this.op3name = op3name;
	}
	public String getOp3val() {
		return op3val;
	}
	public void setOp3val(String op3val) {
		this.op3val = op3val;
	}
	public String getVarsku() {
		return varsku;
	}
	public void setVarsku(String varsku) {
		this.varsku = varsku;
	}
	public String getImgsrc() {
		return imgsrc;
	}
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
	public String getImgalt() {
		return imgalt;
	}
	public void setImgalt(String imgalt) {
		this.imgalt = imgalt;
	}
	public String getGoogleShopCat() {
		return googleShopCat;
	}
	public void setGoogleShopCat(String googleShopCat) {
		this.googleShopCat = googleShopCat;
	}
	public String getGoogleShopGender() {
		return googleShopGender;
	}
	public void setGoogleShopGender(String googleShopGender) {
		this.googleShopGender = googleShopGender;
	}
	public String getGoogleShopAge() {
		return googleShopAge;
	}
	public void setGoogleShopAge(String googleShopAge) {
		this.googleShopAge = googleShopAge;
	}
	public String getGoogleShopMPN() {
		return googleShopMPN;
	}
	public void setGoogleShopMPN(String googleShopMPN) {
		this.googleShopMPN = googleShopMPN;
	}
	public String getGoogleShopAdWords() {
		return googleShopAdWords;
	}
	public void setGoogleShopAdWords(String googleShopAdWords) {
		this.googleShopAdWords = googleShopAdWords;
	}
	public String getGoogleShopCon() {
		return googleShopCon;
	}
	public void setGoogleShopCon(String googleShopCon) {
		this.googleShopCon = googleShopCon;
	}
	public String getGoogleShopCustom() {
		return googleShopCustom;
	}
	public void setGoogleShopCustom(String googleShopCustom) {
		this.googleShopCustom = googleShopCustom;
	}
	public String getGoogleShopLabel1() {
		return googleShopLabel1;
	}
	public void setGoogleShopLabel1(String googleShopLabel1) {
		this.googleShopLabel1 = googleShopLabel1;
	}
	public String getGoogleShopLabel2() {
		return googleShopLabel2;
	}
	public void setGoogleShopLabel2(String googleShopLabel2) {
		this.googleShopLabel2 = googleShopLabel2;
	}
	public String getGoogleShopLabel3() {
		return googleShopLabel3;
	}
	public void setGoogleShopLabel3(String googleShopLabel3) {
		this.googleShopLabel3 = googleShopLabel3;
	}
	public String getGoogleShopLabel4() {
		return googleShopLabel4;
	}
	public void setGoogleShopLabel4(String googleShopLabel4) {
		this.googleShopLabel4 = googleShopLabel4;
	}
	public String getWeightUnit() {
		return weightUnit;
	}
	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}
	
	
	
	
}
