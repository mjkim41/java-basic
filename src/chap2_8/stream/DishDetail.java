package chap2_8.stream;

import java.util.Objects;

public class DishDetail {
    private String name;
    private String typeName; // 이건 어떻게 값을 가져올 수 있냐?
                             // => DishType이라는 Enum에 typeName이라고 저장한 값
    public DishDetail() {
    }


    public DishDetail(String name, String typeName) {
        this.name = name;
        this.typeName = typeName;
    }

    public DishDetail(Dish dish) {
        this.name = dish.getName();
        this.typeName = dish.getType().getTypeName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "name='" + name + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishDetail that = (DishDetail) o;
        return Objects.equals(name, that.name) && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, typeName);
    }
}