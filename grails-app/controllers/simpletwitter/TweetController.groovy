package simpletwitter

class TweetController {

    def index() {
        redirect "list"
    }
    def create() {

    }
    def show = {
        def tweet = Tweet.get(params.id)
        [tweet:tweet]
    }
    def list = {
        def tweet = Tweet.list()
        [tweet:tweet]
    }
    def delete = {
        def tweet = Tweet.get(params.id)
        tweet.delete()
    }
    def reTweet() {

    }
    def like() {

    }
    def save() {

    }
}
