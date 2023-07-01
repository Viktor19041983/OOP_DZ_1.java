package ru.gb.family_free;

import java.util.List;

public interface FamilyTree {
    public abstract List getParents();
    public abstract List getChildren();
    public abstract List getSubParents();

    public abstract List getSubChildren();
}
