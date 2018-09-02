package org.mouthaan.netify.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The class Role Data Transfer Object.
 * Constructors, getters and setters are generated by Lombok
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto implements Comparable<RoleDto> {
    private Integer id;
    private String character;
    private Integer order;
    private ActorDto actor;
    private Integer movieId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleDto roleDto = (RoleDto) o;

        // Role equals if ids match
        if (getId() != null && roleDto.getId() != null) {
            if (getId().equals(roleDto.getId())) {
                return true;
            }
        }

        // Role equals if characters match
        if (getCharacter() != null && roleDto.getCharacter() != null) {
            if (getCharacter().equals(roleDto.getCharacter())) {
                return true;
            }
        }

        // Role equals if orders match
        if (getOrder() != null && roleDto.getOrder() != null) {
            if (getOrder().equals(roleDto.getOrder())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = getOrder() != null ? getOrder().hashCode() : 0;
//        result = 31 * result + (getCharacter() != null ? getCharacter().hashCode() : 0);
//        result = 31 * result + (getOrder() != null ? getOrder().hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(RoleDto o) {
        return this.getCharacter().compareTo(o.getCharacter());
    }
}
