package simpletwitter

import grails.gorm.transactions.Transactional

@Transactional
class TweetService {
    def tweet = new Tweet()

    def get(id) {
        tweet.get()
    }
    def list = {
        tweet.list()
    }
    def show(id) {
        tweet.get(id)
    }
    def delete(id) {
        tweet.get()
        tweet.delete(id)
    }
    def save(tweet) {
        tweet.save()
    }

}
