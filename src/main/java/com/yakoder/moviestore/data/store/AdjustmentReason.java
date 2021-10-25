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

@Entity(name = "adjustment_reasons")
public class AdjustmentReason extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 504690066534599794L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "adj_rsn_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "adj_rsn_name", nullable = false, length = 100)
	private String name;
	@Column(name = "adj_rsn_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "adjustmentReasons")
	private Set<AdjustmentMovie> adjustmentMovies;

	/** Default constructor. */
	public AdjustmentReason() {
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
	 * Compares the key for this instance with another AdjustmentReasons.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class AdjustmentReasons and the
	 *         key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdjustmentReason)) {
			return false;
		}
		AdjustmentReason that = (AdjustmentReason) other;
		if (this.getId() != that.getId()) {
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
		if (!(other instanceof AdjustmentReason))
			return false;
		return this.equalKeys(other) && ((AdjustmentReason) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[AdjustmentReasons |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
