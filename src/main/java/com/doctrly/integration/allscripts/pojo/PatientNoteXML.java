package com.doctrly.integration.allscripts.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;


@Data
@JacksonXmlRootElement(localName = "PatientNote", namespace = "")
public class PatientNoteXML {

    @JacksonXmlProperty(localName = "Text", namespace = "")
    private String text;

    @JacksonXmlProperty(localName = "Subject", namespace = "")
    private String subject;

    @JacksonXmlProperty(localName = "NoteTypeID", namespace = "")
    private Long noteTypeID;

    @JacksonXmlProperty(localName = "ExpDate", namespace = "")
    private String expDate;

}
