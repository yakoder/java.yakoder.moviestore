// Generated with g9.

package com.yakoder.moviestore.data.store;

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
public class OrderAdjustment implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 9157672553090792244L;

	/** Primary key. */
    protected static final String PK = "orderAdjustmentId";

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
    private int orderAdjustmentId;
    @Column(name="adj_date")
    private LocalDate adjustmentDate;
    @Column(name="adj_notes", length=255)
    private String adjustmentNotes;
    @Column(name="adj_amount", precision=15, scale=2)
    private BigDecimal adjustmentAmount;
    @OneToMany(mappedBy="orderAdjustments")
    private Set<AdjustmentMovie> adjustmentMovies;
    @ManyToOne(optional=false)
    @JoinColumn(name="adj_req_id", nullable=false)
    private AdjustmentRequestor adjustmentRequestors;
    @ManyToOne(optional=false)
    @JoinColumn(name="adj_type_id", nullable=false)
    private AdjustmentType adjustmentTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_id", nullable=false)
    private Order orders;

    /** Default constructor. */
    public OrderAdjustment() {
        super();
    }

    /**
     * Access method for orderAdjustmentId.
     *
     * @return the current value of orderAdjustmentId
     */
    public int getOrderAdjustmentId() {
        return orderAdjustmentId;
    }

    /**
     * Setter method for orderAdjustmentId.
     *
     * @param aOrderAdjustmentId the new value for orderAdjustmentId
     */
    public void setOrderAdjustmentId(int aOrderAdjustmentId) {
        orderAdjustmentId = aOrderAdjustmentId;
    }

    /**
     * Access method for adjustmentDate.
     *
     * @return the current value of adjustmentDate
     */
    public LocalDate getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * Setter method for adjustmentDate.
     *
     * @param aAdjustmentDate the new value for adjustmentDate
     */
    public void setAdjustmentDate(LocalDate aAdjustmentDate) {
        adjustmentDate = aAdjustmentDate;
    }

    /**
     * Access method for adjustmentNotes.
     *
     * @return the current value of adjustmentNotes
     */
    public String getAdjustmentNotes() {
        return adjustmentNotes;
    }

    /**
     * Setter method for adjustmentNotes.
     *
     * @param aAdjustmentNotes the new value for adjustmentNotes
     */
    public void setAdjustmentNotes(String aAdjustmentNotes) {
        adjustmentNotes = aAdjustmentNotes;
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
     * Access method for adjustmentMovies.
     *
     * @return the current value of adjustmentMovies
     */
    public Set<AdjustmentMovie> getAdjustmentMovies() {
        return adjustmentMovies;
    }

    /**
     * Setter method for adjustmentMovies.
     *
     * @param aAdjustmentMovies the new value for adjustmentMovies
     */
    public void setAdjustmentMovies(Set<AdjustmentMovie> aAdjustmentMovies) {
        adjustmentMovies = aAdjustmentMovies;
    }

    /**
     * Access method for adjustmentRequestors.
     *
     * @return the current value of adjustmentRequestors
     */
    public AdjustmentRequestor getAdjustmentRequestors() {
        return adjustmentRequestors;
    }

    /**
     * Setter method for adjustmentRequestors.
     *
     * @param aAdjustmentRequestors the new value for adjustmentRequestors
     */
    public void setAdjustmentRequestors(AdjustmentRequestor aAdjustmentRequestors) {
        adjustmentRequestors = aAdjustmentRequestors;
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
     * Access method for orders.
     *
     * @return the current value of orders
     */
    public Order getOrders() {
        return orders;
    }

    /**
     * Setter method for orders.
     *
     * @param aOrders the new value for orders
     */
    public void setOrders(Order aOrders) {
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
        if (!(other instanceof OrderAdjustment)) {
            return false;
        }
        OrderAdjustment that = (OrderAdjustment) other;
        if (this.getOrderAdjustmentId() != that.getOrderAdjustmentId()) {
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
        if (!(other instanceof OrderAdjustment)) return false;
        return this.equalKeys(other) && ((OrderAdjustment)other).equalKeys(this);
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
        i = getOrderAdjustmentId();
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
        sb.append(" orderAdjustmentId=").append(getOrderAdjustmentId());
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
        ret.put("orderAdjustmentId", Integer.valueOf(getOrderAdjustmentId()));
        return ret;
    }

}
