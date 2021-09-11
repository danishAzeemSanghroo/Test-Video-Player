interface VideoPlayer{
	void play(String fileName);
}
class Mp4Player implements VideoPlayer{

	public void play(String fileName){
	System.out.println("Play Mp4 file "+fileName);
	
	}
}
class AVIplayer implements VideoPlayer{

	public void play(String fileName){
	System.out.println("Play Avi file "+fileName);
	
	}
} 

class PlayerFactory{
	public VideoPlayer getVideoPlayer(String fileName){
		
		if(fileName.endsWith(".mp4"))
			return new Mp4Player();
		else if(fileName.endsWith(".avi"))
			return new AVIplayer();
		else 
			return null;
	}
	
}

class TestVideoPlayer{
	public static void main(String[] args){
	
	String fileName="Sample.avi";
	PlayerFactory factor=new PlayerFactory();
	VideoPlayer player=factor.getVideoPlayer(fileName);
		if(player != null){
		player.play(fileName);
		}
	}
}