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

@Entity(name = "supply_types")
public class SupplyType extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1080387065439911232L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supply_type_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "supply_type_name", nullable = false, length = 100)
	private String name;
	@Column(name = "supply_type_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "supplyTypes")
	private Set<ExpenseSupply> expenseSupplies;

	/** Default constructor. */
	public SupplyType() {
		super();
	}

	/**
	 * Access method for expenseSupplies.
	 *
	 * @return the current value of expenseSupplies
	 */
	public Set<ExpenseSupply> getExpenseSupplies() {
		return expenseSupplies;
	}

	/**
	 * Setter method for expenseSupplies.
	 *
	 * @param aExpenseSupplies the new value for expenseSupplies
	 */
	public void setExpenseSupplies(Set<ExpenseSupply> aExpenseSupplies) {
		expenseSupplies = aExpenseSupplies;
	}

	/**
	 * Compares the key for this instance with another SupplyTypes.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class SupplyTypes and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SupplyType)) {
			return false;
		}
		SupplyType that = (SupplyType) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another SupplyTypes.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof SupplyType))
			return false;
		return this.equalKeys(other) && ((SupplyType) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[SupplyTypes |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
