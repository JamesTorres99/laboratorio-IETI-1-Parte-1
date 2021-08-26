package edu.escuelaing.ieti.lab1.microservicio.data;

/**
 *
 */
public class User {
    private  String id;
    private  String name;
    private  String email;
    private  String lastName;
    private  String createdAt;


    /**
     * get field
     *
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * set field
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get field
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * set field
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field
     *
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * set field
     *
     * @param createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}