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
    protected static final String PK = "adjReqId";

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
    private int adjReqId;
    @Column(name="adj_req_name", nullable=false, length=100)
    private String adjReqName;
    @Column(name="adj_req_desc", length=255)
    private String adjReqDesc;
    @OneToMany(mappedBy="adjustmentRequestors")
    private Set<OrderAdjustments> orderAdjustments;

    /** Default constructor. */
    public AdjustmentRequestors() {
        super();
    }

    /**
     * Access method for adjReqId.
     *
     * @return the current value of adjReqId
     */
    public int getAdjReqId() {
        return adjReqId;
    }

    /**
     * Setter method for adjReqId.
     *
     * @param aAdjReqId the new value for adjReqId
     */
    public void setAdjReqId(int aAdjReqId) {
        adjReqId = aAdjReqId;
    }

    /**
     * Access method for adjReqName.
     *
     * @return the current value of adjReqName
     */
    public String getAdjReqName() {
        return adjReqName;
    }

    /**
     * Setter method for adjReqName.
     *
     * @param aAdjReqName the new value for adjReqName
     */
    public void setAdjReqName(String aAdjReqName) {
        adjReqName = aAdjReqName;
    }

    /**
     * Access method for adjReqDesc.
     *
     * @return the current value of adjReqDesc
     */
    public String getAdjReqDesc() {
        return adjReqDesc;
    }

    /**
     * Setter method for adjReqDesc.
     *
     * @param aAdjReqDesc the new value for adjReqDesc
     */
    public void setAdjReqDesc(String aAdjReqDesc) {
        adjReqDesc = aAdjReqDesc;
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
        if (this.getAdjReqId() != that.getAdjReqId()) {
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
        i = getAdjReqId();
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
        sb.append(" adjReqId=").append(getAdjReqId());
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
        ret.put("adjReqId", Integer.valueOf(getAdjReqId()));
        return ret;
    }

}
