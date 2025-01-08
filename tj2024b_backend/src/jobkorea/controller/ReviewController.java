package jobkorea.controller;

public class ReviewController {

	// 싱글톤
	private static ReviewController instance = new ReviewController();
	private ReviewController() {}
	public static ReviewController getInstance() {return instance;}
	
}
