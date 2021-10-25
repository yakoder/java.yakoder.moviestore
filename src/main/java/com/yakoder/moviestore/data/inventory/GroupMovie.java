// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDataObject;

@Entity(name="group_movies")
public class GroupMovie extends SimpleDataObject implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3519795635027207253L;

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="grp_movie_id", unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="grp_id", nullable=false, precision=10)
    private int groupId;
    @Column(name="grp_movie_item_num", nullable=false, precision=10)
    private int groupMovieItemNum;
    @OneToMany(mappedBy="groupMovies")
    private Set<ExternalId> externalIds;

    /** Default constructor. */
    public GroupMovie() {
        super();
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
    public Set<ExternalId> getExternalIds() {
        return externalIds;
    }

    /**
     * Setter method for externalIds.
     *
     * @param aExternalIds the new value for externalIds
     */
    public void setExternalIds(Set<ExternalId> aExternalIds) {
        externalIds = aExternalIds;
    }

    /**
     * Compares the key for this instance with another GroupMovies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class GroupMovies and the key objects are equal
     */
	protected boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof GroupMovie)) {
            return false;
        }
        GroupMovie that = (GroupMovie) other;
        if (this.getId() != that.getId()) {
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
        if (!(other instanceof GroupMovie)) return false;
        return this.equalKeys(other) && ((GroupMovie)other).equalKeys(this);
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[GroupMovies |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

}
