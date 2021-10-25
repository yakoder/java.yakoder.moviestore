// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDefinition;

@Entity(name = "adjustment_requestors")
public class AdjustmentRequestor extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6731264897958780644L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adj_req_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "adj_req_name", nullable = false, length = 100)
	private String name;
	@Column(name = "adj_req_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "adjustmentRequestors")
	private Set<OrderAdjustment> orderAdjustments;

	/** Default constructor. */
	public AdjustmentRequestor() {
		super();
	}

	/**
	 * Access method for orderAdjustments.
	 *
	 * @return the current value of orderAdjustments
	 */
	public Set<OrderAdjustment> getOrderAdjustments() {
		return orderAdjustments;
	}

	/**
	 * Setter method for orderAdjustments.
	 *
	 * @param aOrderAdjustments the new value for orderAdjustments
	 */
	public void setOrderAdjustments(Set<OrderAdjustment> aOrderAdjustments) {
		orderAdjustments = aOrderAdjustments;
	}

	/**
	 * Compares the key for this instance with another AdjustmentRequestors.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class AdjustmentRequestors and
	 *         the key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdjustmentRequestor)) {
			return false;
		}
		AdjustmentRequestor that = (AdjustmentRequestor) other;
		if (this.getId() != that.getId()) {
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
		if (!(other instanceof AdjustmentRequestor))
			return false;
		return this.equalKeys(other) && ((AdjustmentRequestor) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[AdjustmentRequestors |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
