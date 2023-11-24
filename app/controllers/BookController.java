package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import javax.sound.sampled.Control;
import java.net.http.HttpRequest;
import java.util.Set;

public class BookController extends Controller {
    @Inject
    FormFactory formFactory;
    public Result index(){
        Set<Book> books = Book.allBooks();
        return ok(Json.toJson(books));
    }
    public Result create(){
        return ok();
    }
    public Result save(Http.Request request){
        JsonNode form = request.body().asJson();
        Book.add(new Book(form.get("id").asInt(),form.get("title").asText(),form.get("price").asInt(),form.get("author").asText()));
        System.out.println();
        return ok(Json.toJson(Book.allBooks()));
    }
    public Result show(Integer id){
        return ok();
    }
    public Result edit(Integer id){
        return ok();
    }
    public Result update(){
        return ok();
    }
    public Result destroy(Integer id){
        return ok();
    }
}
