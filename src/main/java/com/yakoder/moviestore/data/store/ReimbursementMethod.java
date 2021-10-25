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
@Table(name = "reimb_methods", indexes = {
		@Index(name = "reimbMethodsReimbursementMethodsReimbMethIdTableIdx", columnList = "reimb_meth_id,reimb_detail_table_id"),
		@Index(name = "reimbMethodsReimbursementMethodsReimbMethNameTableIdx", columnList = "reimb_meth_name,reimb_detail_table_id") })
public class ReimbursementMethod extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2709191631267125113L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reimb_meth_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "reimb_meth_name", nullable = false, length = 100)
	private String name;
	@Column(name = "reimb_meth_desc", length = 255)
	private String description;
	@Column(name = "reimb_detail_table_id", nullable = false, precision = 10)
	private int reimbursementDetailTableId;
	@OneToMany(mappedBy = "reimbMethods")
	private Set<Reimbursement> reimbursements;

	/** Default constructor. */
	public ReimbursementMethod() {
		super();
	}

	/**
	 * Access method for reimbursementDetailTableId.
	 *
	 * @return the current value of reimbursementDetailTableId
	 */
	public int getReimbursementDetailTableId() {
		return reimbursementDetailTableId;
	}

	/**
	 * Setter method for reimbursementDetailTableId.
	 *
	 * @param aReimbursementDetailTableId the new value for
	 *                                    reimbursementDetailTableId
	 */
	public void setReimbursementDetailTableId(int aReimbursementDetailTableId) {
		reimbursementDetailTableId = aReimbursementDetailTableId;
	}

	/**
	 * Access method for reimbursements.
	 *
	 * @return the current value of reimbursements
	 */
	public Set<Reimbursement> getReimbursements() {
		return reimbursements;
	}

	/**
	 * Setter method for reimbursements.
	 *
	 * @param aReimbursements the new value for reimbursements
	 */
	public void setReimbursements(Set<Reimbursement> aReimbursements) {
		reimbursements = aReimbursements;
	}

	/**
	 * Compares the key for this instance with another ReimbursementMethods.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ReimbursementMethods and
	 *         the key objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReimbursementMethod)) {
			return false;
		}
		ReimbursementMethod that = (ReimbursementMethod) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another ReimbursementMethods.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ReimbursementMethod))
			return false;
		return this.equalKeys(other) && ((ReimbursementMethod) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ReimbursementMethods |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
