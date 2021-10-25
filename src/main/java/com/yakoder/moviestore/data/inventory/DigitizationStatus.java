// Generated with g9.

package com.yakoder.moviestore.data.inventory;

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

@Entity(name = "digitization_statuses")
public class DigitizationStatus extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8892184318557691179L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "digit_stat_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "digit_stat_name", nullable = false, length = 100)
	private String name;
	@Column(name = "digit_stat_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "digitizationStatuses")
	private Set<InventoryDigitization> inventoryDigitization;

	/** Default constructor. */
	public DigitizationStatus() {
		super();
	}

	/**
	 * Access method for inventoryDigitization.
	 *
	 * @return the current value of inventoryDigitization
	 */
	public Set<InventoryDigitization> getInventoryDigitization() {
		return inventoryDigitization;
	}

	/**
	 * Setter method for inventoryDigitization.
	 *
	 * @param aInventoryDigitization the new value for inventoryDigitization
	 */
	public void setInventoryDigitization(Set<InventoryDigitization> aInventoryDigitization) {
		inventoryDigitization = aInventoryDigitization;
	}

	/**
	 * Compares the key for this instance with another DigitizationStatuses.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DigitizationStatuses and
	 *         the key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DigitizationStatus)) {
			return false;
		}
		DigitizationStatus that = (DigitizationStatus) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DigitizationStatuses.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DigitizationStatus))
			return false;
		return this.equalKeys(other) && ((DigitizationStatus) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[DigitizationStatuses |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
