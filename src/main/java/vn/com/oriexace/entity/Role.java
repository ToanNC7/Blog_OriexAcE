package vn.com.oriexace.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * An authority (a security role) used by Spring Security.
 */
@Entity
@Table(name = "bl_role")
@Data
@EqualsAndHashCode(callSuper = false)
public class Role extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(length = 50)
    private String name;
}
