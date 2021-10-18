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
    protected static final String PK = "digitStatId";

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
    private int digitStatId;
    @Column(name="digit_stat_name", nullable=false, length=100)
    private String digitStatName;
    @Column(name="digit_stat_desc", length=255)
    private String digitStatDesc;
    @OneToMany(mappedBy="digitizationStatuses")
    private Set<InvDigitization> invDigitization;

    /** Default constructor. */
    public DigitizationStatuses() {
        super();
    }

    /**
     * Access method for digitStatId.
     *
     * @return the current value of digitStatId
     */
    public int getDigitStatId() {
        return digitStatId;
    }

    /**
     * Setter method for digitStatId.
     *
     * @param aDigitStatId the new value for digitStatId
     */
    public void setDigitStatId(int aDigitStatId) {
        digitStatId = aDigitStatId;
    }

    /**
     * Access method for digitStatName.
     *
     * @return the current value of digitStatName
     */
    public String getDigitStatName() {
        return digitStatName;
    }

    /**
     * Setter method for digitStatName.
     *
     * @param aDigitStatName the new value for digitStatName
     */
    public void setDigitStatName(String aDigitStatName) {
        digitStatName = aDigitStatName;
    }

    /**
     * Access method for digitStatDesc.
     *
     * @return the current value of digitStatDesc
     */
    public String getDigitStatDesc() {
        return digitStatDesc;
    }

    /**
     * Setter method for digitStatDesc.
     *
     * @param aDigitStatDesc the new value for digitStatDesc
     */
    public void setDigitStatDesc(String aDigitStatDesc) {
        digitStatDesc = aDigitStatDesc;
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
        if (this.getDigitStatId() != that.getDigitStatId()) {
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
        i = getDigitStatId();
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
        sb.append(" digitStatId=").append(getDigitStatId());
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
        ret.put("digitStatId", Integer.valueOf(getDigitStatId()));
        return ret;
    }

}
