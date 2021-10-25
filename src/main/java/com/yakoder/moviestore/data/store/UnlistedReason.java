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

@Entity(name="unlisted_reasons")
public class UnlistedReason extends SimpleDefinition implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4676412118930428944L;

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="unlisted_reason_id", unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="unlisted_reason_name", nullable=false, length=100)
    private String name;
    @Column(name="unlisted_reason_desc", length=100)
    private String description;
    @OneToMany(mappedBy="unlistedReasons")
    private Set<StoreInventoryHistory> storeInvHistory;

    /** Default constructor. */
    public UnlistedReason() {
        super();
    }

    /**
     * Access method for storeInvHistory.
     *
     * @return the current value of storeInvHistory
     */
    public Set<StoreInventoryHistory> getStoreInvHistory() {
        return storeInvHistory;
    }

    /**
     * Setter method for storeInvHistory.
     *
     * @param aStoreInvHistory the new value for storeInvHistory
     */
    public void setStoreInvHistory(Set<StoreInventoryHistory> aStoreInvHistory) {
        storeInvHistory = aStoreInvHistory;
    }

    /**
     * Compares the key for this instance with another UnlistedReasons.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UnlistedReasons and the key objects are equal
     */
    protected boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UnlistedReason)) {
            return false;
        }
        UnlistedReason that = (UnlistedReason) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UnlistedReasons.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UnlistedReason)) return false;
        return this.equalKeys(other) && ((UnlistedReason)other).equalKeys(this);
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[UnlistedReasons |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

}
