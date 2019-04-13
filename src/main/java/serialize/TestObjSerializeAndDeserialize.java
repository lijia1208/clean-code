package serialize;


import example.clean.enums.CellStatusEnum;
import example.clean.model.Cell;

import java.io.*;
import java.text.MessageFormat;

/**
 * @author maimaivv
 * @description
 * @date 2019-04-07 08:31
 */
public class TestObjSerializeAndDeserialize {

    public static void main(String[] args) throws Exception {
        SerializePerson();
        Cell cell = DeserializePerson();
        System.out.println(MessageFormat.format("flagged={0}",
                cell.isFlagged()));
    }

    /**
     * MethodName: SerializePerson
     * Description: 序列化Person对象
     */
    private static void SerializePerson()  {
        Cell person = new Cell(CellStatusEnum.FLAGGED);

        ObjectOutputStream oo = null;
        try {
            oo = new ObjectOutputStream(new FileOutputStream(
                    new File("cell.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oo.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Person对象序列化成功！");
        try {
            oo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列Perons对象
     */
    private static Cell DeserializePerson() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("cell.txt")));
        Cell cell = (Cell) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return cell;
    }

}