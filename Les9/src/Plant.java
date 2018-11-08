public class Plant {
    private int size;
    private Color color;
    private Type type;
    public Plant(int size,String color,String type) throws ColorException, TypeException {
        Color c = StrToColor(color);
        Type t = StrToType(type);
        this.color = c;
        this.type = t;
        this.size = size;
    }
    private Color StrToColor(String color) throws ColorException{
        switch(color.toLowerCase()){
            case"green": return Color.Green;
            case"blue": return Color.Blue;
            case"red": return Color.Red;
            case"yellow": return Color.Yellow;
            default: throw new ColorException("Wrong color!(green,blue,yellow,red)");
        }
    }
    private Type StrToType(String type) throws TypeException{
        switch(type.toLowerCase()){
            case"tree": return Type.Tree;
            case"flower": return Type.Flower;
            case"bush": return Type.Bush;
            default: throw new TypeException("Wrong type!(tree,bush,flower)");
        }
    }

    @Override
    public String toString() {
        return "Size: " + this.size + ",\nColor: "+ this.color.toString() + ",\nType: " + this.type.toString() ;
    }
}
