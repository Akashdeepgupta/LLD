package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example2_Video_Converter_System_gpt;

public class VideoConverterFacade {
    private VideoCodec videoCodec;
    private AudioCodec audioCodec;
    private VideoFile videoFile;

    public VideoConverterFacade(){
        this.videoCodec = new VideoCodec();
        this.audioCodec = new AudioCodec();
        this.videoFile = new VideoFile();
    }

    public void convertVideo(String srcFileName, String destFileName) {
        videoCodec.compress(srcFileName);
        audioCodec.compress(srcFileName);
        videoFile.convert(srcFileName, destFileName);
    }
}
