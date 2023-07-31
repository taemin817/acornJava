package day10.others;

public class 김현수_AudioProgram {

	public static void main(String[] args) {
		김현수_Audio audio = new 김현수_Audio();
		audio.ShowAudioSpec();
		
		audio.selectModel("LG", "GramAudio", 500000);
		
		audio.ShowAudioSpec();
		
	}

}
