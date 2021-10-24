// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
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

@Entity
@Table(name="exp_types", indexes={@Index(name="expTypesExpTypesExpTypeIdTableIdx", columnList="exp_type_id,exp_detail_table_id"), @Index(name="expTypesExpTypesExpTypeNameTableIdx", columnList="exp_type_name,exp_detail_table_id")})
public class ExpenseTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7483264164178313153L;

	/** Primary key. */
    protected static final String PK = "expTypeId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="exp_type_id", unique=true, nullable=false, precision=10)
    private int expTypeId;
    @Column(name="exp_type_name", nullable=false, length=100)
    private String expTypeName;
    @Column(name="exp_type_desc", length=255)
    private String expTypeDesc;
    @Column(name="exp_detail_table_id", nullable=false, precision=10)
    private int expDetailTableId;
    @OneToMany(mappedBy="expTypes")
    private Set<Expenses> expenses;

    /** Default constructor. */
    public ExpenseTypes() {
        super();
    }

    /**
     * Access method for expTypeId.
     *
     * @return the current value of expTypeId
     */
    public int getExpTypeId() {
        return expTypeId;
    }

    /**
     * Setter method for expTypeId.
     *
     * @param aExpTypeId the new value for expTypeId
     */
    public void setExpTypeId(int aExpTypeId) {
        expTypeId = aExpTypeId;
    }

    /**
     * Access method for expTypeName.
     *
     * @return the current value of expTypeName
     */
    public String getExpTypeName() {
        return expTypeName;
    }

    /**
     * Setter method for expTypeName.
     *
     * @param aExpTypeName the new value for expTypeName
     */
    public void setExpTypeName(String aExpTypeName) {
        expTypeName = aExpTypeName;
    }

    /**
     * Access method for expTypeDesc.
     *
     * @return the current value of expTypeDesc
     */
    public String getExpTypeDesc() {
        return expTypeDesc;
    }

    /**
     * Setter method for expTypeDesc.
     *
     * @param aExpTypeDesc the new value for expTypeDesc
     */
    public void setExpTypeDesc(String aExpTypeDesc) {
        expTypeDesc = aExpTypeDesc;
    }

    /**
     * Access method for expDetailTableId.
     *
     * @return the current value of expDetailTableId
     */
    public int getExpDetailTableId() {
        return expDetailTableId;
    }

    /**
     * Setter method for expDetailTableId.
     *
     * @param aExpDetailTableId the new value for expDetailTableId
     */
    public void setExpDetailTableId(int aExpDetailTableId) {
        expDetailTableId = aExpDetailTableId;
    }

    /**
     * Access method for expenses.
     *
     * @return the current value of expenses
     */
    public Set<Expenses> getExpenses() {
        return expenses;
    }

    /**
     * Setter method for expenses.
     *
     * @param aExpenses the new value for expenses
     */
    public void setExpenses(Set<Expenses> aExpenses) {
        expenses = aExpenses;
    }

    /**
     * Compares the key for this instance with another ExpenseTypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpenseTypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpenseTypes)) {
            return false;
        }
        ExpenseTypes that = (ExpenseTypes) other;
        if (this.getExpTypeId() != that.getExpTypeId()) {
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
        if (!(other instanceof ExpenseTypes)) return false;
        return this.equalKeys(other) && ((ExpenseTypes)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getExpTypeId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[ExpenseTypes |");
        sb.append(" expTypeId=").append(getExpTypeId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("expTypeId", Integer.valueOf(getExpTypeId()));
        return ret;
    }

}
