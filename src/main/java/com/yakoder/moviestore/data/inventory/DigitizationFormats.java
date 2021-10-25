// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="digitization_formats", indexes={@Index(name="digitization_formats_digit_fmt_name_IX", columnList="digit_fmt_name", unique=true)})
public class DigitizationFormats implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7192924279972575912L;

	/** Primary key. */
    protected static final String PK = "digitizationFormatId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="digit_fmt_id", unique=true, nullable=false, precision=10)
    private int digitizationFormatId;
    @Column(name="digit_fmt_name", unique=true, nullable=false, length=100)
    private String digitizationFormatName;
    @Column(name="digit_fmt_desc", length=255)
    private String digitizationFormatDesc;
    @OneToMany(mappedBy="digitizationFormats")
    private Set<InventoryDigitization> inventoryDigitization;

    /** Default constructor. */
    public DigitizationFormats() {
        super();
    }

    /**
     * Access method for digitizationFormatId.
     *
     * @return the current value of digitizationFormatId
     */
    public int getDigitizationFormatId() {
        return digitizationFormatId;
    }

    /**
     * Setter method for digitizationFormatId.
     *
     * @param aDigitizationFormatId the new value for digitizationFormatId
     */
    public void setDigitFmtId(int aDigitizationFormatId) {
        digitizationFormatId = aDigitizationFormatId;
    }

    /**
     * Access method for digitizationFormatName.
     *
     * @return the current value of digitizationFormatName
     */
    public String getDigitizationFormatName() {
        return digitizationFormatName;
    }

    /**
     * Setter method for digitizationFormatName.
     *
     * @param aDigitizationFormatName the new value for digitizationFormatName
     */
    public void setDigitizationFormatName(String aDigitizationFormatName) {
        digitizationFormatName = aDigitizationFormatName;
    }

    /**
     * Access method for digitizationFormatDesc.
     *
     * @return the current value of digitizationFormatDesc
     */
    public String getDigitizationFormatDesc() {
        return digitizationFormatDesc;
    }

    /**
     * Setter method for digitizationFormatDesc.
     *
     * @param aDigitizationFormatDesc the new value for digitizationFormatDesc
     */
    public void setDigitizationFormatDesc(String aDigitizationFormatDesc) {
        digitizationFormatDesc = aDigitizationFormatDesc;
    }

    /**
     * Access method for inventoryDigitization.
     *
     * @return the current value of inventoryDigitization
     */
    public Set<InventoryDigitization> getInventoryDigitization() {
        return inventoryDigitization;
    }

    /**
     * Setter method for inventoryDigitization.
     *
     * @param aInventoryDigitization the new value for inventoryDigitization
     */
    public void setInventoryDigitization(Set<InventoryDigitization> aInventoryDigitization) {
        inventoryDigitization = aInventoryDigitization;
    }

    /**
     * Compares the key for this instance with another DigitizationFormats.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DigitizationFormats and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DigitizationFormats)) {
            return false;
        }
        DigitizationFormats that = (DigitizationFormats) other;
        if (this.getDigitizationFormatId() != that.getDigitizationFormatId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DigitizationFormats.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DigitizationFormats)) return false;
        return this.equalKeys(other) && ((DigitizationFormats)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getDigitizationFormatId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[DigitizationFormats |");
        sb.append(" digitFmtId=").append(getDigitizationFormatId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("digitizationFormatId", Integer.valueOf(getDigitizationFormatId()));
        return ret;
    }

}
