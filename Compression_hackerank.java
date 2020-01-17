public class Compression_hackerank
{
    public static void main(String[] args)
    {
        String input = "aaabbcccc";
        input = input+""+"%";
        String output= "";
        char[] ch = new char[input.length()];
        int count = 0 ;
        for (int i = 0; i < input.length(); i++)
        {
            ch[i] = input.charAt(i);
        }

        for (int i = 0; i < input.length()-1; i++)
        {
            if(ch[i] == ch[i+1])
            {
                count++;
                continue;
            }
            if(ch[i] != ch[i+1])
            {
                output = output+""+ch[i];
                if(count !=0)
                {
                    output = output+""+Integer.toString(count+1);
                    count=0;
                }
            }
        }
        System.out.print(output);
    }
}
