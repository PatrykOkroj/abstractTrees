package com.okrojp;

import com.okrojp.branch.Branch;
import com.okrojp.leaf.Leaf;
import com.okrojp.leaf.LeafType;
import com.okrojp.trees.PineTree;
import com.okrojp.trunk.Trunk;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Trunk trunk = new Trunk(1.0);
        Leaf leaf = new Leaf("green", 0.01, LeafType.NEEDLES);
        Leaf leaf2 = new Leaf("green", 0.015, LeafType.NEEDLES);
        Branch branch = new Branch(1.0);

        List<Branch> branches = new ArrayList<>();
        List<Leaf> leaves = new ArrayList<>();

        leaves.add(leaf);
        leaves.add(leaf2);
        branches.add(branch);

        PineTree pineTree = new PineTree(trunk, leaves, branches);
        pineTree.grow(10, 0.01);

    }
}
