# Касательно третьего задания. Рассчитываю на ваше понимание.
## В данный момент нет доступа к компьютеру с AndroidStudio, поэтому опишу процесс здесь:

##### В MainActivity, указанный в AndroidManifest, в методе onCreate обратимся к SharedPreferences. Так же следовало бы вывести следующий код в отдельный метод.
P.S. Необходимо выполнить метод написанный ниже только если аргумент метода onCreate типа Bundle равен null.

```java
SharedPreferences sh = getSharedPreferences("MyRefs", Context.MODE_PRIVATE);
if (sh.contains("countOfColdStart") && sh.getInt("countOfColdStart") > 1) {
	Random rand = new Random();
	String randomMessage = rand.nextInt(1) == 0 ? "Message" : "Another message";
	Toast toast = Toast.makeText(getApplicationContext(), randomMessage, Toast.LENGTH_SHORT); 
	toast.show(); 
} else {
	SharedPreferences.Editor editor = sh.edit();
    if (sh.contains("countOfColdStart")) {
    	editor.putInt("countOfColdStart", count + 1);
    } else {
    	editor.putInt("countOfColdStart", 1);
    }
    editor.commit();
}
```
