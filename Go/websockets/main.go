package main

import (
	"io"
	"log"
	"net/http"
	"os"

	"golang.org/x/net/websocket"
)

func init() {
	log.SetFlags(log.Ltime | log.Ldate | log.Lshortfile)
}

func EchoServer(ws *websocket.Conn) {
	io.Copy(ws, ws)
}

func main() {
	log.Println("Starting server")

	http.Handle("/", http.FileServer(http.Dir("./web/")))

	http.Handle("/echo", websocket.Handler(EchoServer))

	if err := http.ListenAndServe(":"+os.Getenv("PORT"), nil); err != nil {
		log.Fatal("ListenAndServer", err)
	}

}
