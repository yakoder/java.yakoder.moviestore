// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="adjustment_movies")
public class AdjustmentMovie implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2092779829559405009L;

	/** Primary key. */
    protected static final String PK = "adjustmentMovieId";

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
    @Column(name="adj_movie_id", unique=true, nullable=false, precision=10)
    private int adjustmentMovieId;
    @Column(name="adj_amount", precision=15, scale=2)
    private BigDecimal adjustmentAmount;
    @ManyToOne(optional=false)
    @JoinColumn(name="adj_rsn_id", nullable=false)
    private AdjustmentReason adjustmentReasons;
    @ManyToOne(optional=false)
    @JoinColumn(name="adj_type_id", nullable=false)
    private AdjustmentType adjustmentTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_adj_id", nullable=false)
    private OrderAdjustment orderAdjustments;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_movie_id", nullable=false)
    private OrderMovie orderMovies;

    /** Default constructor. */
    public AdjustmentMovie() {
        super();
    }

    /**
     * Access method for adjustmentMovieId.
     *
     * @return the current value of adjustmentMovieId
     */
    public int getAdjustmentMovieId() {
        return adjustmentMovieId;
    }

    /**
     * Setter method for adjustmentMovieId.
     *
     * @param aAdjustmentMovieId the new value for adjustmentMovieId
     */
    public void setAdjustmentMovieId(int aAdjustmentMovieId) {
        adjustmentMovieId = aAdjustmentMovieId;
    }

    /**
     * Access method for adjustmentAmount.
     *
     * @return the current value of adjustmentAmount
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Setter method for adjustmentAmount.
     *
     * @param aAdjustmentAmount the new value for adjustmentAmount
     */
    public void setAdjustmentAmount(BigDecimal aAdjustmentAmount) {
        adjustmentAmount = aAdjustmentAmount;
    }

    /**
     * Access method for adjustmentReasons.
     *
     * @return the current value of adjustmentReasons
     */
    public AdjustmentReason getAdjustmentReasons() {
        return adjustmentReasons;
    }

    /**
     * Setter method for adjustmentReasons.
     *
     * @param aAdjustmentReasons the new value for adjustmentReasons
     */
    public void setAdjustmentReasons(AdjustmentReason aAdjustmentReasons) {
        adjustmentReasons = aAdjustmentReasons;
    }

    /**
     * Access method for adjustmentTypes.
     *
     * @return the current value of adjustmentTypes
     */
    public AdjustmentType getAdjustmentTypes() {
        return adjustmentTypes;
    }

    /**
     * Setter method for adjustmentTypes.
     *
     * @param aAdjustmentTypes the new value for adjustmentTypes
     */
    public void setAdjustmentTypes(AdjustmentType aAdjustmentTypes) {
        adjustmentTypes = aAdjustmentTypes;
    }

    /**
     * Access method for orderAdjustments.
     *
     * @return the current value of orderAdjustments
     */
    public OrderAdjustment getOrderAdjustments() {
        return orderAdjustments;
    }

    /**
     * Setter method for orderAdjustments.
     *
     * @param aOrderAdjustments the new value for orderAdjustments
     */
    public void setOrderAdjustments(OrderAdjustment aOrderAdjustments) {
        orderAdjustments = aOrderAdjustments;
    }

    /**
     * Access method for orderMovies.
     *
     * @return the current value of orderMovies
     */
    public OrderMovie getOrderMovies() {
        return orderMovies;
    }

    /**
     * Setter method for orderMovies.
     *
     * @param aOrderMovies the new value for orderMovies
     */
    public void setOrderMovies(OrderMovie aOrderMovies) {
        orderMovies = aOrderMovies;
    }

    /**
     * Compares the key for this instance with another AdjustmentMovies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AdjustmentMovies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AdjustmentMovie)) {
            return false;
        }
        AdjustmentMovie that = (AdjustmentMovie) other;
        if (this.getAdjustmentMovieId() != that.getAdjustmentMovieId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AdjustmentMovies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AdjustmentMovie)) return false;
        return this.equalKeys(other) && ((AdjustmentMovie)other).equalKeys(this);
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
        i = getAdjustmentMovieId();
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
        StringBuffer sb = new StringBuffer("[AdjustmentMovies |");
        sb.append(" adjustmentMovieId=").append(getAdjustmentMovieId());
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
        ret.put("adjustmentMovieId", Integer.valueOf(getAdjustmentMovieId()));
        return ret;
    }

}
