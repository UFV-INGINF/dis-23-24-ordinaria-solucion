package es.ufv.dis.ordinaria.api;

import es.ufv.dis.ordinaria.api.datahandler.JSONManager;
import es.ufv.dis.ordinaria.api.datahandler.PDFManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
		JSONManager jsonManager = new JSONManager();
		jsonManager.getRequestsLog();
		jsonManager.writeRequestsLog("millenium falcon");
		jsonManager.getRequestsLog();
		PDFManager pdfManager = new PDFManager();

		pdfManager.createPDF(jsonManager.getShipsList().get(1));
	}

}
