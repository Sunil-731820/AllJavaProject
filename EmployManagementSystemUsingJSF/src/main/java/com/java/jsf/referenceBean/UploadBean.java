package com.java.jsf.referenceBean;

import java.io.IOException;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;

import org.primefaces.model.UploadedFile;

@ManagedBean
@RequestScoped
public class UploadBean {

	 private int filesUploaded = 0;

	    //javax.servlet.http.Part (Servlet 3.0 API)
	    private Part file;
	    private String fileContent;

	    /**
	     * Just prints out file content
	     */
	    public void upload() {
	        try {
	            fileContent = new Scanner(file.getInputStream())
	                    .useDelimiter("\\A").next();
	            System.out.println(fileContent + " uploaded");
	            filesUploaded++;
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public int getFilesUploaded() {
	        return filesUploaded;
	    }

	    public Part getFile() {
	        return file;
	    }

	    public void setFile(Part file) {
	        this.file = file;
	    }

}