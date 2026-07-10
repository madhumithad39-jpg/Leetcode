class LRUCache extends LinkedHashMap<Integer,Integer>{
    private int cap;
    public LRUCache(int capacity) {
        super(capacity,0.75F,true);
        cap=capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer>eldest){
        return size()>cap;
    }
    
    public int get(int key) {
        return super.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        super.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */