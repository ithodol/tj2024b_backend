package jobkorea.model.dto;

public class ApplyDto {
	   private boolean apass;

	   public ApplyDto() {}
	   public boolean isApass() {
	      return apass;
	   }

	   public void setApass(boolean apass) {
	      this.apass = apass;
	   }
	   
	   @Override
	   public String toString() {
	      return "ApplyDto [apass=" + apass + "]";
	   }

	}
