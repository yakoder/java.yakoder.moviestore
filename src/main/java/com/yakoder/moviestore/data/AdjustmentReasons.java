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

@Entity(name="adjustment_reasons")
public class AdjustmentReasons implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 504690066534599794L;

	/** Primary key. */
    protected static final String PK = "adjustmentReasonId";

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
    @Column(name="adj_rsn_id", unique=true, nullable=false, precision=10)
    private int adjustmentReasonId;
    @Column(name="adj_rsn_name", nullable=false, length=100)
    private String adjustmentReasonName;
    @Column(name="adj_rsn_desc", length=255)
    private String adjustmentReasonDesc;
    @OneToMany(mappedBy="adjustmentReasons")
    private Set<AdjustmentMovies> adjustmentMovies;

    /** Default constructor. */
    public AdjustmentReasons() {
        super();
    }

    /**
     * Access method for adjustmentReasonId.
     *
     * @return the current value of adjustmentReasonId
     */
    public int getAdjustmentReasonId() {
        return adjustmentReasonId;
    }

    /**
     * Setter method for adjustmentReasonId.
     *
     * @param aAdjustmentReasonId the new value for adjustmentReasonId
     */
    public void setAdjustmentReasonId(int aAdjustmentReasonId) {
        adjustmentReasonId = aAdjustmentReasonId;
    }

    /**
     * Access method for adjustmentReasonName.
     *
     * @return the current value of adjustmentReasonName
     */
    public String getAdjustmentReasonName() {
        return adjustmentReasonName;
    }

    /**
     * Setter method for adjustmentReasonName.
     *
     * @param aAdjustmentReasonName the new value for adjustmentReasonName
     */
    public void setAdjustmentReasonName(String aAdjustmentReasonName) {
        adjustmentReasonName = aAdjustmentReasonName;
    }

    /**
     * Access method for adjustmentReasonDesc.
     *
     * @return the current value of adjustmentReasonDesc
     */
    public String getAdjustmentReasonDesc() {
        return adjustmentReasonDesc;
    }

    /**
     * Setter method for adjustmentReasonDesc.
     *
     * @param aAdjustmentReasonDesc the new value for adjustmentReasonDesc
     */
    public void setAdjustmentReasonDesc(String aAdjustmentReasonDesc) {
        adjustmentReasonDesc = aAdjustmentReasonDesc;
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
     * Compares the key for this instance with another AdjustmentReasons.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AdjustmentReasons and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AdjustmentReasons)) {
            return false;
        }
        AdjustmentReasons that = (AdjustmentReasons) other;
        if (this.getAdjustmentReasonId() != that.getAdjustmentReasonId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AdjustmentReasons.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AdjustmentReasons)) return false;
        return this.equalKeys(other) && ((AdjustmentReasons)other).equalKeys(this);
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
        i = getAdjustmentReasonId();
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
        StringBuffer sb = new StringBuffer("[AdjustmentReasons |");
        sb.append(" adjustmentReasonId=").append(getAdjustmentReasonId());
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
        ret.put("adjustmentReasonId", Integer.valueOf(getAdjustmentReasonId()));
        return ret;
    }

}
