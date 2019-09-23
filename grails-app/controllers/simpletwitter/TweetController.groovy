package simpletwitter

/** made a call from the service instead of the db

 */
/**
 * handles query from the services for all tweets
 */
class TweetController {
    def tweetService

    def index() {
        redirect action:"listAllTweets"
    }
    def create() {
    }
    def show() {
        tweetService.get()
//        [tweet:tweet]
    }
    def listAllTweets() {
        tweetService.list()
//        [tweet:tweet]
    }
    def deleteTweet() {
        tweetService.get(id)
        tweetService.delete()
    }
    def saveTweet() {
        def tweet = tweetService.save(params.message)
        [tweet:tweet]
    }

    def reTweet() {

    }
    def like() {

    }
    def save() {

    }
}
