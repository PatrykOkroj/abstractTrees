package com.okrojp;

import com.okrojp.branch.Branch;
import com.okrojp.leaf.Leaf;
import com.okrojp.trunk.Trunk;

import java.util.List;

public abstract class Tree {
    private Trunk trunk;
    private List<Leaf> leaf;
    private List<Branch> branch;

    public Tree(Trunk trunk, List<Leaf> leaf, List<Branch> branch) {
        this.trunk = trunk;
        this.leaf = leaf;
        this.branch = branch;
    }

    public abstract void grow(int growingDays, double trunkIncreaseInMetersPerDay);

    public List<Leaf> getLeaf() {
        return leaf;
    }

    public void setLeaf(List<Leaf> leaf) {
        this.leaf = leaf;
    }


    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }

    public List<Branch> getBranch() {
        return branch;
    }

    public void setBranch(List<Branch> branch) {
        this.branch = branch;
    }
}
