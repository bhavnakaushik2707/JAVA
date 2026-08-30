public class StringBuilderTool {
    public String reverse(String text)
    {
        if(text== null)
            {
                return null;
        }
        StringBuilder sb=new StringBuilder(text);
        sb.reverse();
        return sb.toString();
    }

    public String repeat(String text,int count)
    {
        if(text==null){
              return null;
        }
        if(count<=0)
            {
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<count;i++){
            sb.append(text);
        }
        return sb.toString();
    }

    public String joinWords(String[]words,String separator)
    {
        if (words ==null)
            {
            return null;
        }

        if (separator== null) {
            separator = "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i =0; i <words.length; i++) {

            if (i >0)
                {
                sb.append(separator);
            }
            if (words[i] !=null)
                {
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
    public String removeCharacterAt(String text, int index)
    {
        if (text==null)
            {
                return null;
        }
        if(index<0||index>=text.length())
            {
            return text;
        }

        StringBuilder sb=new StringBuilder(text);
        sb.deleteCharAt(index);
        return sb.toString();
    }
    public String replaceCharacterAt(String text, int index, char replacement)
    {
        if(text==null)
            {
            return null;
        }
        if (index< 0||index >=text.length())
            {
            return text;
        }
        StringBuilder sb =new StringBuilder(text);
        sb.setCharAt(index, replacement);
        return sb.toString();
    }
    public String buildNumberedList(String[]items)
    {
        if(items ==null)
            {
            return null;
        }
        StringBuilder sb=new StringBuilder();
        for (int i =0; i <items.length; i++)
            {
            sb.append(i+1);
            sb.append(".");
            sb.append(items[i]);
            sb.append("\n");
            }
    return sb.toString();
    }
}