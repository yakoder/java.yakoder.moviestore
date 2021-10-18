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

@Entity(name="adjustment_types")
public class AdjustmentTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6318100857952508664L;

	/** Primary key. */
    protected static final String PK = "adjTypeId";

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
    @Column(name="adj_type_id", unique=true, nullable=false, precision=10)
    private int adjTypeId;
    @Column(name="adj_type_name", nullable=false, length=100)
    private String adjTypeName;
    @Column(name="adj_type_desc", length=255)
    private String adjTypeDesc;
    @OneToMany(mappedBy="adjustmentTypes")
    private Set<AdjustmentMovies> adjustmentMovies;
    @OneToMany(mappedBy="adjustmentTypes")
    private Set<OrderAdjustments> orderAdjustments;

    /** Default constructor. */
    public AdjustmentTypes() {
        super();
    }

    /**
     * Access method for adjTypeId.
     *
     * @return the current value of adjTypeId
     */
    public int getAdjTypeId() {
        return adjTypeId;
    }

    /**
     * Setter method for adjTypeId.
     *
     * @param aAdjTypeId the new value for adjTypeId
     */
    public void setAdjTypeId(int aAdjTypeId) {
        adjTypeId = aAdjTypeId;
    }

    /**
     * Access method for adjTypeName.
     *
     * @return the current value of adjTypeName
     */
    public String getAdjTypeName() {
        return adjTypeName;
    }

    /**
     * Setter method for adjTypeName.
     *
     * @param aAdjTypeName the new value for adjTypeName
     */
    public void setAdjTypeName(String aAdjTypeName) {
        adjTypeName = aAdjTypeName;
    }

    /**
     * Access method for adjTypeDesc.
     *
     * @return the current value of adjTypeDesc
     */
    public String getAdjTypeDesc() {
        return adjTypeDesc;
    }

    /**
     * Setter method for adjTypeDesc.
     *
     * @param aAdjTypeDesc the new value for adjTypeDesc
     */
    public void setAdjTypeDesc(String aAdjTypeDesc) {
        adjTypeDesc = aAdjTypeDesc;
    }

    /**
     * Access method for adjustmentMovies.
     *
     * @return the current value of adjustmentMovies
     */
    public Set<AdjustmentMovies> getAdjustmentMovies() {
        return adjustmentMovies;
    }

    /**
     * Setter method for adjustmentMovies.
     *
     * @param aAdjustmentMovies the new value for adjustmentMovies
     */
    public void setAdjustmentMovies(Set<AdjustmentMovies> aAdjustmentMovies) {
        adjustmentMovies = aAdjustmentMovies;
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
     * Compares the key for this instance with another AdjustmentTypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AdjustmentTypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AdjustmentTypes)) {
            return false;
        }
        AdjustmentTypes that = (AdjustmentTypes) other;
        if (this.getAdjTypeId() != that.getAdjTypeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AdjustmentTypes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AdjustmentTypes)) return false;
        return this.equalKeys(other) && ((AdjustmentTypes)other).equalKeys(this);
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
        i = getAdjTypeId();
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
        StringBuffer sb = new StringBuffer("[AdjustmentTypes |");
        sb.append(" adjTypeId=").append(getAdjTypeId());
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
        ret.put("adjTypeId", Integer.valueOf(getAdjTypeId()));
        return ret;
    }

}
