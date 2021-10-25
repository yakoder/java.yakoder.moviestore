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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="group_movies")
public class GroupMovies implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3519795635027207253L;

	/** Primary key. */
    protected static final String PK = "groupMovieId";

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
    @Column(name="grp_movie_id", unique=true, nullable=false, precision=10)
    private int groupMovieId;
    @Column(name="grp_id", nullable=false, precision=10)
    private int groupId;
    @Column(name="grp_movie_item_num", nullable=false, precision=10)
    private int groupMovieItemNum;
    @OneToMany(mappedBy="groupMovies")
    private Set<ExternalIds> externalIds;

    /** Default constructor. */
    public GroupMovies() {
        super();
    }

    /**
     * Access method for groupMovieId.
     *
     * @return the current value of groupMovieId
     */
    public int getGroupMovieId() {
        return groupMovieId;
    }

    /**
     * Setter method for groupMovieId.
     *
     * @param aGroupMovieId the new value for groupMovieId
     */
    public void setGroupMovieId(int aGroupMovieId) {
        groupMovieId = aGroupMovieId;
    }

    /**
     * Access method for groupId.
     *
     * @return the current value of groupId
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Setter method for groupId.
     *
     * @param aGroupId the new value for groupId
     */
    public void setGroupId(int aGroupId) {
        groupId = aGroupId;
    }

    /**
     * Access method for groupMovieItemNum.
     *
     * @return the current value of groupMovieItemNum
     */
    public int getGroupMovieItemNum() {
        return groupMovieItemNum;
    }

    /**
     * Setter method for groupMovieItemNum.
     *
     * @param aGroupMovieItemNum the new value for groupMovieItemNum
     */
    public void setGroupMovieItemNum(int aGroupMovieItemNum) {
        groupMovieItemNum = aGroupMovieItemNum;
    }

    /**
     * Access method for externalIds.
     *
     * @return the current value of externalIds
     */
    public Set<ExternalIds> getExternalIds() {
        return externalIds;
    }

    /**
     * Setter method for externalIds.
     *
     * @param aExternalIds the new value for externalIds
     */
    public void setExternalIds(Set<ExternalIds> aExternalIds) {
        externalIds = aExternalIds;
    }

    /**
     * Compares the key for this instance with another GroupMovies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class GroupMovies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof GroupMovies)) {
            return false;
        }
        GroupMovies that = (GroupMovies) other;
        if (this.getGroupMovieId() != that.getGroupMovieId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another GroupMovies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof GroupMovies)) return false;
        return this.equalKeys(other) && ((GroupMovies)other).equalKeys(this);
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
        i = getGroupMovieId();
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
        StringBuffer sb = new StringBuffer("[GroupMovies |");
        sb.append(" groupMovieId=").append(getGroupMovieId());
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
        ret.put("groupMovieId", Integer.valueOf(getGroupMovieId()));
        return ret;
    }

}
