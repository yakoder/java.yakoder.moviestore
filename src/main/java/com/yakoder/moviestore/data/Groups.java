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
@Table(name="groups", indexes={@Index(name="groups_grp_key_IX", columnList="grp_key", unique=true)})
public class Groups implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -712826684267011935L;

	/** Primary key. */
    protected static final String PK = "groupId";

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
    @Column(name="grp_id", unique=true, nullable=false, precision=10)
    private int groupId;
    @Column(name="grp_key", unique=true, nullable=false, length=10)
    private String groupKey;
    @Column(name="grp_name", length=100)
    private String groupName;
    @Column(name="grp_desc", length=255)
    private String groupDesc;
    @OneToMany(mappedBy="groups")
    private Set<ExternalIds> externalIds;

    /** Default constructor. */
    public Groups() {
        super();
    }

    /**
     * Access method for groupId.
     *
     * @return the current value of groupId
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Setter method for groupId.
     *
     * @param aGroupId the new value for groupId
     */
    public void setGroupId(int aGroupId) {
        groupId = aGroupId;
    }

    /**
     * Access method for groupKey.
     *
     * @return the current value of groupKey
     */
    public String getGroupKey() {
        return groupKey;
    }

    /**
     * Setter method for groupKey.
     *
     * @param aGroupKey the new value for groupKey
     */
    public void setGroupKey(String aGroupKey) {
        groupKey = aGroupKey;
    }

    /**
     * Access method for groupName.
     *
     * @return the current value of groupName
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter method for groupName.
     *
     * @param aGroupName the new value for groupName
     */
    public void setGroupName(String aGroupName) {
        groupName = aGroupName;
    }

    /**
     * Access method for groupDesc.
     *
     * @return the current value of groupDesc
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * Setter method for groupDesc.
     *
     * @param aGroupDesc the new value for groupDesc
     */
    public void setGroupDesc(String aGroupDesc) {
        groupDesc = aGroupDesc;
    }

    /**
     * Access method for externalIds.
     *
     * @return the current value of externalIds
     */
    public Set<ExternalIds> getExternalIds() {
        return externalIds;
    }

    /**
     * Setter method for externalIds.
     *
     * @param aExternalIds the new value for externalIds
     */
    public void setExternalIds(Set<ExternalIds> aExternalIds) {
        externalIds = aExternalIds;
    }

    /**
     * Compares the key for this instance with another Groups.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Groups and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Groups)) {
            return false;
        }
        Groups that = (Groups) other;
        if (this.getGroupId() != that.getGroupId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Groups.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Groups)) return false;
        return this.equalKeys(other) && ((Groups)other).equalKeys(this);
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
        i = getGroupId();
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
        StringBuffer sb = new StringBuffer("[Groups |");
        sb.append(" groupId=").append(getGroupId());
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
        ret.put("groupId", Integer.valueOf(getGroupId()));
        return ret;
    }

}
