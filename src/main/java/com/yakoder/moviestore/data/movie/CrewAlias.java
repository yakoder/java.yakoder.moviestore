// Generated with g9.

package com.yakoder.moviestore.data.movie;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="crew_aliases")
public class CrewAlias implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 405538921330864361L;

	/** Primary key. */
    protected static final String PK = "crewAliasId";

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
    @Column(name="crew_alias_id", unique=true, nullable=false, precision=10)
    private int crewAliasId;
    @ManyToOne(optional=false)
    @JoinColumn(name="alias_id", nullable=false)
    private Crew alias;
    @ManyToOne(optional=false)
    @JoinColumn(name="crew_id", nullable=false)
    private Crew primary;

    /** Default constructor. */
    public CrewAlias() {
        super();
    }

    /**
     * Access method for crewAliasId.
     *
     * @return the current value of crewAliasId
     */
    public int getCrewAliasId() {
        return crewAliasId;
    }

    /**
     * Setter method for crewAliasId.
     *
     * @param aCrewAliasId the new value for crewAliasId
     */
    public void setCrewAliasId(int aCrewAliasId) {
        crewAliasId = aCrewAliasId;
    }

    /**
     * Access method for alias.
     *
     * @return the current value of alias
     */
    public Crew getAlias() {
        return alias;
    }

    /**
     * Setter method for alias.
     *
     * @param aAlias the new value for alias
     */
    public void setAlias(Crew aAlias) {
        alias = aAlias;
    }

    /**
     * Access method for primary.
     *
     * @return the current value of primary
     */
    public Crew getPrimary() {
        return primary;
    }

    /**
     * Setter method for primary.
     *
     * @param aPrimary the new value for primary
     */
    public void setPrimary(Crew aPrimary) {
        primary = aPrimary;
    }

    /**
     * Compares the key for this instance with another CrewAliases.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CrewAliases and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CrewAlias)) {
            return false;
        }
        CrewAlias that = (CrewAlias) other;
        if (this.getCrewAliasId() != that.getCrewAliasId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CrewAliases.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CrewAlias)) return false;
        return this.equalKeys(other) && ((CrewAlias)other).equalKeys(this);
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
        i = getCrewAliasId();
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
        StringBuffer sb = new StringBuffer("[CrewAliases |");
        sb.append(" crewAliasId=").append(getCrewAliasId());
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
        ret.put("crewAliasId", Integer.valueOf(getCrewAliasId()));
        return ret;
    }

}
