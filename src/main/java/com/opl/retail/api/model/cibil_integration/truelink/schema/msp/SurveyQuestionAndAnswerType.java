
package com.opl.retail.api.model.cibil_integration.truelink.schema.msp;

import com.opl.retail.api.model.cibil_integration.truelink.schema.database.tcps.enumerations.SurveyQuestionType;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SurveyQuestionAndAnswerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurveyQuestionAndAnswerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Question" type="{com/truelink/schema/database/tcps/enumerations}SurveyQuestionType"/>
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveyQuestionAndAnswerType", propOrder = {
    "question",
    "answer"
})
public class SurveyQuestionAndAnswerType {

    @XmlElement(name = "Question", required = true)
    @XmlSchemaType(name = "string")
    protected SurveyQuestionType question;
    @XmlElement(name = "Answer", required = true)
    protected String answer;

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link SurveyQuestionType }
     *     
     */
    public SurveyQuestionType getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurveyQuestionType }
     *     
     */
    public void setQuestion(SurveyQuestionType value) {
        this.question = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

}
