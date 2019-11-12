package com.example.demo;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document(collection = "User")
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String _rid;
    
	private String _self;
    private String _etag;
    private String _attachments;
    private String _ts;
    
    public User() {
    }
    
    
    public User(String id,String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String get_rid() {
		return _rid;
	}

	public void set_rid(String _rid) {
		this._rid = _rid;
	}

	public String get_self() {
		return _self;
	}

	public void set_self(String _self) {
		this._self = _self;
	}

	public String get_etag() {
		return _etag;
	}

	public void set_etag(String _etag) {
		this._etag = _etag;
	}

	public String get_attachments() {
		return _attachments;
	}

	public void set_attachments(String _attachments) {
		this._attachments = _attachments;
	}

	public String get_ts() {
		return _ts;
	}

	public void set_ts(String _ts) {
		this._ts = _ts;
	}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
