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

@Entity(name = "price_override_reasons")
public class PriceOverrideReason extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1768021629361802686L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "override_reason_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "override_reason_name", nullable = false, length = 100)
	private String name;
	@Column(name = "override_reason_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "priceOverrideReasons")
	private Set<StoreInventoryHistory> storeInventoryHistory;

	/** Default constructor. */
	public PriceOverrideReason() {
		super();
	}

	/**
	 * Access method for storeInventoryHistory.
	 *
	 * @return the current value of storeInventoryHistory
	 */
	public Set<StoreInventoryHistory> getStoreInventoryHistory() {
		return storeInventoryHistory;
	}

	/**
	 * Setter method for storeInventoryHistory.
	 *
	 * @param aStoreInventoryHistory the new value for storeInventoryHistory
	 */
	public void setStoreInventoryHistory(Set<StoreInventoryHistory> aStoreInventoryHistory) {
		storeInventoryHistory = aStoreInventoryHistory;
	}

	/**
	 * Compares the key for this instance with another PriceOverrideReasons.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class PriceOverrideReasons and
	 *         the key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PriceOverrideReason)) {
			return false;
		}
		PriceOverrideReason that = (PriceOverrideReason) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another PriceOverrideReasons.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof PriceOverrideReason))
			return false;
		return this.equalKeys(other) && ((PriceOverrideReason) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[PriceOverrideReasons |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
