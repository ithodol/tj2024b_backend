package day13.example.controller;

import day13.example.model.dao.WaitingDao;
import day13.example.model.dto.WaitingDto;

public class WaitingController {

	// 싱글톤 만들기
	private WaitingController() {}
	private static WaitingController instance = new WaitingController();
	public static WaitingController getInstance() {return instance;}
	
	// 대기등록
	public boolean write(WaitingDto waitingDto) {
		boolean result = WaitingDao.getInstance().write(waitingDto);
		return result;
	} // write end
	
	
	// 대기현황 명단출력
	public WaitingDto[] printAll() {
		WaitingDto[] result = WaitingDao.getInstance().printAll();
		return result;
	} // printAll end
	
}
