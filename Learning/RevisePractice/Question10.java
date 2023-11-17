package Learning.RevisePractice;

public class Question10 {

    public static void test(String str)
{
int check = 4;
if (check == str.length())
    {
        System.out.print(str.charAt(check -= 1) +",");
    }
else
    {
    System.out.print(str.charAt(0) +",");
    }
}

public static void main(String[] args) {
  test("four");
  test("tee");
}

}
