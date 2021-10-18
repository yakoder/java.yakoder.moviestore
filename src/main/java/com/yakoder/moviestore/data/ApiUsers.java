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
@Table(name="api_users", indexes={@Index(name="apiUsersApiUsersApiIdEnabledIdx", columnList="api_id,is_enabled")})
public class ApiUsers implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8573510360043835132L;

	/** Primary key. */
    protected static final String PK = "apiUsrId";

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
    @Column(name="api_usr_id", unique=true, nullable=false, precision=10)
    private int apiUsrId;
    @Column(name="api_usr_username", nullable=false, length=100)
    private String apiUsrUsername;
    @Column(name="api_usr_email", length=255)
    private String apiUsrEmail;
    @Column(name="is_enabled", nullable=false, length=3)
    private boolean isEnabled;
    @ManyToOne(optional=false)
    @JoinColumn(name="api_id", nullable=false)
    private Apis apis;

    /** Default constructor. */
    public ApiUsers() {
        super();
    }

    /**
     * Access method for apiUsrId.
     *
     * @return the current value of apiUsrId
     */
    public int getApiUsrId() {
        return apiUsrId;
    }

    /**
     * Setter method for apiUsrId.
     *
     * @param aApiUsrId the new value for apiUsrId
     */
    public void setApiUsrId(int aApiUsrId) {
        apiUsrId = aApiUsrId;
    }

    /**
     * Access method for apiUsrUsername.
     *
     * @return the current value of apiUsrUsername
     */
    public String getApiUsrUsername() {
        return apiUsrUsername;
    }

    /**
     * Setter method for apiUsrUsername.
     *
     * @param aApiUsrUsername the new value for apiUsrUsername
     */
    public void setApiUsrUsername(String aApiUsrUsername) {
        apiUsrUsername = aApiUsrUsername;
    }

    /**
     * Access method for apiUsrEmail.
     *
     * @return the current value of apiUsrEmail
     */
    public String getApiUsrEmail() {
        return apiUsrEmail;
    }

    /**
     * Setter method for apiUsrEmail.
     *
     * @param aApiUsrEmail the new value for apiUsrEmail
     */
    public void setApiUsrEmail(String aApiUsrEmail) {
        apiUsrEmail = aApiUsrEmail;
    }

    /**
     * Access method for isEnabled.
     *
     * @return true if and only if isEnabled is currently true
     */
    public boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Setter method for isEnabled.
     *
     * @param aIsEnabled the new value for isEnabled
     */
    public void setIsEnabled(boolean aIsEnabled) {
        isEnabled = aIsEnabled;
    }

    /**
     * Access method for apis.
     *
     * @return the current value of apis
     */
    public Apis getApis() {
        return apis;
    }

    /**
     * Setter method for apis.
     *
     * @param aApis the new value for apis
     */
    public void setApis(Apis aApis) {
        apis = aApis;
    }

    /**
     * Gets the group fragment apiId for member apis.
     *
     * @return Current value of the group fragment
     * @see Apis
     */
    public int getApisApiId() {
        return (getApis() == null ? null : getApis().getApiId());
    }

    /**
     * Sets the group fragment apiId from member apis.
     *
     * @param aApiId New value for the group fragment
     * @see Apis
     */
    public void setApisApiId(int aApiId) {
        if (getApis() != null) {
            getApis().setApiId(aApiId);
        }
    }

    /**
     * Compares the key for this instance with another ApiUsers.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApiUsers and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApiUsers)) {
            return false;
        }
        ApiUsers that = (ApiUsers) other;
        if (this.getApiUsrId() != that.getApiUsrId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApiUsers.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApiUsers)) return false;
        return this.equalKeys(other) && ((ApiUsers)other).equalKeys(this);
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
        i = getApiUsrId();
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
        StringBuffer sb = new StringBuffer("[ApiUsers |");
        sb.append(" apiUsrId=").append(getApiUsrId());
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
        ret.put("apiUsrId", Integer.valueOf(getApiUsrId()));
        return ret;
    }

}
