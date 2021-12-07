package api;

public enum StatusCode {
STATUS_CODE_200(200,"r"),
    STATUS_CODE_201(201,"Segment has been created successfully."),
    STATUS_CODE_400(400,"CustomerID is mandatory"),
    STATUS_CODE_404(404,"r"),
    STATUS_CODE_422(422,"Segment is not created");
    private final int code;
    private final String status;

    StatusCode(int code, String status) {
        this.code = code;
        this.status = status;
    }
    public int getCode(){
        return code;
    }
    public String getstatus(){
        return status;
    }
}
