// Generated with g9.

package com.yakoder.moviestore.data.movie;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="crew_genders")
public class CrewGender implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 435878759599598927L;

	/** Primary key. */
    protected static final String PK = "crewGenderCode";

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
    @Column(name="crew_gender_code", unique=true, nullable=false, length=1)
    private String crewGenderCode;
    @Column(name="crew_gender_name", nullable=false, length=100)
    private String crewGenderName;
    @OneToMany(mappedBy="crewGenders")
    private Set<Crew> crew;

    /** Default constructor. */
    public CrewGender() {
        super();
    }

    /**
     * Access method for crewGenderCode.
     *
     * @return the current value of crewGenderCode
     */
    public String getCrewGenderCode() {
        return crewGenderCode;
    }

    /**
     * Setter method for crewGenderCode.
     *
     * @param aCrewGenderCode the new value for crewGenderCode
     */
    public void setCrewGenderCode(String aCrewGenderCode) {
        crewGenderCode = aCrewGenderCode;
    }

    /**
     * Access method for crewGenderName.
     *
     * @return the current value of crewGenderName
     */
    public String getCrewGenderName() {
        return crewGenderName;
    }

    /**
     * Setter method for crewGenderName.
     *
     * @param aCrewGenderName the new value for crewGenderName
     */
    public void setCrewGenderName(String aCrewGenderName) {
        crewGenderName = aCrewGenderName;
    }

    /**
     * Access method for crew.
     *
     * @return the current value of crew
     */
    public Set<Crew> getCrew() {
        return crew;
    }

    /**
     * Setter method for crew.
     *
     * @param aCrew the new value for crew
     */
    public void setCrew(Set<Crew> aCrew) {
        crew = aCrew;
    }

    /**
     * Compares the key for this instance with another CrewGenders.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CrewGenders and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CrewGender)) {
            return false;
        }
        CrewGender that = (CrewGender) other;
        Object myCrewGenderCode = this.getCrewGenderCode();
        Object yourCrewGenderCode = that.getCrewGenderCode();
        if (myCrewGenderCode==null ? yourCrewGenderCode!=null : !myCrewGenderCode.equals(yourCrewGenderCode)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CrewGenders.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CrewGender)) return false;
        return this.equalKeys(other) && ((CrewGender)other).equalKeys(this);
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
        if (getCrewGenderCode() == null) {
            i = 0;
        } else {
            i = getCrewGenderCode().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[CrewGenders |");
        sb.append(" crewGenderCode=").append(getCrewGenderCode());
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
        ret.put("crewGenderCode", getCrewGenderCode());
        return ret;
    }

}
