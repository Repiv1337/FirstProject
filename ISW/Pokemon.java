


	
	 enum Type{
		 FIRE,
		 WATER,
		 Poisen;
	}
	
	public  class Pokemon{
		
		private String _name;
		Type _type;
		int ID;
		static int next; // static ermöglicht fortlaufendes zählen der ID
		Pokemon(String name,Type type) {
			
			this._name = name;
			this._type = type;
			ID = next;
			next++;
			
		}
		public String get_name() {
			return this._name;
		}
		public Type get_type() {
			return this._type;
		}
		public void set_name(String _name) { //this zeigt dem Compiler das es sich um die Instanz des Objektes geht
			this._name = _name;
			
		}
		public void set_Type(Type _type) {
			this._type = _type;
		}
		public void show() {
			System.out.println(this._name + " ist vom Typen " + _type);
		}
		public void dID() {
			System.out.println(this.ID);
		}
		public String toString() {
			return _name + " |  " +  _type.toString()+ " |  " + String.valueOf(ID); 
		}
	}




