package es.ufv.dis.ordinaria.api.datahandler;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import es.ufv.dis.ordinaria.api.models.Ship;

import java.io.FileOutputStream;

public class PDFManager {

    public void createPDF(Ship ship) {
        try {
            Document doc = new Document(PageSize.A4, 50, 50, 100, 72);
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("naves/" + ship.getName() + ".pdf"));
            doc.open();
            String text = "some padding text";
            Paragraph p1 = new Paragraph(ship.getName());
            p1.setAlignment(Element.ALIGN_JUSTIFIED);
            doc.add(p1);
            p1 = new Paragraph(ship.getModel());
            doc.add(p1);
            p1 = new Paragraph(ship.getStarshipClass());
            doc.add(p1);
            p1 = new Paragraph(ship.getCrew());
            doc.add(p1);
            p1 = new Paragraph("Number of movies: " + ship.getFilms().length);
            doc.add(p1);
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
