// Write code for the shorten(String longPost) method.   
public class Twitterizer
{
    /**
     * Shortens and prints longPost by removing vowels
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten(String longPost) 
    {
        // YOUR CODE HERE
        String newString = "";
        int size = longPost.length();
        //System.out.println(size);
        for(int i = 0; i < size; i++) {
        	if(!"auioeAUIOE".contains(longPost.substring(i, i + 1))) {
        		newString = newString + longPost.substring(i, i + 1);
        	}
        }
        return newString;
    }
}
