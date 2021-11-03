package sn.mdk.articlewebservice.exceptions;

public class ArticleNotFoundException extends RuntimeException{
    public ArticleNotFoundException(String mesg){ super(mesg);}
}
