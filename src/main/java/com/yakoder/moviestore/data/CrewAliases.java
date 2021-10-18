// Generated with g9.

package com.yakoder.moviestore.data;

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
public class CrewAliases implements Serializable {

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
    private Crew crew2;
    @ManyToOne(optional=false)
    @JoinColumn(name="crew_id", nullable=false)
    private Crew crew;

    /** Default constructor. */
    public CrewAliases() {
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
     * Access method for crew2.
     *
     * @return the current value of crew2
     */
    public Crew getCrew2() {
        return crew2;
    }

    /**
     * Setter method for crew2.
     *
     * @param aCrew2 the new value for crew2
     */
    public void setCrew2(Crew aCrew2) {
        crew2 = aCrew2;
    }

    /**
     * Access method for crew.
     *
     * @return the current value of crew
     */
    public Crew getCrew() {
        return crew;
    }

    /**
     * Setter method for crew.
     *
     * @param aCrew the new value for crew
     */
    public void setCrew(Crew aCrew) {
        crew = aCrew;
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
        if (!(other instanceof CrewAliases)) {
            return false;
        }
        CrewAliases that = (CrewAliases) other;
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
        if (!(other instanceof CrewAliases)) return false;
        return this.equalKeys(other) && ((CrewAliases)other).equalKeys(this);
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
