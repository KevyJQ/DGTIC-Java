package mx.unam.diplomado.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import mx.unam.diplomado.modelo.entidades.Contacto;

public class PdfView extends AbstractPdfView {

	@Override
    protected void buildPdfDocument(
            Map<String, Object> model,
            Document document,
            PdfWriter writer,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        List<Contacto> contactos = (List<Contacto>) model.get("contactosList");

        PdfPTable table = new PdfPTable(4);
        
        table.addCell("Nombre");
        table.addCell("Apellidos");
        table.addCell("Edad");
        table.addCell("Direccion");

        for(Contacto contacto : contactos ) {
        	table.addCell(contacto.getNombre());
            table.addCell(contacto.getApellidos());
            table.addCell(contacto.getEdad().toString());
            table.addCell(contacto.getDireccion());
        }
        document.add(table);
    }
	
}
