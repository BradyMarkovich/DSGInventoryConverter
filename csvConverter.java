import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;  

public class csvConverter {

	
	public static void main(String[] args) throws IOException {
		String line = "";  
		String splitBy = ",";  
		FileWriter csvWriter = new FileWriter("new.csv");//new csv file that will be written to

		try   
		{  
		//parsing a CSV file into BufferedReader class constructor  
		BufferedReader br = new BufferedReader(new FileReader("InventoryFINAL.csv"));  
		while ((line = br.readLine()) != null)   //returns a Boolean value  
		{  
			CSVInventoryRecord record = new CSVInventoryRecord();
			String[] invrec = line.split(splitBy);    // Inventory Record from old POS's CSV inventory export
			
			//setting product handle
			if (invrec[4].equals("") == false)//checking if the product has a size
			{
				invrec[0] = invrec[0]+"-SIZE-"+invrec[4].toString();
			}
			record.setHandle(invrec[0]);
			System.out.println(record.getHandle());
			
			//setting the title of the product
			record.setTitle(invrec[0].replaceAll("-", " ").replaceAll("\"", ""));
			System.out.println(record.getTitle());

			//set the vendor
			if (invrec[0].equals("SHIPPING") != true) { //SHIPPING product breaks things
				record.setVendor(invrec[9]);
				System.out.println(record.getVendor());
			}
			
			//set type
			record.setType(invrec[2]);
			System.out.println(record.getType());
			
			
			//set variant title and value
			record.setOp1name(invrec[4]);
			
			if (record.getType() != "Accessories") {
				record.setOp1val(invrec[4]);
			}
			else {
				record.setOp1val("Default Title");
			}
			
			System.out.println(record.getOp1val());
			
			record.setInvqty(invrec[8]); //setting inventory quantity
			
			record.setVarprice(invrec[7]); //setting price of 
			
			record.setVarbarcode(invrec[1]);
			
			System.out.println(record.getVarbarcode());
			
			record.setCost(invrec[6]);
			System.out.println(record.getCost());
			
			//writing records to the CSV file
			csvWriter.append(record.getHandle());
			csvWriter.append(",");
			csvWriter.append(record.getTitle());
			csvWriter.append(",");
			csvWriter.append(record.getBody());
			csvWriter.append(",");
			csvWriter.append(record.getVendor());
			csvWriter.append(",");
			csvWriter.append(record.getType());
			csvWriter.append(",");
			csvWriter.append(record.getTags());
			csvWriter.append(",");
			csvWriter.append(record.getPublished());
			csvWriter.append(",");
			csvWriter.append(record.getOp1name());
			csvWriter.append(",");
			csvWriter.append(record.getOp1val());
			csvWriter.append(",");
			csvWriter.append(record.getOp2name());
			csvWriter.append(",");
			csvWriter.append(record.getOp2val());
			csvWriter.append(",");
			csvWriter.append(record.getOp3name());
			csvWriter.append(",");
			csvWriter.append(record.getOp3val());
			csvWriter.append(",");
			csvWriter.append(record.getVarsku());
			csvWriter.append(",");
			csvWriter.append(record.getVargrams());
			csvWriter.append(",");
			csvWriter.append(record.getVarinvtracker());
			csvWriter.append(",");
			csvWriter.append(record.getInvqty());
			csvWriter.append(",");
			csvWriter.append(record.getVarinvpol());
			csvWriter.append(",");
			csvWriter.append(record.getVarinvserv());
			csvWriter.append(",");
			csvWriter.append(record.getVarprice());
			csvWriter.append(",");
			csvWriter.append(record.getVarcompprice());
			csvWriter.append(",");
			csvWriter.append(record.getVarreqship());
			csvWriter.append(",");
			csvWriter.append(record.getVartax());
			csvWriter.append(",");
			csvWriter.append(record.getVarbarcode());
			csvWriter.append(",");
			csvWriter.append(record.getImgsrc());
			csvWriter.append(",");
			csvWriter.append(record.getImgpos());
			csvWriter.append(",");
			csvWriter.append(record.getImgalt());
			csvWriter.append(",");
			csvWriter.append(record.getGiftCard());
			csvWriter.append(",");
			csvWriter.append(record.getSeoTitle());
			csvWriter.append(",");
			csvWriter.append(record.getSeoDesc());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopCat());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopGender());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopAge());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopMPN());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopAdWords());
			csvWriter.append(",");
			csvWriter.append("");
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopCon());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopCustom());
			csvWriter.append(",");
			csvWriter.append("");
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopLabel1());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopLabel2());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopLabel3());
			csvWriter.append(",");
			csvWriter.append(record.getGoogleShopLabel4());
			csvWriter.append(",");
			csvWriter.append(record.getVarImage());
			csvWriter.append(",");
			csvWriter.append(record.getWeightUnit());
			csvWriter.append(",");
			csvWriter.append(record.getTaxcode());
			csvWriter.append(",");
			csvWriter.append(record.getCost());
			csvWriter.append("\n");
			
			}  
		
		//clearing out the csvWriter
		csvWriter.flush();
		csvWriter.close();
			
		
			
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
		 
	}

}


