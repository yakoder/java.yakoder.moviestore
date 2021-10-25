// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
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

import com.yakoder.moviestore.data.SimpleDefinition;
import com.yakoder.moviestore.data.inventory.DataFormat;

@Entity
@Table(name = "apis", indexes = { @Index(name = "apisApisSiteIdTemplateIdx", columnList = "site_id,is_template"),
		@Index(name = "apisApisSiteIdNameUrlIdx", columnList = "site_id,api_name,api_url") })
public class Api extends SimpleDefinition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5933924708801803254L;

	/**
	 * The optimistic lock. Available via standard bean get/set operations.
	 */
	@Version
	@Column(name = "LOCK_FLAG")
	private Integer lockFlag;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "api_id", unique = true, nullable = false, precision = 10)
	private int id;
	@Column(name = "api_name", nullable = false, length = 100)
	private String name;
	@Column(name = "api_desc", length = 255)
	private String description;
	@Column(name = "api_url", nullable = false, length = 255)
	private String apiUrl;
	@Column(name = "is_template", nullable = false, length = 3)
	private boolean isTemplate;
	@Column(name = "api_docs")
	private byte[] apiDocs;
	@OneToMany(mappedBy = "apis")
	private Set<ApiCall> apiCalls;
	@OneToMany(mappedBy = "apis")
	private Set<ApiLimit> apiLimits;
	@OneToMany(mappedBy = "apis")
	private Set<ApiResponse> apiResponses;
	@OneToMany(mappedBy = "apis")
	private Set<ApiUser> apiUsers;
	@ManyToOne
	@JoinColumn(name = "api_base_url_id")
	private ApiBaseUrl apiBaseUrls;
	@ManyToOne(optional = false)
	@JoinColumn(name = "in_meth_id", nullable = false)
	private ApiMethod apiMethods;
	@ManyToOne(optional = false)
	@JoinColumn(name = "out_fmt_id", nullable = false)
	private DataFormat dataFormats;
	@ManyToOne(optional = false)
	@JoinColumn(name = "site_id", nullable = false)
	private Site sites;

	/** Default constructor. */
	public Api() {
		super();
	}

	/**
	 * Access method for apiUrl.
	 *
	 * @return the current value of apiUrl
	 */
	public String getApiUrl() {
		return apiUrl;
	}

	/**
	 * Setter method for apiUrl.
	 *
	 * @param aApiUrl the new value for apiUrl
	 */
	public void setApiUrl(String aApiUrl) {
		apiUrl = aApiUrl;
	}

	/**
	 * Access method for isTemplate.
	 *
	 * @return true if and only if isTemplate is currently true
	 */
	public boolean isIsTemplate() {
		return isTemplate;
	}

	/**
	 * Setter method for isTemplate.
	 *
	 * @param aIsTemplate the new value for isTemplate
	 */
	public void setIsTemplate(boolean aIsTemplate) {
		isTemplate = aIsTemplate;
	}

	/**
	 * Access method for apiDocs.
	 *
	 * @return the current value of apiDocs
	 */
	public byte[] getApiDocs() {
		return apiDocs;
	}

	/**
	 * Setter method for apiDocs.
	 *
	 * @param aApiDocs the new value for apiDocs
	 */
	public void setApiDocs(byte[] aApiDocs) {
		apiDocs = aApiDocs;
	}

	/**
	 * Access method for apiCalls.
	 *
	 * @return the current value of apiCalls
	 */
	public Set<ApiCall> getApiCalls() {
		return apiCalls;
	}

	/**
	 * Setter method for apiCalls.
	 *
	 * @param aApiCalls the new value for apiCalls
	 */
	public void setApiCalls(Set<ApiCall> aApiCalls) {
		apiCalls = aApiCalls;
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
	 * Access method for apiResponses.
	 *
	 * @return the current value of apiResponses
	 */
	public Set<ApiResponse> getApiResponses() {
		return apiResponses;
	}

	/**
	 * Setter method for apiResponses.
	 *
	 * @param aApiResponses the new value for apiResponses
	 */
	public void setApiResponses(Set<ApiResponse> aApiResponses) {
		apiResponses = aApiResponses;
	}

	/**
	 * Access method for apiUsers.
	 *
	 * @return the current value of apiUsers
	 */
	public Set<ApiUser> getApiUsers() {
		return apiUsers;
	}

	/**
	 * Setter method for apiUsers.
	 *
	 * @param aApiUsers the new value for apiUsers
	 */
	public void setApiUsers(Set<ApiUser> aApiUsers) {
		apiUsers = aApiUsers;
	}

	/**
	 * Access method for apiBaseUrls.
	 *
	 * @return the current value of apiBaseUrls
	 */
	public ApiBaseUrl getApiBaseUrls() {
		return apiBaseUrls;
	}

	/**
	 * Setter method for apiBaseUrls.
	 *
	 * @param aApiBaseUrls the new value for apiBaseUrls
	 */
	public void setApiBaseUrls(ApiBaseUrl aApiBaseUrls) {
		apiBaseUrls = aApiBaseUrls;
	}

	/**
	 * Access method for apiMethods.
	 *
	 * @return the current value of apiMethods
	 */
	public ApiMethod getApiMethods() {
		return apiMethods;
	}

	/**
	 * Setter method for apiMethods.
	 *
	 * @param aApiMethods the new value for apiMethods
	 */
	public void setApiMethods(ApiMethod aApiMethods) {
		apiMethods = aApiMethods;
	}

	/**
	 * Access method for dataFormats.
	 *
	 * @return the current value of dataFormats
	 */
	public DataFormat getDataFormats() {
		return dataFormats;
	}

	/**
	 * Setter method for dataFormats.
	 *
	 * @param aDataFormats the new value for dataFormats
	 */
	public void setDataFormats(DataFormat aDataFormats) {
		dataFormats = aDataFormats;
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
	 * Gets the group fragment siteId for member sites.
	 *
	 * @return Current value of the group fragment
	 * @see Site
	 */
	public int getSitesSiteId() {
		return (getSites() == null ? null : getSites().getSiteId());
	}

	/**
	 * Sets the group fragment siteId from member sites.
	 *
	 * @param aSiteId New value for the group fragment
	 * @see Site
	 */
	public void setSitesSiteId(int aSiteId) {
		if (getSites() != null) {
			getSites().setSiteId(aSiteId);
		}
	}

	/**
	 * Compares the key for this instance with another Apis.
	 *
	 * @param other The object to compare to
	 * @return True if other object is instance of class Apis and the key objects
	 *         are equal
	 */
	protected boolean equalKeys(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Api)) {
			return false;
		}
		Api that = (Api) other;
		if (this.getId() != that.getId()) {
			return false;
		}
		return true;
	}

	/**
	 * Compares this instance with another Apis.
	 *
	 * @param other The object to compare to
	 * @return True if the objects are the same
	 */
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Api))
			return false;
		return this.equalKeys(other) && ((Api) other).equalKeys(this);
	}

	/**
	 * Returns a debug-friendly String representation of this instance.
	 *
	 * @return String representation of this instance
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Apis |");
		sb.append(" id=").append(getId());
		sb.append("]");
		return sb.toString();
	}

}
