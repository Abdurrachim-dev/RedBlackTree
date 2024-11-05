package com.example;


    class Node {
        private char key;
        private Node right;
        private Node left;
    
        // Constructor
        public Node(char key) {
            this.key = key;
            this.right = null;
            this.left = null;
        }
    
        // Setter untuk key
        public void setKey(char key) {
            this.key = key;
        }
    
        // Setter untuk right node
        public void setRight(Node right) {
            this.right = right;
        }
    
        // Setter untuk left node
        public void setLeft(Node left) {
            this.left = left;
        }
    
        // Getter untuk key
        public char getKey() {
            return this.key;
        }
    
        // Getter untuk right node
        public Node getRight() {
            return this.right;
        }
    
        // Getter untuk left node
        public Node getLeft() {
            return this.left;
        }
    }

