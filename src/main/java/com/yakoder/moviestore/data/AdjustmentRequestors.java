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

@Entity(name="adjustment_requestors")
public class AdjustmentRequestors implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6731264897958780644L;

	/** Primary key. */
    protected static final String PK = "adjustmentRequestorId";

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
    @Column(name="adj_req_id", unique=true, nullable=false, precision=10)
    private int adjustmentRequestorId;
    @Column(name="adj_req_name", nullable=false, length=100)
    private String adjustmentRequestorName;
    @Column(name="adj_req_desc", length=255)
    private String adjustmentRequestorDesc;
    @OneToMany(mappedBy="adjustmentRequestors")
    private Set<OrderAdjustments> orderAdjustments;

    /** Default constructor. */
    public AdjustmentRequestors() {
        super();
    }

    /**
     * Access method for adjustmentRequestorId.
     *
     * @return the current value of adjustmentRequestorId
     */
    public int getAdjustmentRequestorId() {
        return adjustmentRequestorId;
    }

    /**
     * Setter method for adjustmentRequestorId.
     *
     * @param aAdjustmentRequestorId the new value for adjustmentRequestorId
     */
    public void setAdjustmentRequestorId(int aAdjustmentRequestorId) {
        adjustmentRequestorId = aAdjustmentRequestorId;
    }

    /**
     * Access method for adjustmentRequestorName.
     *
     * @return the current value of adjustmentRequestorName
     */
    public String getAdjustmentRequestorName() {
        return adjustmentRequestorName;
    }

    /**
     * Setter method for adjustmentRequestorName.
     *
     * @param aAdjustmentRequestorName the new value for adjustmentRequestorName
     */
    public void setAdjustmentRequestorName(String aAdjustmentRequestorName) {
        adjustmentRequestorName = aAdjustmentRequestorName;
    }

    /**
     * Access method for adjustmentRequestorDesc.
     *
     * @return the current value of adjustmentRequestorDesc
     */
    public String getAdjustmentRequestorDesc() {
        return adjustmentRequestorDesc;
    }

    /**
     * Setter method for adjustmentRequestorDesc.
     *
     * @param aAdjustmentRequestorDesc the new value for adjustmentRequestorDesc
     */
    public void setAdjustmentRequestorDesc(String aAdjustmentRequestorDesc) {
        adjustmentRequestorDesc = aAdjustmentRequestorDesc;
    }

    /**
     * Access method for orderAdjustments.
     *
     * @return the current value of orderAdjustments
     */
    public Set<OrderAdjustments> getOrderAdjustments() {
        return orderAdjustments;
    }

    /**
     * Setter method for orderAdjustments.
     *
     * @param aOrderAdjustments the new value for orderAdjustments
     */
    public void setOrderAdjustments(Set<OrderAdjustments> aOrderAdjustments) {
        orderAdjustments = aOrderAdjustments;
    }

    /**
     * Compares the key for this instance with another AdjustmentRequestors.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AdjustmentRequestors and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AdjustmentRequestors)) {
            return false;
        }
        AdjustmentRequestors that = (AdjustmentRequestors) other;
        if (this.getAdjustmentRequestorId() != that.getAdjustmentRequestorId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AdjustmentRequestors.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AdjustmentRequestors)) return false;
        return this.equalKeys(other) && ((AdjustmentRequestors)other).equalKeys(this);
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
        i = getAdjustmentRequestorId();
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
        StringBuffer sb = new StringBuffer("[AdjustmentRequestors |");
        sb.append(" adjustmentRequestorId=").append(getAdjustmentRequestorId());
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
        ret.put("adjustmentRequestorId", Integer.valueOf(getAdjustmentRequestorId()));
        return ret;
    }

}
