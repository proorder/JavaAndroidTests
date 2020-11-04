import java.util.Arrays;

/**
* Метод "скидка". Применяет скидку discount к цене price, начиная с позиции
offset
* на количество позиций readLength. Новые цены округляем “вниз”,
* до меньшего целого числа.
* @param price - исходные цены.
* @param discount - % скидки, от 1 до 99.
* @param offset - номер позиции, с которой нужно применить скидку.
* @param readLength - количество позиций, к которым нужно применить скидку. * @return - массив новых цен.
*/
class Test2 {
  public static void main(String[] args) {
    int[] price = new int[] {5, 100, 20, 66, 16};
    int[] newPrice = decryptData(price, 50, 1, 3);
    System.out.println(Arrays.toString(newPrice));
  }
  public static int[] decryptData(int[] price,
		  int discount,
		  int offset,
		  int readLength) {
    int[] newPrice = Arrays.copyOfRange(price, offset, offset + readLength);
    System.out.println(Arrays.toString(newPrice));
    for (int i = 0; i < newPrice.length; i++) {
      newPrice[i] = newPrice[i] - (int) ((float) discount / 100 * newPrice[i]);
    }
    return newPrice;
  }
}
