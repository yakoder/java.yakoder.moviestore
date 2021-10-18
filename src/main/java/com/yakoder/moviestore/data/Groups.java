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
    protected static final String PK = "grpId";

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
    private int grpId;
    @Column(name="grp_key", unique=true, nullable=false, length=10)
    private String grpKey;
    @Column(name="grp_name", length=100)
    private String grpName;
    @Column(name="grp_desc", length=255)
    private String grpDesc;
    @OneToMany(mappedBy="groups")
    private Set<ExternalIds> externalIds;

    /** Default constructor. */
    public Groups() {
        super();
    }

    /**
     * Access method for grpId.
     *
     * @return the current value of grpId
     */
    public int getGrpId() {
        return grpId;
    }

    /**
     * Setter method for grpId.
     *
     * @param aGrpId the new value for grpId
     */
    public void setGrpId(int aGrpId) {
        grpId = aGrpId;
    }

    /**
     * Access method for grpKey.
     *
     * @return the current value of grpKey
     */
    public String getGrpKey() {
        return grpKey;
    }

    /**
     * Setter method for grpKey.
     *
     * @param aGrpKey the new value for grpKey
     */
    public void setGrpKey(String aGrpKey) {
        grpKey = aGrpKey;
    }

    /**
     * Access method for grpName.
     *
     * @return the current value of grpName
     */
    public String getGrpName() {
        return grpName;
    }

    /**
     * Setter method for grpName.
     *
     * @param aGrpName the new value for grpName
     */
    public void setGrpName(String aGrpName) {
        grpName = aGrpName;
    }

    /**
     * Access method for grpDesc.
     *
     * @return the current value of grpDesc
     */
    public String getGrpDesc() {
        return grpDesc;
    }

    /**
     * Setter method for grpDesc.
     *
     * @param aGrpDesc the new value for grpDesc
     */
    public void setGrpDesc(String aGrpDesc) {
        grpDesc = aGrpDesc;
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
        if (this.getGrpId() != that.getGrpId()) {
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
        i = getGrpId();
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
        sb.append(" grpId=").append(getGrpId());
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
        ret.put("grpId", Integer.valueOf(getGrpId()));
        return ret;
    }

}
