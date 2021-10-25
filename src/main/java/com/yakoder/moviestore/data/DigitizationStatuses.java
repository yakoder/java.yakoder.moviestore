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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="digitization_statuses")
public class DigitizationStatuses implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8892184318557691179L;

	/** Primary key. */
    protected static final String PK = "digitizationStatusId";

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
    @Column(name="digit_stat_id", unique=true, nullable=false, precision=10)
    private int digitizationStatusId;
    @Column(name="digit_stat_name", nullable=false, length=100)
    private String digitizationStatusName;
    @Column(name="digit_stat_desc", length=255)
    private String digitizationStatusDesc;
    @OneToMany(mappedBy="digitizationStatuses")
    private Set<InventoryDigitization> inventoryDigitization;

    /** Default constructor. */
    public DigitizationStatuses() {
        super();
    }

    /**
     * Access method for digitizationStatusId.
     *
     * @return the current value of digitizationStatusId
     */
    public int getDigitizationStatusId() {
        return digitizationStatusId;
    }

    /**
     * Setter method for digitizationStatusId.
     *
     * @param aDigitizationStatusId the new value for digitizationStatusId
     */
    public void setDigitizationStatusId(int aDigitizationStatusId) {
        digitizationStatusId = aDigitizationStatusId;
    }

    /**
     * Access method for digitizationStatusName.
     *
     * @return the current value of digitizationStatusName
     */
    public String getDigitizationStatusName() {
        return digitizationStatusName;
    }

    /**
     * Setter method for digitizationStatusName.
     *
     * @param aDigitizationStatusName the new value for digitizationStatusName
     */
    public void setDigitizationStatusName(String aDigitizationStatusName) {
        digitizationStatusName = aDigitizationStatusName;
    }

    /**
     * Access method for digitizationStatusDesc.
     *
     * @return the current value of digitizationStatusDesc
     */
    public String getDigitizationStatusDesc() {
        return digitizationStatusDesc;
    }

    /**
     * Setter method for digitizationStatusDesc.
     *
     * @param aDigitizationStatusDesc the new value for digitizationStatusDesc
     */
    public void setDigitizationStatusDesc(String aDigitizationStatusDesc) {
        digitizationStatusDesc = aDigitizationStatusDesc;
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
     * Compares the key for this instance with another DigitizationStatuses.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DigitizationStatuses and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DigitizationStatuses)) {
            return false;
        }
        DigitizationStatuses that = (DigitizationStatuses) other;
        if (this.getDigitizationStatusId() != that.getDigitizationStatusId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DigitizationStatuses.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DigitizationStatuses)) return false;
        return this.equalKeys(other) && ((DigitizationStatuses)other).equalKeys(this);
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
        i = getDigitizationStatusId();
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
        StringBuffer sb = new StringBuffer("[DigitizationStatuses |");
        sb.append(" digitizationStatusId=").append(getDigitizationStatusId());
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
        ret.put("digitizationStatusId", Integer.valueOf(getDigitizationStatusId()));
        return ret;
    }

}
