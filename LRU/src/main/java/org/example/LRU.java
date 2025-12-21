package org.example;

import java.util.HashMap;

public class LRU<K,V> {
    int cap = 5;
    int size;
    Node head;
    Node tail;
    HashMap<K,Node> entryMap;
    public LRU(){
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        entryMap = new HashMap<>();
        size=0;
    }

    public class Node<K,V> {
        K key;
        V value;
        public Node next;
        public Node prev;
        public Node(K k, V v){
            key = k;
            value = v;
        }
        public Node(){
            next=null;
            prev=null;
        }
    }

    public void addNode(Node node){
        // at the front
        Node front = head.next;
        head.next = node;
        node.prev = head;
        node.next = front;
        front.prev = node;
        entryMap.put((K) node.key,node);
    }

    public void evictBack(){
        evictNode(tail.prev);
    }

    public void evictNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        entryMap.remove(node.key);
    }

    public void put(K key, V value){

        if(entryMap.containsKey(key)){
            Node node = entryMap.get(key);
            evictNode(node);
            node.value = value;
            addNode(node);
            return;
        }


        if(size==cap) {
            evictBack();
            size--;
        }
        addNode(new Node(key,value));
        size++;
    }

    public V get(K key){
        if(!entryMap.containsKey(key)) return null;
        Node node = entryMap.get(key);
        evictNode(node);
        addNode(node);
        return (V) node.value;
    }

    public static void main(String[] args) {
        LRU<String,Integer> lruCache = new LRU<>();
        lruCache.put("a",1);
        lruCache.put("b",2);
        lruCache.put("c",3);
        lruCache.put("d",4);
        lruCache.put("e",5);
        lruCache.put("f",6);
        System.out.println(lruCache.get("e"));
        lruCache.put("x",7);
        System.out.println(lruCache.get("c"));
    }
}