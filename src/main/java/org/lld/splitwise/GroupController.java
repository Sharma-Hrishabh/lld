package org.lld.splitwise;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    private List<Group> groups;

    public GroupController() {
        this.groups = new ArrayList<>();
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group){
        groups.add(group);
    }

    public void createGroup(int id,String name,String description,User createdBy){
        Group group = new Group();
        group.setId(id);
        group.setName(name);
        group.addUser(createdBy);
        //add the group in the list of overall groups
        groups.add(group);

    }
}
