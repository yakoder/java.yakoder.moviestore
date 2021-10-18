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
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="movie_crew", indexes={@Index(name="movieCrewMovieCrewCrewIdTypeIdx", columnList="crew_id,crew_type_id"), @Index(name="movieCrewMovieCrewMovieIdCrewTypeIdx", columnList="movie_id,crew_type_id"), @Index(name="movieCrewMovieCrewCrewIdStarIdx", columnList="crew_id,crew_is_star"), @Index(name="movieCrewMovieCrewMovieIdCrewStarIdx", columnList="movie_id,crew_is_star")})
public class MovieCrew implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4631367320990379951L;

	/** Primary key. */
    protected static final String PK = "movieCrewId";

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
    @Column(name="movie_crew_id", unique=true, nullable=false, precision=10)
    private int movieCrewId;
    @Column(name="crew_is_star", nullable=false, length=3)
    private boolean crewIsStar;
    @ManyToOne(optional=false)
    @JoinColumn(name="crew_id", nullable=false)
    private Crew crew;
    @ManyToOne(optional=false)
    @JoinColumn(name="crew_type_id", nullable=false)
    private CrewTypes crewTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="movie_id", nullable=false)
    private Movies movies;

    /** Default constructor. */
    public MovieCrew() {
        super();
    }

    /**
     * Access method for movieCrewId.
     *
     * @return the current value of movieCrewId
     */
    public int getMovieCrewId() {
        return movieCrewId;
    }

    /**
     * Setter method for movieCrewId.
     *
     * @param aMovieCrewId the new value for movieCrewId
     */
    public void setMovieCrewId(int aMovieCrewId) {
        movieCrewId = aMovieCrewId;
    }

    /**
     * Access method for crewIsStar.
     *
     * @return true if and only if crewIsStar is currently true
     */
    public boolean isCrewIsStar() {
        return crewIsStar;
    }

    /**
     * Setter method for crewIsStar.
     *
     * @param aCrewIsStar the new value for crewIsStar
     */
    public void setCrewIsStar(boolean aCrewIsStar) {
        crewIsStar = aCrewIsStar;
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
     * Access method for crewTypes.
     *
     * @return the current value of crewTypes
     */
    public CrewTypes getCrewTypes() {
        return crewTypes;
    }

    /**
     * Setter method for crewTypes.
     *
     * @param aCrewTypes the new value for crewTypes
     */
    public void setCrewTypes(CrewTypes aCrewTypes) {
        crewTypes = aCrewTypes;
    }

    /**
     * Access method for movies.
     *
     * @return the current value of movies
     */
    public Movies getMovies() {
        return movies;
    }

    /**
     * Setter method for movies.
     *
     * @param aMovies the new value for movies
     */
    public void setMovies(Movies aMovies) {
        movies = aMovies;
    }

    /**
     * Gets the group fragment crewId for member crew.
     *
     * @return Current value of the group fragment
     * @see Crew
     */
    public int getCrewCrewId() {
        return (getCrew() == null ? null : getCrew().getCrewId());
    }

    /**
     * Sets the group fragment crewId from member crew.
     *
     * @param aCrewId New value for the group fragment
     * @see Crew
     */
    public void setCrewCrewId(int aCrewId) {
        if (getCrew() != null) {
            getCrew().setCrewId(aCrewId);
        }
    }

    /**
     * Gets the group fragment crewTypeId for member crewTypes.
     *
     * @return Current value of the group fragment
     * @see CrewTypes
     */
    public int getCrewTypesCrewTypeId() {
        return (getCrewTypes() == null ? null : getCrewTypes().getCrewTypeId());
    }

    /**
     * Sets the group fragment crewTypeId from member crewTypes.
     *
     * @param aCrewTypeId New value for the group fragment
     * @see CrewTypes
     */
    public void setCrewTypesCrewTypeId(int aCrewTypeId) {
        if (getCrewTypes() != null) {
            getCrewTypes().setCrewTypeId(aCrewTypeId);
        }
    }

    /**
     * Gets the group fragment movieId for member movies.
     *
     * @return Current value of the group fragment
     * @see Movies
     */
    public int getMoviesMovieId() {
        return (getMovies() == null ? null : getMovies().getMovieId());
    }

    /**
     * Sets the group fragment movieId from member movies.
     *
     * @param aMovieId New value for the group fragment
     * @see Movies
     */
    public void setMoviesMovieId(int aMovieId) {
        if (getMovies() != null) {
            getMovies().setMovieId(aMovieId);
        }
    }

    /**
     * Compares the key for this instance with another MovieCrew.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MovieCrew and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MovieCrew)) {
            return false;
        }
        MovieCrew that = (MovieCrew) other;
        if (this.getMovieCrewId() != that.getMovieCrewId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MovieCrew.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MovieCrew)) return false;
        return this.equalKeys(other) && ((MovieCrew)other).equalKeys(this);
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
        i = getMovieCrewId();
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
        StringBuffer sb = new StringBuffer("[MovieCrew |");
        sb.append(" movieCrewId=").append(getMovieCrewId());
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
        ret.put("movieCrewId", Integer.valueOf(getMovieCrewId()));
        return ret;
    }

}
