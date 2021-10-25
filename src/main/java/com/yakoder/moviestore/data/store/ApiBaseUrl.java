// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDefinition;

@Entity(name = "api_base_urls")
public class ApiBaseUrl extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 565817154351209517L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "api_base_url_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "api_base_url_name", nullable = false, length = 100)
	private String name;
	@Column(name = "api_base_url_url", nullable = false, length = 255)
	private String url;
	@Column(name = "api_base_url_desc", length = 255)
	private String description;
	@ManyToOne(optional = false)
	@JoinColumn(name = "site_id", nullable = false)
	private Site sites;
	@OneToMany(mappedBy = "apiBaseUrls")
	private Set<Api> apis;

	/** Default constructor. */
	public ApiBaseUrl() {
		super();
	}

	/**
	 * Access method for url.
	 *
	 * @return the current value of url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter method for url.
	 *
	 * @param aUrl the new value for url
	 */
	public void setUrl(String aUrl) {
		url = aUrl;
	}

	/**
	 * Access method for sites.
	 *
	 * @return the current value of sites
	 */
	public Site getSites() {
		return sites;
	}

	/**
	 * Setter method for sites.
	 *
	 * @param aSites the new value for sites
	 */
	public void setSites(Site aSites) {
		sites = aSites;
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
	 * Compares the key for this instance with another ApiBaseUrls.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class ApiBaseUrls and the key
	 *         objects are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ApiBaseUrl)) {
			return false;
		}
		ApiBaseUrl that = (ApiBaseUrl) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another ApiBaseUrls.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ApiBaseUrl))
			return false;
		return this.equalKeys(other) && ((ApiBaseUrl) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[ApiBaseUrls |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
