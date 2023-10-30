package Hashing;

import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K, V> { //generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n - nodes
        private int N; //N - buckets
        private LinkedList<Node> buckets[]; //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
    }
}
