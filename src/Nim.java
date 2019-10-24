public class Nim {
	private String nim;
	
	public boolean checkNim(String nim){
		for (int i = 0; i < nim.length(); i++) {
			if(Character.isAlphabetic(nim.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		if(checkNim(nim) || nim.length() != 10){
			//bisa aja return error message
			return;
		}else{
			this.nim = nim;
		}
	}
	
	
}
