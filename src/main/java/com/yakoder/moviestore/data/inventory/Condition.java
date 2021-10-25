// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDataObject;
import com.yakoder.moviestore.data.store.ExpenseMovie;

@Entity(name = "conditions")
public class Condition extends SimpleDataObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8840233815483811019L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cond_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "cond_name", nullable = false, length = 100)
	private String name;
	@Column(name = "cond_value", nullable = false, precision = 10)
	private int value;
	@Column(name = "pct_retail", precision = 15, scale = 10)
	private BigDecimal percentRetail;
	@OneToMany(mappedBy = "conditions")
	private Set<ExpenseMovie> expenseMovies;
	@OneToMany(mappedBy = "conditions")
	private Set<Inventory> inventory;

	/** Default constructor. */
	public Condition() {
		super();
	}

	/**
	 * Access method for conditionName.
	 *
	 * @return the current value of conditionName
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for condName.
	 *
	 * @param aConditionName the new value for conditionName
	 */
	public void setName(String aConditionName) {
		name = aConditionName;
	}

	/**
	 * Access method for value.
	 *
	 * @return the current value of value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Setter method for value.
	 *
	 * @param aCondValue the new value for value
	 */
	public void setValue(int aValue) {
		value = aValue;
	}

	/**
	 * Access method for percentRetail.
	 *
	 * @return the current value of percentRetail
	 */
	public BigDecimal getPercentRetail() {
		return percentRetail;
	}

	/**
	 * Setter method for percentRetail.
	 *
	 * @param aPercentRetail the new value for percentRetail
	 */
	public void setPercentRetail(BigDecimal aPercentRetail) {
		percentRetail = aPercentRetail;
	}

	/**
	 * Access method for expenseMovies.
	 *
	 * @return the current value of expenseMovies
	 */
	public Set<ExpenseMovie> getExpenseMovies() {
		return expenseMovies;
	}

	/**
	 * Setter method for expenseMovies.
	 *
	 * @param aExpenseMovies the new value for expenseMovies
	 */
	public void setExpMovies(Set<ExpenseMovie> aExpenseMovies) {
		expenseMovies = aExpenseMovies;
	}

	/**
	 * Access method for inventory.
	 *
	 * @return the current value of inventory
	 */
	public Set<Inventory> getInventory() {
		return inventory;
	}

	/**
	 * Setter method for inventory.
	 *
	 * @param aInventory the new value for inventory
	 */
	public void setInventory(Set<Inventory> aInventory) {
		inventory = aInventory;
	}

	/**
	 * Compares the key for this instance with another Conditions.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Conditions and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Condition)) {
			return false;
		}
		Condition that = (Condition) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Conditions.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Condition))
			return false;
		return this.equalKeys(other) && ((Condition) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Conditions |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
