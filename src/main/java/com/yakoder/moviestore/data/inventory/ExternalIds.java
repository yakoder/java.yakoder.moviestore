// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.store.StoreImportPrep;

@Entity
@Table(name="external_ids", indexes={@Index(name="external_ids_ext_id_name_IX", columnList="ext_id_name", unique=true), @Index(name="externalIdsExternalIdsGrpMovieIdIdx", columnList="grp_id,grp_movie_id")})
public class ExternalIds implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5650413945957224854L;

	/** Primary key. */
    protected static final String PK = "externalId";

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
    @Column(name="ext_id", unique=true, nullable=false, precision=10)
    private int externalId;
    @Column(name="ext_id_name", unique=true, nullable=false, length=100)
    private String externalIdName;
    @ManyToOne(optional=false)
    @JoinColumn(name="grp_id", nullable=false)
    private Groups groups;
    @ManyToOne(optional=false)
    @JoinColumn(name="grp_movie_id", nullable=false)
    private GroupMovies groupMovies;
    @ManyToOne(optional=false)
    @JoinColumn(name="inv_id", nullable=false)
    private Inventory inventory;
    @OneToOne(mappedBy="externalIds")
    private StoreImportPrep storeImportPrep;

    /** Default constructor. */
    public ExternalIds() {
        super();
    }

    /**
     * Access method for externalId.
     *
     * @return the current value of externalId
     */
    public int getExternalId() {
        return externalId;
    }

    /**
     * Setter method for externalId.
     *
     * @param aExternalId the new value for externalId
     */
    public void setExternalId(int aExternalId) {
        externalId = aExternalId;
    }

    /**
     * Access method for externalIdName.
     *
     * @return the current value of externalIdName
     */
    public String getExternalIdName() {
        return externalIdName;
    }

    /**
     * Setter method for externalIdName.
     *
     * @param aExternalIdName the new value for externalIdName
     */
    public void setExternalIdName(String aExternalIdName) {
        externalIdName = aExternalIdName;
    }

    /**
     * Access method for groups.
     *
     * @return the current value of groups
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * Setter method for groups.
     *
     * @param aGroups the new value for groups
     */
    public void setGroups(Groups aGroups) {
        groups = aGroups;
    }

    /**
     * Access method for groupMovies.
     *
     * @return the current value of groupMovies
     */
    public GroupMovies getGroupMovies() {
        return groupMovies;
    }

    /**
     * Setter method for groupMovies.
     *
     * @param aGroupMovies the new value for groupMovies
     */
    public void setGroupMovies(GroupMovies aGroupMovies) {
        groupMovies = aGroupMovies;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Inventory aInventory) {
        inventory = aInventory;
    }

    /**
     * Access method for storeImportPrep.
     *
     * @return the current value of storeImportPrep
     */
    public StoreImportPrep getStoreImportPrep() {
        return storeImportPrep;
    }

    /**
     * Setter method for storeImportPrep.
     *
     * @param aStoreImportPrep the new value for storeImportPrep
     */
    public void setStoreImportPrep(StoreImportPrep aStoreImportPrep) {
        storeImportPrep = aStoreImportPrep;
    }

    /**
     * Gets the group fragment groupId for member groups.
     *
     * @return Current value of the group fragment
     * @see Groups
     */
    public int getGroupsGroupId() {
        return (getGroups() == null ? null : getGroups().getGroupId());
    }

    /**
     * Sets the group fragment groupId from member groups.
     *
     * @param aGroupId New value for the group fragment
     * @see Groups
     */
    public void setGroupsGroupId(int aGroupId) {
        if (getGroups() != null) {
            getGroups().setGroupId(aGroupId);
        }
    }

    /**
     * Gets the group fragment groupMovieId for member groupMovies.
     *
     * @return Current value of the group fragment
     * @see GroupMovies
     */
    public int getGroupMoviesGroupMovieId() {
        return (getGroupMovies() == null ? null : getGroupMovies().getGroupMovieId());
    }

    /**
     * Sets the group fragment groupMovieId from member groupMovies.
     *
     * @param aGroupMovieId New value for the group fragment
     * @see GroupMovies
     */
    public void setGroupMoviesGroupMovieId(int aGroupMovieId) {
        if (getGroupMovies() != null) {
            getGroupMovies().setGroupMovieId(aGroupMovieId);
        }
    }

    /**
     * Compares the key for this instance with another ExternalIds.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExternalIds and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExternalIds)) {
            return false;
        }
        ExternalIds that = (ExternalIds) other;
        if (this.getExternalId() != that.getExternalId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExternalIds.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExternalIds)) return false;
        return this.equalKeys(other) && ((ExternalIds)other).equalKeys(this);
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
        i = getExternalId();
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
        StringBuffer sb = new StringBuffer("[ExternalIds |");
        sb.append(" externalId=").append(getExternalId());
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
        ret.put("externalId", Integer.valueOf(getExternalId()));
        return ret;
    }

}
