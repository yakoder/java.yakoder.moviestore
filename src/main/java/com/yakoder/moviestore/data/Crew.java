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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="crew", indexes={@Index(name="crewCrewCrewNameLastFirstIdx", columnList="crew_name_last,crew_name_first")})
public class Crew implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5739856333392333512L;

	/** Primary key. */
    protected static final String PK = "crewId";

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
    @Column(name="crew_id", unique=true, nullable=false, precision=10)
    private int crewId;
    @Column(name="crew_name_full", nullable=false, length=255)
    private String crewNameFull;
    @Column(name="crew_name_last", length=100)
    private String crewNameLast;
    @Column(name="crew_name_first", length=100)
    private String crewNameFirst;
    @Column(name="crew_birth_year", precision=10)
    private int crewBirthYear;
    @Column(name="crew_death_year", precision=10)
    private int crewDeathYear;
    @Column(name="crew_is_deceased", nullable=false, length=3)
    private boolean crewIsDeceased;
    @Column(name="crew_is_alias", nullable=false, length=3)
    private boolean crewIsAlias;
    @Column(name="crew_has_aliases", nullable=false, length=3)
    private boolean crewHasAliases;
    @OneToMany(mappedBy="alias")
    private Set<CrewAliases> crewAliases;
    @OneToMany(mappedBy="primary")
    private Set<CrewAliases> primaryCrew;
    @ManyToOne(optional=false)
    @JoinColumn(name="crew_gender_id", nullable=false)
    private CrewGenders crewGenders;
    @OneToMany(mappedBy="crew")
    private Set<MovieCrew> movieCrew;

    /** Default constructor. */
    public Crew() {
        super();
    }

    /**
     * Access method for crewId.
     *
     * @return the current value of crewId
     */
    public int getCrewId() {
        return crewId;
    }

    /**
     * Setter method for crewId.
     *
     * @param aCrewId the new value for crewId
     */
    public void setCrewId(int aCrewId) {
        crewId = aCrewId;
    }

    /**
     * Access method for crewNameFull.
     *
     * @return the current value of crewNameFull
     */
    public String getCrewNameFull() {
        return crewNameFull;
    }

    /**
     * Setter method for crewNameFull.
     *
     * @param aCrewNameFull the new value for crewNameFull
     */
    public void setCrewNameFull(String aCrewNameFull) {
        crewNameFull = aCrewNameFull;
    }

    /**
     * Access method for crewNameLast.
     *
     * @return the current value of crewNameLast
     */
    public String getCrewNameLast() {
        return crewNameLast;
    }

    /**
     * Setter method for crewNameLast.
     *
     * @param aCrewNameLast the new value for crewNameLast
     */
    public void setCrewNameLast(String aCrewNameLast) {
        crewNameLast = aCrewNameLast;
    }

    /**
     * Access method for crewNameFirst.
     *
     * @return the current value of crewNameFirst
     */
    public String getCrewNameFirst() {
        return crewNameFirst;
    }

    /**
     * Setter method for crewNameFirst.
     *
     * @param aCrewNameFirst the new value for crewNameFirst
     */
    public void setCrewNameFirst(String aCrewNameFirst) {
        crewNameFirst = aCrewNameFirst;
    }

    /**
     * Access method for crewBirthYear.
     *
     * @return the current value of crewBirthYear
     */
    public int getCrewBirthYear() {
        return crewBirthYear;
    }

    /**
     * Setter method for crewBirthYear.
     *
     * @param aCrewBirthYear the new value for crewBirthYear
     */
    public void setCrewBirthYear(int aCrewBirthYear) {
        crewBirthYear = aCrewBirthYear;
    }

    /**
     * Access method for crewDeathYear.
     *
     * @return the current value of crewDeathYear
     */
    public int getCrewDeathYear() {
        return crewDeathYear;
    }

    /**
     * Setter method for crewDeathYear.
     *
     * @param aCrewDeathYear the new value for crewDeathYear
     */
    public void setCrewDeathYear(int aCrewDeathYear) {
        crewDeathYear = aCrewDeathYear;
    }

    /**
     * Access method for crewIsDeceased.
     *
     * @return true if and only if crewIsDeceased is currently true
     */
    public boolean isCrewIsDeceased() {
        return crewIsDeceased;
    }

    /**
     * Setter method for crewIsDeceased.
     *
     * @param aCrewIsDeceased the new value for crewIsDeceased
     */
    public void setCrewIsDeceased(boolean aCrewIsDeceased) {
        crewIsDeceased = aCrewIsDeceased;
    }

    /**
     * Access method for crewIsAlias.
     *
     * @return true if and only if crewIsAlias is currently true
     */
    public boolean isCrewIsAlias() {
        return crewIsAlias;
    }

    /**
     * Setter method for crewIsAlias.
     *
     * @param aCrewIsAlias the new value for crewIsAlias
     */
    public void setCrewIsAlias(boolean aCrewIsAlias) {
        crewIsAlias = aCrewIsAlias;
    }

    /**
     * Access method for crewHasAliases.
     *
     * @return true if and only if crewHasAliases is currently true
     */
    public boolean isCrewHasAliases() {
        return crewHasAliases;
    }

    /**
     * Setter method for crewHasAliases.
     *
     * @param aCrewHasAliases the new value for crewHasAliases
     */
    public void setCrewHasAliases(boolean aCrewHasAliases) {
        crewHasAliases = aCrewHasAliases;
    }

    /**
     * Access method for crewAliases.
     *
     * @return the current value of crewAliases
     */
    public Set<CrewAliases> getCrewAliases() {
        return crewAliases;
    }

    /**
     * Setter method for crewAliases.
     *
     * @param aCrewAliases the new value for crewAliases
     */
    public void setCrewAliases(Set<CrewAliases> aCrewAliases) {
        crewAliases = aCrewAliases;
    }

    /**
     * Access method for primaryCrew.
     *
     * @return the current value of primaryCrew
     */
    public Set<CrewAliases> getPrimaryCrew() {
        return primaryCrew;
    }

    /**
     * Setter method for primaryCrew.
     *
     * @param aPrimaryCrew the new value for primaryCrew
     */
    public void setPrimaryCrew(Set<CrewAliases> aPrimaryCrew) {
        primaryCrew = aPrimaryCrew;
    }

    /**
     * Access method for crewGenders.
     *
     * @return the current value of crewGenders
     */
    public CrewGenders getCrewGenders() {
        return crewGenders;
    }

    /**
     * Setter method for crewGenders.
     *
     * @param aCrewGenders the new value for crewGenders
     */
    public void setCrewGenders(CrewGenders aCrewGenders) {
        crewGenders = aCrewGenders;
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
     * Compares the key for this instance with another Crew.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Crew and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Crew)) {
            return false;
        }
        Crew that = (Crew) other;
        if (this.getCrewId() != that.getCrewId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Crew.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Crew)) return false;
        return this.equalKeys(other) && ((Crew)other).equalKeys(this);
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
        i = getCrewId();
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
        StringBuffer sb = new StringBuffer("[Crew |");
        sb.append(" crewId=").append(getCrewId());
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
        ret.put("crewId", Integer.valueOf(getCrewId()));
        return ret;
    }

}
