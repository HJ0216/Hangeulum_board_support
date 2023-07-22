package board.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class FormQDTO {
	private String formQCate1;
	private String formQCate2;
	private String formQEmail1;
	private String formQEmail2;
	private String formQPhone1;
	private String formQPhone2;
	private String formQPhone3;
	private String formQContent;

}
