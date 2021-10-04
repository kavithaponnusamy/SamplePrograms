
public class StringReverse {
	public static void main(String args[]) {
		String line="My amma has a nice puppy like elephant and egale an ";
		String[] arr=line.split(" ");
		int length=line.length();
		String[] newarray=new String[length];
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-1;j++) {
			if(!arr[j].startsWith("a") || !arr[j].startsWith("e") || 
			!arr[j].startsWith("i") || !arr[j].startsWith("o") || 
			!arr[j].startsWith("u")){
				newarray[i]=arr[j];
			}else if(arr[j].startsWith("a")) {
				newarray[i]=arr[j];
			}else if(arr[j].startsWith("e")) {
				newarray[i]=arr[j];
			}else if(arr[j].startsWith("i")) {
				newarray[i]=arr[j];
			}else if(arr[j].startsWith("o")) {
				newarray[i]=arr[j];
			}else {
				newarray[i]=arr[j];
	}
		
	}
		}
		
	}
}
