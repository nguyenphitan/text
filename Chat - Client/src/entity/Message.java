package entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Message implements Serializable {
    private int id;
    private int roomId;
    private String content;
    private Timestamp sendTime;
    private User user;
    private Data data;

    public Message() {
    }

    public Message(int id, String content, Timestamp sendTime, User user) {
        this.id = id;
        this.content = content;
        this.sendTime = sendTime;
        this.user = user;
    }

    public Message(int id, int roomId, String content, Timestamp sendTime, User user) {
        this.id = id;
        this.roomId = roomId;
        this.content = content;
        this.sendTime = sendTime;
        this.user = user;
    }

    public Message(int id, int roomId, String content, Timestamp sendTime, User user, Data data) {
        this.id = id;
        this.roomId = roomId;
        this.content = content;
        this.sendTime = sendTime;
        this.user = user;
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    @Override
    public String toString(){
        return sendTime + "-" + user.getDisplayName() + ":" + content;
    }
}
