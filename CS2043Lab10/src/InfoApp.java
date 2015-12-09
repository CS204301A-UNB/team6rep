
public class InfoApp {
	public static void main(String[] args){
		
		InfoPrintMcConnell mcPrint = new InfoPrintMcConnell();
		InfoPrintGodin goPrint = new InfoPrintGodin();
		System.out.println("Team 6 Member List");
		
		mcPrint.printMcConnell();
		goPrint.printGodin();
	}
}
