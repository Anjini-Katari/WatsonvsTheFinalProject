public class Protagonist {
	protected String _name;
	protected String[] _pronouns;

	public Protagonist( String name, String[] pronouns ) {
        	_name = name;
		_pronouns = pronouns;
    	}

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    public String[] getPronouns() { return _pronouns; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
}
