package com.okami.apps.ej.bean;

public class Category {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_category.id
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_category.name
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_category.num
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ej_category.parent_id
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    private Long parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_category.id
     *
     * @return the value of ej_category.id
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_category.id
     *
     * @param id the value for ej_category.id
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_category.name
     *
     * @return the value of ej_category.name
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_category.name
     *
     * @param name the value for ej_category.name
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_category.num
     *
     * @return the value of ej_category.num
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_category.num
     *
     * @param num the value for ej_category.num
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ej_category.parent_id
     *
     * @return the value of ej_category.parent_id
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ej_category.parent_id
     *
     * @param parentId the value for ej_category.parent_id
     *
     * @mbg.generated Mon Jun 10 11:24:36 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}