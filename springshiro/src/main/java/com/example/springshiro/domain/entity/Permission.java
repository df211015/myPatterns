package com.example.springshiro.domain.entity;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Permission.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Permission.Permission
     *
     * @mbggenerated
     */
    private String permission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Permission.role_id
     *
     * @mbggenerated
     */
    private Integer role_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Permission.id
     *
     * @return the value of Permission.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Permission.id
     *
     * @param id the value for Permission.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Permission.Permission
     *
     * @return the value of Permission.Permission
     *
     * @mbggenerated
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Permission.Permission
     *
     * @param permission the value for Permission.Permission
     *
     * @mbggenerated
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Permission.role_id
     *
     * @return the value of Permission.role_id
     *
     * @mbggenerated
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Permission.role_id
     *
     * @param role_id the value for Permission.role_id
     *
     * @mbggenerated
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}