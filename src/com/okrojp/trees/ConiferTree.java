package com.okrojp.trees;

import com.okrojp.Tree;
import com.okrojp.branch.Branch;
import com.okrojp.leaf.Leaf;
import com.okrojp.trunk.Trunk;

import java.util.List;
import java.util.logging.Logger;

public class ConiferTree extends Tree {

    private Logger log = Logger.getLogger(ConiferTree.class.getName());

    public ConiferTree(Trunk trunk, List<Leaf> leaf, List<Branch> branch) {
        super(trunk, leaf, branch);
    }

    @Override
    public void grow(int growingDays, double trunkIncreaseInMetersPerDay) {
        if (growingDays > 0 && trunkIncreaseInMetersPerDay > 0) {
            getTrunk().setLength(getTrunk().getLength() + ((growingDays * trunkIncreaseInMetersPerDay) / 2));
            getLeaf().forEach(leaf -> leaf.setLength(leaf.getLength() + ((growingDays * trunkIncreaseInMetersPerDay) / 8)));
            getBranch().forEach(branch -> branch.setLength(branch.getLength() + ((growingDays * trunkIncreaseInMetersPerDay) / 4)));

        } else log.warning("Variable was less than 1");
    }
}
