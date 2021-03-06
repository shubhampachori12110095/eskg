/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.07 at 01:56:59 PM PDT 
//

package org.esipfed.eskg.structures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}File" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}URL" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Format" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Caption" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "file", "url", "format", "caption", "description" })
@XmlRootElement(name = "Multimedia_Sample")
public class MultimediaSample {

  @XmlElement(name = "File")
  protected String file;
  @XmlElement(name = "URL")
  protected String url;
  @XmlElement(name = "Format")
  protected String format;
  @XmlElement(name = "Caption")
  protected String caption;
  @XmlElement(name = "Description")
  protected String description;

  /**
   * Gets the value of the file property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFile() {
    return file;
  }

  /**
   * Sets the value of the file property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setFile(String value) {
    this.file = value;
  }

  /**
   * Gets the value of the url property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getURL() {
    return url;
  }

  /**
   * Sets the value of the url property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setURL(String value) {
    this.url = value;
  }

  /**
   * Gets the value of the format property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFormat() {
    return format;
  }

  /**
   * Sets the value of the format property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setFormat(String value) {
    this.format = value;
  }

  /**
   * Gets the value of the caption property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCaption() {
    return caption;
  }

  /**
   * Sets the value of the caption property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setCaption(String value) {
    this.caption = value;
  }

  /**
   * Gets the value of the description property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the description property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setDescription(String value) {
    this.description = value;
  }

}
