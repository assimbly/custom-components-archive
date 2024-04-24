package org.assimbly.aleris.certificate;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
public class MechanicalProperty {
    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private String code;

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private String description;

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private String value;

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private String unit;

    // Required by JAXB for unmarshalling
    @SuppressWarnings("unused")
    protected MechanicalProperty() {}

    public MechanicalProperty(String code, String description, String value, String unit) {
        this.code = code;
        this.description = description;
        this.value = value;
        this.unit = unit;
    }

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(obj, this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
    }
}
