package no.uio.inf5750.Assignment1.model;

/**
 * Created by erlend on 08.09.2016.
 */
public class Message
{
    private int id;

    public Message()
    {
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

    private String content;

}