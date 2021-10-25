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

@Entity(name = "store_bonuses")
public class StoreBonus extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9222441630201517051L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_bonus_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "store_bonus_name", nullable = false, length = 100)
	private String name;
	@Column(name = "store_bonus_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "storeBonuses")
	private Set<StoreInventoryHistory> storeInventoryHistory;

	/** Default constructor. */
	public StoreBonus() {
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
	 * Compares the key for this instance with another StoreBonuses.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class StoreBonuses and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StoreBonus)) {
			return false;
		}
		StoreBonus that = (StoreBonus) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another StoreBonuses.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof StoreBonus))
			return false;
		return this.equalKeys(other) && ((StoreBonus) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[StoreBonuses |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
