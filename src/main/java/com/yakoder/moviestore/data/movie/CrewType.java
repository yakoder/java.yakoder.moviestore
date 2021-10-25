// Generated with g9.

package com.yakoder.moviestore.data.movie;

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

@Entity(name = "crew_types")
public class CrewType extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7312539821260742497L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "crew_type_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "crew_type_name", nullable = false, length = 100)
	private String name;
	@Column(name = "crew_type_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "crewTypes")
	private Set<MovieCrew> movieCrew;

	/** Default constructor. */
	public CrewType() {
		super();
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
	 * @return True if other object is instance of class CrewTypes and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CrewType)) {
			return false;
		}
		CrewType that = (CrewType) other;
		if (this.getId() != that.getId()) {
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
		if (!(other instanceof CrewType))
			return false;
		return this.equalKeys(other) && ((CrewType) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[CrewTypes |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
