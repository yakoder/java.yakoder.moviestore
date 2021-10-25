// Generated with g9.

package com.yakoder.moviestore.data.movie;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="crew_types")
public class CrewTypes implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7312539821260742497L;

	/** Primary key. */
    protected static final String PK = "crewTypeId";

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
    @Column(name="crew_type_id", unique=true, nullable=false, precision=10)
    private int crewTypeId;
    @Column(name="crew_type_name", nullable=false, length=100)
    private String crewTypeName;
    @Column(name="crew_type_desc", length=255)
    private String crewTypeDesc;
    @OneToMany(mappedBy="crewTypes")
    private Set<MovieCrew> movieCrew;

    /** Default constructor. */
    public CrewTypes() {
        super();
    }

    /**
     * Access method for crewTypeId.
     *
     * @return the current value of crewTypeId
     */
    public int getCrewTypeId() {
        return crewTypeId;
    }

    /**
     * Setter method for crewTypeId.
     *
     * @param aCrewTypeId the new value for crewTypeId
     */
    public void setCrewTypeId(int aCrewTypeId) {
        crewTypeId = aCrewTypeId;
    }

    /**
     * Access method for crewTypeName.
     *
     * @return the current value of crewTypeName
     */
    public String getCrewTypeName() {
        return crewTypeName;
    }

    /**
     * Setter method for crewTypeName.
     *
     * @param aCrewTypeName the new value for crewTypeName
     */
    public void setCrewTypeName(String aCrewTypeName) {
        crewTypeName = aCrewTypeName;
    }

    /**
     * Access method for crewTypeDesc.
     *
     * @return the current value of crewTypeDesc
     */
    public String getCrewTypeDesc() {
        return crewTypeDesc;
    }

    /**
     * Setter method for crewTypeDesc.
     *
     * @param aCrewTypeDesc the new value for crewTypeDesc
     */
    public void setCrewTypeDesc(String aCrewTypeDesc) {
        crewTypeDesc = aCrewTypeDesc;
    }

    /**
     * Access method for movieCrew.
     *
     * @return the current value of movieCrew
     */
    public Set<MovieCrew> getMovieCrew() {
        return movieCrew;
    }

    /**
     * Setter method for movieCrew.
     *
     * @param aMovieCrew the new value for movieCrew
     */
    public void setMovieCrew(Set<MovieCrew> aMovieCrew) {
        movieCrew = aMovieCrew;
    }

    /**
     * Compares the key for this instance with another CrewTypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CrewTypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CrewTypes)) {
            return false;
        }
        CrewTypes that = (CrewTypes) other;
        if (this.getCrewTypeId() != that.getCrewTypeId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CrewTypes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CrewTypes)) return false;
        return this.equalKeys(other) && ((CrewTypes)other).equalKeys(this);
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
        i = getCrewTypeId();
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
        StringBuffer sb = new StringBuffer("[CrewTypes |");
        sb.append(" crewTypeId=").append(getCrewTypeId());
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
        ret.put("crewTypeId", Integer.valueOf(getCrewTypeId()));
        return ret;
    }

}
