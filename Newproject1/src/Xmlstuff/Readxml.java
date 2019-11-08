package Xmlstuff;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
public class Readxml {
	public String DataFile = "C:\\Users\\SANDESH\\workspace\\Newproject1\\src\\Xmlstuff\\Data.properties";
	public String XMLDataFile="C:\\Users\\SANDESH\\workspace\\Newproject1\\src\\Xmlstuff\\work.xml";
		public String sComp;

		public String testCaseDescription, included, ignoreReason, UserName, password;
		
		public static void main (String args[])
		{
			Readxml rp= new Readxml();
			try {
				rp.readXML("SGN-0002");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(rp.included);				
		}
		
		public void readXML(String testID) throws Exception{
	       String testCaseNumber = testID;
	        File file = new File(XMLDataFile);
	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        DocumentBuilder db = dbf.newDocumentBuilder();
	        Document doc = db.parse(file);
	        doc.getDocumentElement().normalize();
	        NodeList nodeLst = doc.getElementsByTagName("Test");
	        NodeList nodesIn = doc.getElementsByTagName("Description");
	        for (int s = 0; s < nodeLst.getLength(); s++) {
	        	 Node fstNode = nodeLst.item(s);
	        	 Node desNode = nodesIn.item(s);
	        	 System.out.println(desNode);
	        	 if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
		                Element testElmnt = (Element)fstNode;
		                String id = testElmnt.getAttribute("id");
		                System.out.println(id);
		                NodeList de = testElmnt.getElementsByTagName("Description");
		                Element des=(Element)de.item(0);
		                NodeList desList = des.getChildNodes();
		                System.out.println(((Node)desList.item(0)).getNodeValue());
		                if(id.equals(testCaseNumber))  {
		                	
		                    System.out.println("yes");
		                    
		                   break;
		                }
		                else {
		                System.out.println("No");
		                }
		            }
		       }
		    }
	        }