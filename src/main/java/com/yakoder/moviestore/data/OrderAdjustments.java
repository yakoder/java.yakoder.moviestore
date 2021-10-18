// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="order_adjustments")
public class OrderAdjustments implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 9157672553090792244L;

	/** Primary key. */
    protected static final String PK = "orderAdjId";

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
    @Column(name="order_adj_id", unique=true, nullable=false, precision=10)
    private int orderAdjId;
    @Column(name="adj_date")
    private LocalDate adjDate;
    @Column(name="adj_notes", length=255)
    private String adjNotes;
    @Column(name="adj_amount", precision=15, scale=2)
    private BigDecimal adjAmount;
    @OneToMany(mappedBy="orderAdjustments")
    private Set<AdjustmentMovies> adjustmentMovies;
    @ManyToOne(optional=false)
    @JoinColumn(name="adj_req_id", nullable=false)
    private AdjustmentRequestors adjustmentRequestors;
    @ManyToOne(optional=false)
    @JoinColumn(name="adj_type_id", nullable=false)
    private AdjustmentTypes adjustmentTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_id", nullable=false)
    private Orders orders;

    /** Default constructor. */
    public OrderAdjustments() {
        super();
    }

    /**
     * Access method for orderAdjId.
     *
     * @return the current value of orderAdjId
     */
    public int getOrderAdjId() {
        return orderAdjId;
    }

    /**
     * Setter method for orderAdjId.
     *
     * @param aOrderAdjId the new value for orderAdjId
     */
    public void setOrderAdjId(int aOrderAdjId) {
        orderAdjId = aOrderAdjId;
    }

    /**
     * Access method for adjDate.
     *
     * @return the current value of adjDate
     */
    public LocalDate getAdjDate() {
        return adjDate;
    }

    /**
     * Setter method for adjDate.
     *
     * @param aAdjDate the new value for adjDate
     */
    public void setAdjDate(LocalDate aAdjDate) {
        adjDate = aAdjDate;
    }

    /**
     * Access method for adjNotes.
     *
     * @return the current value of adjNotes
     */
    public String getAdjNotes() {
        return adjNotes;
    }

    /**
     * Setter method for adjNotes.
     *
     * @param aAdjNotes the new value for adjNotes
     */
    public void setAdjNotes(String aAdjNotes) {
        adjNotes = aAdjNotes;
    }

    /**
     * Access method for adjAmount.
     *
     * @return the current value of adjAmount
     */
    public BigDecimal getAdjAmount() {
        return adjAmount;
    }

    /**
     * Setter method for adjAmount.
     *
     * @param aAdjAmount the new value for adjAmount
     */
    public void setAdjAmount(BigDecimal aAdjAmount) {
        adjAmount = aAdjAmount;
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
     * Access method for adjustmentRequestors.
     *
     * @return the current value of adjustmentRequestors
     */
    public AdjustmentRequestors getAdjustmentRequestors() {
        return adjustmentRequestors;
    }

    /**
     * Setter method for adjustmentRequestors.
     *
     * @param aAdjustmentRequestors the new value for adjustmentRequestors
     */
    public void setAdjustmentRequestors(AdjustmentRequestors aAdjustmentRequestors) {
        adjustmentRequestors = aAdjustmentRequestors;
    }

    /**
     * Access method for adjustmentTypes.
     *
     * @return the current value of adjustmentTypes
     */
    public AdjustmentTypes getAdjustmentTypes() {
        return adjustmentTypes;
    }

    /**
     * Setter method for adjustmentTypes.
     *
     * @param aAdjustmentTypes the new value for adjustmentTypes
     */
    public void setAdjustmentTypes(AdjustmentTypes aAdjustmentTypes) {
        adjustmentTypes = aAdjustmentTypes;
    }

    /**
     * Access method for orders.
     *
     * @return the current value of orders
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * Setter method for orders.
     *
     * @param aOrders the new value for orders
     */
    public void setOrders(Orders aOrders) {
        orders = aOrders;
    }

    /**
     * Compares the key for this instance with another OrderAdjustments.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OrderAdjustments and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OrderAdjustments)) {
            return false;
        }
        OrderAdjustments that = (OrderAdjustments) other;
        if (this.getOrderAdjId() != that.getOrderAdjId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OrderAdjustments.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OrderAdjustments)) return false;
        return this.equalKeys(other) && ((OrderAdjustments)other).equalKeys(this);
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
        i = getOrderAdjId();
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
        StringBuffer sb = new StringBuffer("[OrderAdjustments |");
        sb.append(" orderAdjId=").append(getOrderAdjId());
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
        ret.put("orderAdjId", Integer.valueOf(getOrderAdjId()));
        return ret;
    }

}
