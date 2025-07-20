package lk.hms.entity;

public enum RoomTypeLoad {
  
    Single(1),
    Double(2),
    Twin(3),
    Family(4),;
    private final int id;
    
    private RoomTypeLoad(int id){
        this.id=id;
    }
    public int getId(){
        return this .id;
    }
}

