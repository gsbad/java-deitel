package exceptions;


public class UsingExceptions {
    public static void main(String[] args) {
        try {
            System.out.println();
            throughException();
        } catch (Exception e) {
            System.err.println("Exception handled in main() apos o relançamento");
        }
        doNotthroughException();
    }

    private static void throughException() throws Exception{
        try{
            System.out.println("Method throughException ===========");
            throw new Exception(); //gera exceção
        } 
        catch (Exception e) {
            System.err.println("Exception handled in method throughException()");
            throw e; //relança para processamento adicional e é capturado pelo try...catch em main()
        }
        finally{ //executa independentemente do que ocorre em try...catch
            System.err.println("FINALLY: Executed in throwException");
        }
    }
    //Demonstra finally mesmo quando nenhuma exceção ocorre
    private static void doNotthroughException() {
        try{ //bloco nao lança uma exceção
            System.out.println("Method doNotthroughException ===========");
        } 
        catch (Exception e) { //nao executa
            System.err.println(e);
        }
        finally{
            System.out.println("FINALLY: End of method doesNotThrowException");
        }
    }
}
