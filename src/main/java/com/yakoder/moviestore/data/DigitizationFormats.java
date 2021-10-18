// Generated with g9.

package com.yakoder.moviestore.data;

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
    protected static final String PK = "digitFmtId";

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
    private int digitFmtId;
    @Column(name="digit_fmt_name", unique=true, nullable=false, length=100)
    private String digitFmtName;
    @Column(name="digit_fmt_desc", length=255)
    private String digitFmtDesc;
    @OneToMany(mappedBy="digitizationFormats")
    private Set<InvDigitization> invDigitization;

    /** Default constructor. */
    public DigitizationFormats() {
        super();
    }

    /**
     * Access method for digitFmtId.
     *
     * @return the current value of digitFmtId
     */
    public int getDigitFmtId() {
        return digitFmtId;
    }

    /**
     * Setter method for digitFmtId.
     *
     * @param aDigitFmtId the new value for digitFmtId
     */
    public void setDigitFmtId(int aDigitFmtId) {
        digitFmtId = aDigitFmtId;
    }

    /**
     * Access method for digitFmtName.
     *
     * @return the current value of digitFmtName
     */
    public String getDigitFmtName() {
        return digitFmtName;
    }

    /**
     * Setter method for digitFmtName.
     *
     * @param aDigitFmtName the new value for digitFmtName
     */
    public void setDigitFmtName(String aDigitFmtName) {
        digitFmtName = aDigitFmtName;
    }

    /**
     * Access method for digitFmtDesc.
     *
     * @return the current value of digitFmtDesc
     */
    public String getDigitFmtDesc() {
        return digitFmtDesc;
    }

    /**
     * Setter method for digitFmtDesc.
     *
     * @param aDigitFmtDesc the new value for digitFmtDesc
     */
    public void setDigitFmtDesc(String aDigitFmtDesc) {
        digitFmtDesc = aDigitFmtDesc;
    }

    /**
     * Access method for invDigitization.
     *
     * @return the current value of invDigitization
     */
    public Set<InvDigitization> getInvDigitization() {
        return invDigitization;
    }

    /**
     * Setter method for invDigitization.
     *
     * @param aInvDigitization the new value for invDigitization
     */
    public void setInvDigitization(Set<InvDigitization> aInvDigitization) {
        invDigitization = aInvDigitization;
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
        if (this.getDigitFmtId() != that.getDigitFmtId()) {
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
        i = getDigitFmtId();
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
        sb.append(" digitFmtId=").append(getDigitFmtId());
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
        ret.put("digitFmtId", Integer.valueOf(getDigitFmtId()));
        return ret;
    }

}
