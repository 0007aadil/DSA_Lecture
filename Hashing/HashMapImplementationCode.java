package Hashing;

import java.util.*;

public class HashMapImplementationCode {
    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private int N; // size of the array
        private LinkedList<Node>[] buckets; // Array of LinkedLists

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % N;
        }

        private int searchInLinkedList(K key, int bucketIdx) {
            LinkedList<Node> ll = buckets[bucketIdx];

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) { // Use equals() instead of ==
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            n = 0; // Reset count, as put() increments it

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Reinsert old elements
            for (LinkedList<Node> ll : oldBuckets) {
                for (Node node : ll) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);

            if (dataIdx != -1) {
                Node node = buckets[bucketIdx].get(dataIdx);
                node.value = value;
            } else {
                buckets[bucketIdx].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);
            return dataIdx != -1;
        }

        public V remove(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);

            if (dataIdx != -1) {
                Node node = buckets[bucketIdx].remove(dataIdx);
                n--;
                return node.value;
            }
            return null;
        }

        public V get(K key) {
            int bucketIdx = hashFunction(key);
            int dataIdx = searchInLinkedList(key, bucketIdx);

            if (dataIdx != -1) {
                Node node = buckets[bucketIdx].get(dataIdx);
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);  // Removed extra space
        hm.put("U.A.E", 123);
        hm.put("Japan", 96);
        hm.put("Pakistan", 23);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }
    }
}
