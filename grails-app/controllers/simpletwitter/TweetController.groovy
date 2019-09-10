package simpletwitter

/** made a call from the service instead of the db

 */
/**
 * handles query from the services for all tweets
 */
class TweetController {
    def TweetService

    def index() {
        redirect action:"listAllTweets"
    }
    def create() {
    }
    def show = {
        TweetService.get()
        [tweet:tweet]
    }
    def listAllTweets = {
        TweetService.list()
//        [tweet:tweet]
    }
    def deleteTweet = {
        TweetService.get(id)
        TweetService.delete()
    }
    def saveTweet = {
        TweetService.save(id)
    }
    def reTweet() {

    }
    def like() {

    }
    def save() {

    }
}
