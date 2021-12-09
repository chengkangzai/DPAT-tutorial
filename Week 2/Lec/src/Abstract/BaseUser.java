package Abstract;

import Models.Permission;
import Models.Role;

import java.util.ArrayList;

public abstract class BaseUser extends BaseModel {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private ArrayList<Permission> permissions;
    private ArrayList<Role> roles;

    public BaseUser(String username, String password, String email, String phone, String address, ArrayList<Permission> permissions, ArrayList<Role> roles) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.permissions = permissions;
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public boolean can(Permission permission) {
        return this.permissions.contains(permission);
    }

    public boolean can(String permission) {
        return this.permissions.stream().anyMatch(p -> p.getName().equals(permission));
    }

    public boolean is(Role role) {
        return this.roles.contains(role);
    }

    public boolean is(String role) {
        return this.roles.stream().anyMatch(r -> r.getName().equals(role));
    }

}
