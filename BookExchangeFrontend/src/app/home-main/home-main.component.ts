import { Component, OnInit } from "@angular/core";
import { Books } from "../books";
import { Book } from "../book";

@Component({
  selector: "app-home-main",
  templateUrl: "./home-main.component.html",
  styleUrls: ["./home-main.component.css"]
})
export class HomeMainComponent implements OnInit {
  bookList: Book[] = Books;
  constructor() {}

  ngOnInit() {}
}
