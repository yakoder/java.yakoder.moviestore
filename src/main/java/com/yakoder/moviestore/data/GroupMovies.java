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
    protected static final String PK = "grpMovieId";

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
    private int grpMovieId;
    @Column(name="grp_id", nullable=false, precision=10)
    private int grpId;
    @Column(name="grp_movie_item_num", nullable=false, precision=10)
    private int grpMovieItemNum;
    @OneToMany(mappedBy="groupMovies")
    private Set<ExternalIds> externalIds;

    /** Default constructor. */
    public GroupMovies() {
        super();
    }

    /**
     * Access method for grpMovieId.
     *
     * @return the current value of grpMovieId
     */
    public int getGrpMovieId() {
        return grpMovieId;
    }

    /**
     * Setter method for grpMovieId.
     *
     * @param aGrpMovieId the new value for grpMovieId
     */
    public void setGrpMovieId(int aGrpMovieId) {
        grpMovieId = aGrpMovieId;
    }

    /**
     * Access method for grpId.
     *
     * @return the current value of grpId
     */
    public int getGrpId() {
        return grpId;
    }

    /**
     * Setter method for grpId.
     *
     * @param aGrpId the new value for grpId
     */
    public void setGrpId(int aGrpId) {
        grpId = aGrpId;
    }

    /**
     * Access method for grpMovieItemNum.
     *
     * @return the current value of grpMovieItemNum
     */
    public int getGrpMovieItemNum() {
        return grpMovieItemNum;
    }

    /**
     * Setter method for grpMovieItemNum.
     *
     * @param aGrpMovieItemNum the new value for grpMovieItemNum
     */
    public void setGrpMovieItemNum(int aGrpMovieItemNum) {
        grpMovieItemNum = aGrpMovieItemNum;
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
        if (this.getGrpMovieId() != that.getGrpMovieId()) {
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
        i = getGrpMovieId();
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
        sb.append(" grpMovieId=").append(getGrpMovieId());
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
        ret.put("grpMovieId", Integer.valueOf(getGrpMovieId()));
        return ret;
    }

}
