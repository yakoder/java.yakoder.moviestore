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

@Entity(name = "api_methods")
public class ApiMethod extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -613279797965595224L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "api_meth_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "api_meth_name", nullable = false, length = 100)
	private String name;
	@Column(name = "api_meth_desc", length = 255)
	private String description;
	@OneToMany(mappedBy = "apiMethods")
	private Set<Api> apis;

	/** Default constructor. */
	public ApiMethod() {
		super();
	}

	/**
	 * Access method for apis.
	 *
	 * @return the current value of apis
	 */
	public Set<Api> getApis() {
		return apis;
	}

	/**
	 * Setter method for apis.
	 *
	 * @param aApis the new value for apis
	 */
	public void setApis(Set<Api> aApis) {
		apis = aApis;
	}

	/**
	 * Compares the key for this instance with another ApiMethods.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ApiMethods and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiMethod)) {
			return false;
		}
		ApiMethod that = (ApiMethod) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another ApiMethods.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ApiMethod))
			return false;
		return this.equalKeys(other) && ((ApiMethod) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ApiMethods |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
