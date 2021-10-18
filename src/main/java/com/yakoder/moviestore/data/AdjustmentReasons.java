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
    protected static final String PK = "adjRsnId";

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
    private int adjRsnId;
    @Column(name="adj_rsn_name", nullable=false, length=100)
    private String adjRsnName;
    @Column(name="adj_rsn_desc", length=255)
    private String adjRsnDesc;
    @OneToMany(mappedBy="adjustmentReasons")
    private Set<AdjustmentMovies> adjustmentMovies;

    /** Default constructor. */
    public AdjustmentReasons() {
        super();
    }

    /**
     * Access method for adjRsnId.
     *
     * @return the current value of adjRsnId
     */
    public int getAdjRsnId() {
        return adjRsnId;
    }

    /**
     * Setter method for adjRsnId.
     *
     * @param aAdjRsnId the new value for adjRsnId
     */
    public void setAdjRsnId(int aAdjRsnId) {
        adjRsnId = aAdjRsnId;
    }

    /**
     * Access method for adjRsnName.
     *
     * @return the current value of adjRsnName
     */
    public String getAdjRsnName() {
        return adjRsnName;
    }

    /**
     * Setter method for adjRsnName.
     *
     * @param aAdjRsnName the new value for adjRsnName
     */
    public void setAdjRsnName(String aAdjRsnName) {
        adjRsnName = aAdjRsnName;
    }

    /**
     * Access method for adjRsnDesc.
     *
     * @return the current value of adjRsnDesc
     */
    public String getAdjRsnDesc() {
        return adjRsnDesc;
    }

    /**
     * Setter method for adjRsnDesc.
     *
     * @param aAdjRsnDesc the new value for adjRsnDesc
     */
    public void setAdjRsnDesc(String aAdjRsnDesc) {
        adjRsnDesc = aAdjRsnDesc;
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
        if (this.getAdjRsnId() != that.getAdjRsnId()) {
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
        i = getAdjRsnId();
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
        sb.append(" adjRsnId=").append(getAdjRsnId());
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
        ret.put("adjRsnId", Integer.valueOf(getAdjRsnId()));
        return ret;
    }

}
