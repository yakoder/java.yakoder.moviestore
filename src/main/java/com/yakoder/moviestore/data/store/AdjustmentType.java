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

@Entity(name = "adjustment_types")
public class AdjustmentType extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6318100857952508664L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adj_type_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "adj_type_name", nullable = false, length = 100)
	private String name;
	@Column(name = "adj_type_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "adjustmentTypes")
	private Set<AdjustmentMovie> adjustmentMovies;
	@OneToMany(mappedBy = "adjustmentTypes")
	private Set<OrderAdjustment> orderAdjustments;

	/** Default constructor. */
	public AdjustmentType() {
		super();
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
	 * Compares the key for this instance with another AdjustmentTypes.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class AdjustmentTypes and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdjustmentType)) {
			return false;
		}
		AdjustmentType that = (AdjustmentType) other;
		if (this.getId() != that.getId()) {
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
		if (!(other instanceof AdjustmentType))
			return false;
		return this.equalKeys(other) && ((AdjustmentType) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[AdjustmentTypes |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
