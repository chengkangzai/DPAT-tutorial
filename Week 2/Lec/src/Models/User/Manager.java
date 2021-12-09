package Models.User;

import Abstract.BaseUser;
import Models.Permission;
import Models.Role;

import java.util.ArrayList;

public class Manager extends BaseUser {

    public Manager(String username, String password, String email, String phone, String address, ArrayList<Permission> permissions, ArrayList<Role> roles) {
        super(username, password, email, phone, address, permissions, roles);
    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
