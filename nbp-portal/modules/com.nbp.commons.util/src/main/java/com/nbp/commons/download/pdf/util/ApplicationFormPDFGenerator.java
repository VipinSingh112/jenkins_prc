package com.nbp.commons.download.pdf.util;


import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class ApplicationFormPDFGenerator {


	/**
	 * Private constructor due to class having static member need not to be
	 * instantiated.
	 */

	private ApplicationFormPDFGenerator() {
		throw new IllegalStateException("Utility class");
	}

	private static final Log _log = LogFactoryUtil.getLog(ApplicationFormPDFGenerator.class);

	public static File generatePdf(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			String fileName ,String pdfTemplate) {
		BufferedWriter writer = null;
		FileWriter fileWriter = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File pdfFile = null;

		try {

			Template template = getTemplate(pdfTemplate);

			StringWriter output = new StringWriter();

			template.process(replacePdfVariables(resourceRequest, 0), output);

			String content = output.toString();

			pdfFile = createPDFFile(fileName);
			fos = new FileOutputStream(pdfFile);
			bos = new BufferedOutputStream(fos);

			generatePDF(content, pdfFile);

			bos.close();
			fos.close();
		} catch (Exception e) {
			_log.error(e, e);
			/*
			 * if (_log.isDebugEnabled()) { _log.error(e, e); }
			 */
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					if (_log.isDebugEnabled()) {
						_log.error(e, e);
					}
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					if (_log.isDebugEnabled()) {
						_log.error(e, e);
					}
				}
			}
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					if (_log.isDebugEnabled()) {
						_log.error(e, e);
					}
				}
			}
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					if (_log.isDebugEnabled()) {
						_log.error(e, e);
					}
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					if (_log.isDebugEnabled()) {
						_log.error(e, e);
					}
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					if (_log.isDebugEnabled()) {
						_log.error(e, e);
					}
				}
			}
		}
		return pdfFile;
	}

	public static Template getTemplate(String template) {
		Template tem = null;
		try {

			@SuppressWarnings("deprecation")
			Configuration cfg = new Configuration();
			StringTemplateLoader stringLoader = new StringTemplateLoader();
			stringLoader.putTemplate("template", template);

			cfg.setTemplateLoader(stringLoader);

			cfg.setDefaultEncoding("UTF-8");
			cfg.setLocale(Locale.US);
			cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
			tem = cfg.getTemplate("template");
		} catch (Exception e) {
			_log.error(e, e);
		}

		return tem;
	}

	private static File getExportDirectory() {
		String exportDirPath = System.getProperty("catalina.base") + "//temp//visitors-confirmation-details";
		File exportDir = new File(exportDirPath);

		if (!exportDir.exists()) {
			exportDir.mkdir();
		}
		return exportDir;
	}

	public static File createPDFFile(String fileName) {
		File reportFile = null;
		File exportDir = getExportDirectory();
		StringBuffer reportFileName = new StringBuffer(exportDir.getAbsolutePath()).append("//").append(fileName).append(".pdf");
		reportFile = new File(reportFileName.toString());

		return reportFile;
	}

	public static void generatePDF(String content, File pdfFile) {
		Document document = null;
		PdfWriter pdfWriter = null;
		try {
			OutputStream file = new FileOutputStream(pdfFile);
			document = new Document();
			Rectangle rect = new Rectangle(700, 980);
			document.setPageSize(rect);
			pdfWriter = PdfWriter.getInstance(document, file);
			document.open();
			/*
			 * img.scaleToFit(1700, 1000); img.setAbsolutePosition(0, 0);
			 * ImageBackgroundHelper pageEvent = new ImageBackgroundHelper(img);
			 * pdfWriter.setPageEvent(pageEvent);
			 */
			InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
			XMLWorkerHelper.getInstance().parseXHtml(pdfWriter, document, is, Charset.forName("UTF-8"));
			document.close();
			file.close();
		} catch (Exception e) {
			/* if (_log.isDebugEnabled()) { */
				_log.error(e, e);
			/* } */

		} finally {
			if (document != null && document.isOpen()) {
				document.close();
			}
			if (pdfWriter != null) {
				pdfWriter.close();
			}
		}
	}

	public static Map<String, Object> replacePdfVariables(ResourceRequest resourceRequest, long visitorInfoId)
			throws PortalException {
		Map<String, Object> input = new HashMap<String, Object>();
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Calendar cal = Calendar.getInstance();
			/*
			 * cal.setTime(profile.getDateofissue()); String dateOfIssue =
			 * cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" +
			 * cal.get(Calendar.YEAR); cal.setTime(profile.getDateOfBirth()); String dob =
			 * cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" +
			 * cal.get(Calendar.YEAR); cal.setTime(profile.getDateOfExpire());
			 */
			String doe = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR);
			/*
			 * input.put("visitor", visitor); input.put("profile", profile);
			 * input.put("itinerary", itinerary); input.put("hotelsInfo", hotelsInfo);
			 * input.put("dateOfIssue", dateOfIssue); input.put("dob", dob);
			 * input.put("doe", doe); input.put("dateFormat", dateFormat);
			 * input.put("imgUrl",
			 * "https://ifjas.in/documents/37438/0/IFJSLOGO16.png/b490d712-244c-82ab-1ca9-6828e598ab59?t=1654078244228"
			 * );
			 */
		} catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.error(e, e);
			}
		}

		return input;
	}


}
