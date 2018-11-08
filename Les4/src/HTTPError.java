public enum  HTTPError {
    inputError(400,"input"),outputError(401,"output"),compError(402,"bad!"),secError(403,"sec"),notFound(404,"not found");

    private final int number;
    private final String name;


    HTTPError(int number,String name) {
        this.number = number;
        this.name = name;
    }

    public static HTTPError getError(int error){
        switch (error){
            case 400: return inputError;
            case 401: return outputError;
            case 402: return compError;
            case 403: return secError;
            case 404: return notFound;
            default:
                System.out.println("Error unknown!");
        }
        return null;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
