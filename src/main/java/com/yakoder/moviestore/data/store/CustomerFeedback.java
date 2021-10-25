// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.time.LocalDate;
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

@Entity(name="customer_feedback")
public class CustomerFeedback implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7653870443106519829L;

	/** Primary key. */
    protected static final String PK = "customerFeedbackId";

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
    @Column(name="cust_fb_id", unique=true, nullable=false, precision=10)
    private int customerFeedbackId;
    @Column(name="cust_fb_rating", precision=10)
    private int customerFeedbackRating;
    @Column(name="rating_max_value", precision=10)
    private int ratingMaxValue;
    @Column(name="cust_fb_comments", length=100)
    private String customerFeedbackComments;
    @Column(name="cust_fb_date")
    private LocalDate customerFeedbackDate;
    @ManyToOne
    @JoinColumn(name="order_id")
    private Order orders;

    /** Default constructor. */
    public CustomerFeedback() {
        super();
    }

    /**
     * Access method for customerFeedbackId.
     *
     * @return the current value of customerFeedbackId
     */
    public int getCustomerFeedbackId() {
        return customerFeedbackId;
    }

    /**
     * Setter method for customerFeedbackId.
     *
     * @param aCustomerFeedbackId the new value for customerFeedbackId
     */
    public void setCustomerFeedbackId(int aCustomerFeedbackId) {
        customerFeedbackId = aCustomerFeedbackId;
    }

    /**
     * Access method for customerFeedbackRating.
     *
     * @return the current value of customerFeedbackRating
     */
    public int getCustomerFeedbackRating() {
        return customerFeedbackRating;
    }

    /**
     * Setter method for customerFeedbackRating.
     *
     * @param aCustomerFeedbackRating the new value for customerFeedbackRating
     */
    public void setCustomerFeedbackRating(int aCustomerFeedbackRating) {
        customerFeedbackRating = aCustomerFeedbackRating;
    }

    /**
     * Access method for ratingMaxValue.
     *
     * @return the current value of ratingMaxValue
     */
    public int getRatingMaxValue() {
        return ratingMaxValue;
    }

    /**
     * Setter method for ratingMaxValue.
     *
     * @param aRatingMaxValue the new value for ratingMaxValue
     */
    public void setRatingMaxValue(int aRatingMaxValue) {
        ratingMaxValue = aRatingMaxValue;
    }

    /**
     * Access method for customerFeedbackComments.
     *
     * @return the current value of customerFeedbackComments
     */
    public String getCustomerFeedbackComments() {
        return customerFeedbackComments;
    }

    /**
     * Setter method for customerFeedbackComments.
     *
     * @param aCustomerFeedbackComments the new value for customerFeedbackComments
     */
    public void setCustomerFeedbackComments(String aCustomerFeedbackComments) {
        customerFeedbackComments = aCustomerFeedbackComments;
    }

    /**
     * Access method for customerFeedbackDate.
     *
     * @return the current value of customerFeedbackDate
     */
    public LocalDate getCustomerFeedbackDate() {
        return customerFeedbackDate;
    }

    /**
     * Setter method for customerFeedbackDate.
     *
     * @param aCustomerFeedbackDate the new value for customerFeedbackDate
     */
    public void setCustomerFeedbackDate(LocalDate aCustomerFeedbackDate) {
        customerFeedbackDate = aCustomerFeedbackDate;
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
     * Compares the key for this instance with another CustomerFeedback.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CustomerFeedback and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CustomerFeedback)) {
            return false;
        }
        CustomerFeedback that = (CustomerFeedback) other;
        if (this.getCustomerFeedbackId() != that.getCustomerFeedbackId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CustomerFeedback.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CustomerFeedback)) return false;
        return this.equalKeys(other) && ((CustomerFeedback)other).equalKeys(this);
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
        i = getCustomerFeedbackId();
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
        StringBuffer sb = new StringBuffer("[CustomerFeedback |");
        sb.append(" customerFeedbackId=").append(getCustomerFeedbackId());
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
        ret.put("customerFeedbackId", Integer.valueOf(getCustomerFeedbackId()));
        return ret;
    }

}
