// Generated with g9.

package com.yakoder.moviestore.data.store;

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
@Table(name = "exp_types", indexes = {
		@Index(name = "expTypesExpTypesExpTypeIdTableIdx", columnList = "exp_type_id,exp_detail_table_id"),
		@Index(name = "expTypesExpTypesExpTypeNameTableIdx", columnList = "exp_type_name,exp_detail_table_id") })
public class ExpenseType extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7483264164178313153L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exp_type_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "exp_type_name", nullable = false, length = 100)
	private String name;
	@Column(name = "exp_type_desc", length = 255)
	private String description;
	@Column(name = "exp_detail_table_id", nullable = false, precision = 10)
	private int expenseDetailTableId;
	@OneToMany(mappedBy = "expTypes")
	private Set<Expense> expenses;

	/** Default constructor. */
	public ExpenseType() {
		super();
	}

	/**
	 * Access method for expenseDetailTableId.
	 *
	 * @return the current value of expenseDetailTableId
	 */
	public int getExpenseDetailTableId() {
		return expenseDetailTableId;
	}

	/**
	 * Setter method for expenseDetailTableId.
	 *
	 * @param aExpenseDetailTableId the new value for expenseDetailTableId
	 */
	public void setExpenseDetailTableId(int aExpenseDetailTableId) {
		expenseDetailTableId = aExpenseDetailTableId;
	}

	/**
	 * Access method for expenses.
	 *
	 * @return the current value of expenses
	 */
	public Set<Expense> getExpenses() {
		return expenses;
	}

	/**
	 * Setter method for expenses.
	 *
	 * @param aExpenses the new value for expenses
	 */
	public void setExpenses(Set<Expense> aExpenses) {
		expenses = aExpenses;
	}

	/**
	 * Compares the key for this instance with another ExpenseTypes.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ExpenseTypes and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ExpenseType)) {
			return false;
		}
		ExpenseType that = (ExpenseType) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another ExpenseTypes.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ExpenseType))
			return false;
		return this.equalKeys(other) && ((ExpenseType) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ExpenseTypes |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
