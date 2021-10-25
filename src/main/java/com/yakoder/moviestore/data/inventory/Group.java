// Generated with g9.

package com.yakoder.moviestore.data.inventory;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.SimpleDefinition;

@Entity
@Table(name="groups", indexes={@Index(name="groups_grp_key_IX", columnList="grp_key", unique=true)})
public class Group extends SimpleDefinition implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -712826684267011935L;

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="grp_id", unique=true, nullable=false, precision=10)
    private int id;
    @Column(name="grp_key", unique=true, nullable=false, length=10)
    private String key;
    @Column(name="grp_name", length=100)
    private String name;
    @Column(name="grp_desc", length=255)
    private String description;
    @OneToMany(mappedBy="groups")
    private Set<ExternalId> externalIds;

    /** Default constructor. */
    public Group() {
        super();
    }

    /**
     * Access method for key.
     *
     * @return the current value of key
     */
    public String getKey() {
        return key;
    }

    /**
     * Setter method for key.
     *
     * @param aKey the new value for key
     */
    public void setKey(String aKey) {
        key = aKey;
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
     * Compares the key for this instance with another Groups.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Groups and the key objects are equal
     */
	protected boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Group)) {
            return false;
        }
        Group that = (Group) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Groups.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Group)) return false;
        return this.equalKeys(other) && ((Group)other).equalKeys(this);
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Groups |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

}
