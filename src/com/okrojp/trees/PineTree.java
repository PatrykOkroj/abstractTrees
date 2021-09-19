package com.okrojp.trees;

import com.okrojp.branch.Branch;
import com.okrojp.leaf.Leaf;
import com.okrojp.trunk.Trunk;

import java.util.List;

public class PineTree extends ConiferTree {
    public PineTree(Trunk trunk, List<Leaf> leaf, List<Branch> branch) {
        super(trunk, leaf, branch);
    }
}
