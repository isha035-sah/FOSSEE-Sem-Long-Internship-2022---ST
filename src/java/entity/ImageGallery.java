package com.example.TravlellerBlog.entity;
import org.apache.catalina.User;

import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "image_gallery")
public class ImageGallery {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "password", nullable = false, unique = true)
    private Long password;

    @Column(name = "Username", nullable = false)
    private String Username;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price",nullable = false, precision = 10, scale = 2)
    private double price;

    @Lob
    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
    private byte[] image;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    public ImageGallery() {}

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String name) {
        this.Username = Username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product [password=" + password + ", Username=" + Username + ", description=" + description + ", price=" + price + ", image="
                + Arrays.toString(image) + ", createDate=" + createDate + "]";
    }

}

