package thisJava.chap19.sec02.exam04_watchservice;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WatchServiceExample extends Application {
	class WatchServiceThread extends Thread {
		@Override
		public void run() {
			try {
				WatchService watchService = FileSystems.getDefault().newWatchService();
				//Path directory = Paths.get("C:/Temp");
				Path directory = Paths.get("D:/temp/chap19");
				
				directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
						                         StandardWatchEventKinds.ENTRY_DELETE,
						                         StandardWatchEventKinds.ENTRY_MODIFY);
				while(true) {
					WatchKey watchKey = watchService.take();
					List<WatchEvent<?>> list = watchKey.pollEvents();
					for(WatchEvent watchEvent : list) {
						//이벤트 종류 얻기
						Kind kind = watchEvent.kind();
						//감지된 Path 얻기
						Path path = (Path)watchEvent.context();
						if(kind == StandardWatchEventKinds.ENTRY_CREATE) {
							//생성되었을 경우, 실행할 코드
							Platform.runLater(()->textArea.appendText("파일 생성됨 -> " + path.getFileName() + "\n"));
						} else if(kind == StandardWatchEventKinds.ENTRY_DELETE) {
							//삭제되었을 경우, 실행할 코드
							Platform.runLater(()->textArea.appendText("파일 삭제됨 -> " + path.getFileName() + "\n"));
						} else if(kind == StandardWatchEventKinds.ENTRY_MODIFY) {
							//변경되었을 경우, 실행할 코드
							Platform.runLater(()->textArea.appendText("파일 변경됨 -> " + path.getFileName() + "\n"));
						} else if(kind == StandardWatchEventKinds.OVERFLOW) {
						}
					}
					boolean valid = watchKey.reset();
					if(!valid) { break; }
				}
			} catch (Exception e) {}
		}
	}	
	
	TextArea textArea;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		textArea = new TextArea();
		textArea.setEditable(false);
		root.setCenter(textArea);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("WatchServiceExample");
		primaryStage.show();
		
		WatchServiceThread wst = new WatchServiceThread();
		wst.start();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}



//와치 서비스는 자바7에서 처음 소개된 것
//디렉토리 내부에서 파일 생성, 삭제, 수정 등의 내용 변화를 감지하는데 사용
//
//적용 예는 에디터 파일 편집 시, 에디터 바깥에서 파일 내용을 수정하게 되면
//파일 내용이 변경됐으니 파일을 다시 불러올 것인지 묻는 대화상자 띄우는 것














