// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDefinition;

@Entity
@Table(name = "digitization_formats", indexes = {
		@Index(name = "digitization_formats_digit_fmt_name_IX", columnList = "digit_fmt_name", unique = true) })
public class DigitizationFormat extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7192924279972575912L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "digit_fmt_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "digit_fmt_name", unique = true, nullable = false, length = 100)
	private String name;
	@Column(name = "digit_fmt_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "digitizationFormats")
	private Set<InventoryDigitization> inventoryDigitization;

	/** Default constructor. */
	public DigitizationFormat() {
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
	 * Compares the key for this instance with another DigitizationFormats.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class DigitizationFormats and the
	 *         key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DigitizationFormat)) {
			return false;
		}
		DigitizationFormat that = (DigitizationFormat) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another DigitizationFormats.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof DigitizationFormat))
			return false;
		return this.equalKeys(other) && ((DigitizationFormat) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[DigitizationFormats |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
