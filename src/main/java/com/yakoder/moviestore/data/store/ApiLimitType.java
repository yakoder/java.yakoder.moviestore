// Generated with g9.

package com.yakoder.moviestore.data.store;

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

@Entity(name = "api_limit_types")
public class ApiLimitType extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1248805752241193996L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "api_limit_type_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "api_limit_type_name", nullable = false, length = 100)
	private String name;
	@Column(name = "api_limit_type_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "apiLimitTypes")
	private Set<ApiLimit> apiLimits;

	/** Default constructor. */
	public ApiLimitType() {
		super();
	}

	/**
	 * Access method for apiLimits.
	 *
	 * @return the current value of apiLimits
	 */
	public Set<ApiLimit> getApiLimits() {
		return apiLimits;
	}

	/**
	 * Setter method for apiLimits.
	 *
	 * @param aApiLimits the new value for apiLimits
	 */
	public void setApiLimits(Set<ApiLimit> aApiLimits) {
		apiLimits = aApiLimits;
	}

	/**
	 * Compares the key for this instance with another ApiLimitTypes.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ApiLimitTypes and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiLimitType)) {
			return false;
		}
		ApiLimitType that = (ApiLimitType) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another ApiLimitTypes.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ApiLimitType))
			return false;
		return this.equalKeys(other) && ((ApiLimitType) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ApiLimitTypes |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
