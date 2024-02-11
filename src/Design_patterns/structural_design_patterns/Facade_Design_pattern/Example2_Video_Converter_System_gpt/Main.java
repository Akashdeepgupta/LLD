package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example2_Video_Converter_System_gpt;

public class Main {
    public static void main(String[] args) {
        VideoConverterFacade converter = new VideoConverterFacade();
        String sourceVideo = "example.mp4";
        String destinationVideo = "converted.avi";
        converter.convertVideo(sourceVideo, destinationVideo);
    }
}
