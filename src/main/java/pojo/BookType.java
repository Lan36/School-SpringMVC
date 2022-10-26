package pojo;

/**
 * @Author:兰
 * @Date:2022/10/12/11:21
 */
public class BookType {
    private int typeId;
    private String typeName;

    public BookType(int typeId, String typeName) {
        this.setTypeId(typeId);
        this.setTypeName(typeName);
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
